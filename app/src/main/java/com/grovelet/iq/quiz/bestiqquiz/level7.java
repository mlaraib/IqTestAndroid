package com.grovelet.iq.quiz.bestiqquiz;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import com.grovelet.iq.quiz.bestiqquiz.R;

public class level7 extends Activity {
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

    /* renamed from: satsumadroid.iq.test.intelligence.level7.1 */
    class C02711 extends TimerTask {

        /* renamed from: satsumadroid.iq.test.intelligence.level7.1.1 */
        class C02701 implements Runnable {
            C02701() {
            }

            public void run() {
                ((TextView) level7.this.findViewById(R.id.main_timer_text)).setText(String.valueOf(level7.this.time));
                ((ProgressBar) level7.this.findViewById(R.id.main_timer_bar)).setProgress(level7.this.time);
                level7 access$0 = level7.this;
                access$0.time++;
                if (level7.this.time == 120 && !level7.this.boolean1) {
                    Intent intent1 = new Intent(level7.this, ResultActivity.class);
                    Bundle b = new Bundle();
                    b.putInt("score", level7.this.score);
                    intent1.putExtras(b);
                    level7.this.startActivity(intent1);
                    MainActivity.ads.showInterstitial(false);

                    level7.this.finish();
                }
            }
        }

        C02711() {
        }

        public void run() {
            level7.this.runOnUiThread(new C02701());
        }
    }

    /* renamed from: satsumadroid.iq.test.intelligence.level7.2 */
    class C02722 implements OnClickListener {
        C02722() {
        }

        public void onClick(View v) {
            System.out.println(level7.this.qid);
            RadioGroup grp = (RadioGroup) level7.this.findViewById(R.id.radioGroup1);
            RadioButton answer = (RadioButton) level7.this.findViewById(grp.getCheckedRadioButtonId());
            switch (grp.getCheckedRadioButtonId()) {
                case R.id.radio0:
                    level7.this.selectedIndex = 0;
                    break;
                case R.id.radio1:
                    level7.this.selectedIndex = 1;
                    break;
                case R.id.radio2:
                    level7.this.selectedIndex = 2;
                    break;
            }
            Log.d("yourans", new StringBuilder(String.valueOf(level7.this.currentQ.getANSWER())).append(" ").append(answer.getText()).toString());
            level7 satsumadroid_iq_test_intelligence_level7;
            if (level7.this.currentQ.getANSWER().equals(level7.this.ANS[level7.this.selectedIndex])) {
                satsumadroid_iq_test_intelligence_level7 = level7.this;
                satsumadroid_iq_test_intelligence_level7.score++;
                Log.d("score", "Your score" + level7.this.score);
                System.out.println("score" + level7.this.score);
                Double value1 = Double.valueOf((((double) level7.this.score) / ((double) level7.this.total)) * 100.0d);
                //Toast.makeText(level7.this.getApplicationContext(), "Button is clicked" + value1, 1).show();
                System.out.println("VALUE NO...." + value1);
            }
            if (level7.this.count < 20) {
                satsumadroid_iq_test_intelligence_level7 = level7.this;
                satsumadroid_iq_test_intelligence_level7.count++;
                Random random = new Random();
                for (int i = 0; i < 20; i++) {
                    level7.this.qid = random.nextInt(20);
                    level7.this.currentQ = (Question) level7.this.quesList.get(level7.this.qid);
                    level7.this.setQuestionView();
                }
                return;
            }
            level7.this.boolean1 = true;
            Intent intent = new Intent(level7.this, ResultActivity.class);
            Bundle b = new Bundle();
            b.putInt("score", level7.this.score);
            System.out.println("score" + level7.this.score);
            intent.putExtras(b);
            level7.this.startActivity(intent);
            MainActivity.ads.showInterstitial(false);

            level7.this.finish();
        }
    }

    public level7() {
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
        new Timer().scheduleAtFixedRate(new C02711(), 0, 1000);
        this.quesList = new DataBaseHelper(this).getAllQuestions();
        this.currentQ = (Question) this.quesList.get(this.qid);
        this.txtQuestion = (TextView) findViewById(R.id.textView1);
        this.rda = (RadioButton) findViewById(R.id.radio0);
        this.rdb = (RadioButton) findViewById(R.id.radio1);
        this.rdc = (RadioButton) findViewById(R.id.radio2);
        this.butNext = (Button) findViewById(R.id.button1);
        setQuestionView();
        this.butNext.setOnClickListener(new C02722());
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
