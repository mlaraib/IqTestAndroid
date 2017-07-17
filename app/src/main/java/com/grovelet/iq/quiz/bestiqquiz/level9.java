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

public class level9 extends Activity {
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

    /* renamed from: satsumadroid.iq.test.intelligence.level9.1 */
    class C02771 extends TimerTask {

        /* renamed from: satsumadroid.iq.test.intelligence.level9.1.1 */
        class C02761 implements Runnable {
            C02761() {
            }

            public void run() {
                ((TextView) level9.this.findViewById(R.id.main_timer_text)).setText(String.valueOf(level9.this.time));
                ((ProgressBar) level9.this.findViewById(R.id.main_timer_bar)).setProgress(level9.this.time);
                level9 access$0 = level9.this;
                access$0.time++;
                if (level9.this.time == 100 && !level9.this.boolean1) {
                    Intent intent1 = new Intent(level9.this, ResultActivity.class);
                    Bundle b = new Bundle();
                    b.putInt("score", level9.this.score);
                    intent1.putExtras(b);
                    level9.this.startActivity(intent1);
                    MainActivity.ads.showInterstitial(false);

                    level9.this.finish();
                }
            }
        }

        C02771() {
        }

        public void run() {
            level9.this.runOnUiThread(new C02761());
        }
    }

    /* renamed from: satsumadroid.iq.test.intelligence.level9.2 */
    class C02782 implements OnClickListener {
        C02782() {
        }

        public void onClick(View v) {
            System.out.println(level9.this.qid);
            RadioGroup grp = (RadioGroup) level9.this.findViewById(R.id.radioGroup1);
            RadioButton answer = (RadioButton) level9.this.findViewById(grp.getCheckedRadioButtonId());
            switch (grp.getCheckedRadioButtonId()) {
                case R.id.radio0:
                    level9.this.selectedIndex = 0;
                    break;
                case R.id.radio1:
                    level9.this.selectedIndex = 1;
                    break;
                case R.id.radio2:
                    level9.this.selectedIndex = 2;
                    break;
            }
            Log.d("yourans", new StringBuilder(String.valueOf(level9.this.currentQ.getANSWER())).append(" ").append(answer.getText()).toString());
            level9 satsumadroid_iq_test_intelligence_level9;
            if (level9.this.currentQ.getANSWER().equals(level9.this.ANS[level9.this.selectedIndex])) {
                satsumadroid_iq_test_intelligence_level9 = level9.this;
                satsumadroid_iq_test_intelligence_level9.score++;
                Log.d("score", "Your score" + level9.this.score);
                System.out.println("score" + level9.this.score);
                Double value1 = Double.valueOf((((double) level9.this.score) / ((double) level9.this.total)) * 100.0d);
                //Toast.makeText(level9.this.getApplicationContext(), "Button is clicked" + value1, 1).show();
                System.out.println("VALUE NO...." + value1);
            }
            if (level9.this.count < 20) {
                satsumadroid_iq_test_intelligence_level9 = level9.this;
                satsumadroid_iq_test_intelligence_level9.count++;
                Random random = new Random();
                for (int i = 0; i < 20; i++) {
                    level9.this.qid = random.nextInt(20);
                    level9.this.currentQ = (Question) level9.this.quesList.get(level9.this.qid);
                    level9.this.setQuestionView();
                }
                return;
            }
            level9.this.boolean1 = true;
            Intent intent = new Intent(level9.this, ResultActivity.class);
            Bundle b = new Bundle();
            b.putInt("score", level9.this.score);
            System.out.println("score" + level9.this.score);
            intent.putExtras(b);
            level9.this.startActivity(intent);
            MainActivity.ads.showInterstitial(false);

            level9.this.finish();
        }
    }

    public level9() {
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
        new Timer().scheduleAtFixedRate(new C02771(), 0, 1000);
        this.quesList = new DataBaseHelper(this).getAllQuestions();
        this.currentQ = (Question) this.quesList.get(this.qid);
        this.txtQuestion = (TextView) findViewById(R.id.textView1);
        this.rda = (RadioButton) findViewById(R.id.radio0);
        this.rdb = (RadioButton) findViewById(R.id.radio1);
        this.rdc = (RadioButton) findViewById(R.id.radio2);
        this.butNext = (Button) findViewById(R.id.button1);
        setQuestionView();
        this.butNext.setOnClickListener(new C02782());
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
