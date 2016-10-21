package sofit.com.iqtest;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class level8 extends Activity {
    String[] ANS;
    boolean boolean1;
    Button butNext;
    int count;
    Question currentQ;
    int qid;
    List<Question> quesList;
    RadioButton rda;
    RadioButton rdb;
    RadioButton rdc;
    int score;
    int selectedIndex;
    public int time;
    int total;
    TextView txtQuestion;
    public int val;
    Double value1;

    /* renamed from: satsumadroid.iq.test.intelligence.level8.1 */
    class C02741 extends TimerTask {

        /* renamed from: satsumadroid.iq.test.intelligence.level8.1.1 */
        class C02731 implements Runnable {
            C02731() {
            }

            public void run() {
                ((TextView) level8.this.findViewById(R.id.main_timer_text)).setText(String.valueOf(level8.this.time));
                ((ProgressBar) level8.this.findViewById(R.id.main_timer_bar)).setProgress(level8.this.time);
                level8 access$0 = level8.this;
                access$0.time++;
                if (level8.this.time == 110 && !level8.this.boolean1) {
                    Intent intent1 = new Intent(level8.this, ResultActivity.class);
                    Bundle b = new Bundle();
                    b.putInt("score", level8.this.score);
                    intent1.putExtras(b);
                    level8.this.startActivity(intent1);
                    level8.this.finish();
                }
            }
        }

        C02741() {
        }

        public void run() {
            level8.this.runOnUiThread(new C02731());
        }
    }

    /* renamed from: satsumadroid.iq.test.intelligence.level8.2 */
    class C02752 implements OnClickListener {
        C02752() {
        }

        public void onClick(View v) {
            System.out.println(level8.this.qid);
            RadioGroup grp = (RadioGroup) level8.this.findViewById(R.id.radioGroup1);
            RadioButton answer = (RadioButton) level8.this.findViewById(grp.getCheckedRadioButtonId());
            switch (grp.getCheckedRadioButtonId()) {
                case R.id.radio0:
                    level8.this.selectedIndex = 0;
                    break;
                case R.id.radio1:
                    level8.this.selectedIndex = 1;
                    break;
                case R.id.radio2:
                    level8.this.selectedIndex = 2;
                    break;
            }
            Log.d("yourans", new StringBuilder(String.valueOf(level8.this.currentQ.getANSWER())).append(" ").append(answer.getText()).toString());
            level8 satsumadroid_iq_test_intelligence_level8;
            if (level8.this.currentQ.getANSWER().equals(level8.this.ANS[level8.this.selectedIndex])) {
                satsumadroid_iq_test_intelligence_level8 = level8.this;
                satsumadroid_iq_test_intelligence_level8.score++;
                Log.d("score", "Your score" + level8.this.score);
                System.out.println("score" + level8.this.score);
                Double value1 = Double.valueOf((((double) level8.this.score) / ((double) level8.this.total)) * 100.0d);
                //Toast.makeText(level8.this.getApplicationContext(), "Button is clicked" + value1, 1).show();
                System.out.println("VALUE NO...." + value1);
            }
            if (level8.this.count < 20) {
                satsumadroid_iq_test_intelligence_level8 = level8.this;
                satsumadroid_iq_test_intelligence_level8.count++;
                Random random = new Random();
                for (int i = 0; i < 20; i++) {
                    level8.this.qid = random.nextInt(20);
                    level8.this.currentQ = (Question) level8.this.quesList.get(level8.this.qid);
                    level8.this.setQuestionView();
                }
                return;
            }
            level8.this.boolean1 = true;
            Intent intent = new Intent(level8.this, ResultActivity.class);
            Bundle b = new Bundle();
            b.putInt("score", level8.this.score);
            System.out.println("score" + level8.this.score);
            intent.putExtras(b);
            level8.this.startActivity(intent);
            level8.this.finish();
        }
    }

    public level8() {
        this.value1 = Double.valueOf(0.0d);
        this.ANS = new String[]{"A", "B", "C"};
        this.selectedIndex = 0;
        this.total = 20;
        this.score = 0;
        this.count = 1;
        this.boolean1 = false;
        this.qid = 1;
        this.time = 0;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        new Timer().scheduleAtFixedRate(new C02741(), 0, 1000);
        this.quesList = new DataBaseHelper(this).getAllQuestions();
        this.currentQ = (Question) this.quesList.get(this.qid);
        this.txtQuestion = (TextView) findViewById(R.id.textView1);
        this.rda = (RadioButton) findViewById(R.id.radio0);
        this.rdb = (RadioButton) findViewById(R.id.radio1);
        this.rdc = (RadioButton) findViewById(R.id.radio2);
        this.butNext = (Button) findViewById(R.id.button1);
        setQuestionView();
        this.butNext.setOnClickListener(new C02752());
        rda.setTextColor(Color.WHITE);
        rdb.setTextColor(Color.WHITE);
        rdc.setTextColor(Color.WHITE);

        rda.setTextSize(18f);
        rdb.setTextSize(18f);
        rdc.setTextSize(18f);
    }

//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_result, menu);
//        return true;
//    }

    private void setQuestionView() {
        this.txtQuestion.setText(this.currentQ.getQUESTION());
        this.rda.setText(this.currentQ.getOPTA());
        this.rdb.setText(this.currentQ.getOPTB());
        this.rdc.setText(this.currentQ.getOPTC());
    }
}
