package sofit.com.iqtest;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class level1 extends Activity {
    static boolean boolean1;
    String[] ANS;
    Button butNext;
    int count;
    Question currentQ;
    ArrayList<String> idsCheck;
    public SharedPreferences preferences;
    int qid;
    List<Question> quesList;
    RadioButton rda;
    RadioButton rdb;
    RadioButton rdc;
    int score;
    int selectedIndex;
    SharedPreferences sharedPreferences;
    Timer f48t;
    public int time;
    int total;
    TextView txtQuestion;
    public int val;
    Double value1;

    /* renamed from: satsumadroid.iq.test.intelligence.level1.1 */
    class C02621 extends TimerTask {
        private final /* synthetic */ int val$level;
        private final /* synthetic */ ProgressBar val$pb;

        /* renamed from: satsumadroid.iq.test.intelligence.level1.1.1 */
        class C02611 implements Runnable {
            private final /* synthetic */ int val$level;
            private final /* synthetic */ ProgressBar val$pb;

            C02611(ProgressBar progressBar, int i) {
                this.val$pb = progressBar;
                this.val$level = i;
            }

            public void run() {
                ((TextView) level1.this.findViewById(R.id.main_timer_text)).setText(String.valueOf(level1.this.time));
                this.val$pb.setProgress(level1.this.time);
                level1 access$0 = level1.this;
                access$0.time++;
                Intent intent1; ////Intent position changed from below
                Bundle b; ////Bundle position changed from below
                if (this.val$level == 1 && level1.this.time == 90 && !level1.boolean1) {
                    intent1 = new Intent(level1.this, ResultActivity.class);
                    b = new Bundle();
                    b.putInt("score", level1.this.score);
                    intent1.putExtras(b);
                    intent1.putExtra("level", 1);
                    level1.this.startActivity(intent1);
                    level1.this.finish();
                }
                if (this.val$level == 2 && level1.this.time == 80 && !level1.boolean1) {
                    intent1 = new Intent(level1.this, ResultActivity.class);
                    b = new Bundle();
                    b.putInt("score", level1.this.score);
                    intent1.putExtras(b);
                    System.out.println("scoreInTime" + level1.this.score);
                    intent1.putExtra("level", 2);
                    level1.this.startActivity(intent1);
                    level1.this.finish();
                }
                if (this.val$level == 3 && level1.this.time == 70 && !level1.boolean1) {
                    intent1 = new Intent(level1.this, ResultActivity.class);
                    b = new Bundle();
                    b.putInt("score", level1.this.score);
                    intent1.putExtras(b);
                    intent1.putExtra("level", 3);
                    level1.this.startActivity(intent1);
                    level1.this.finish();
                }
                if (this.val$level == 4 && level1.this.time == 60 && !level1.boolean1) {
                    intent1 = new Intent(level1.this, ResultActivity.class);
                    b = new Bundle();
                    b.putInt("score", level1.this.score);
                    intent1.putExtras(b);
                    intent1.putExtra("level", 4);
                    level1.this.startActivity(intent1);
                    level1.this.finish();
                }
                if (this.val$level == 5 && level1.this.time == 50 && !level1.boolean1) {
                    intent1 = new Intent(level1.this, ResultActivity.class);
                    b = new Bundle();
                    b.putInt("score", level1.this.score);
                    intent1.putExtras(b);
                    intent1.putExtra("level", 5);
                    level1.this.startActivity(intent1);
                    level1.this.finish();
                }
                if (this.val$level == 6 && level1.this.time == 40 && !level1.boolean1) {
                    intent1 = new Intent(level1.this, ResultActivity.class);
                    b = new Bundle();
                    b.putInt("score", level1.this.score);
                    intent1.putExtras(b);
                    intent1.putExtra("level", 6);
                    level1.this.startActivity(intent1);
                    level1.this.finish();
                }
                if (this.val$level == 7 && level1.this.time == 30 && !level1.boolean1) {
                    intent1 = new Intent(level1.this, ResultActivity.class);
                    b = new Bundle();
                    b.putInt("score", level1.this.score);
                    intent1.putExtras(b);
                    intent1.putExtra("level", 7);
                    level1.this.startActivity(intent1);
                    level1.this.finish();
                }
                if (this.val$level == 8 && level1.this.time == 20 && !level1.boolean1) {
                    intent1 = new Intent(level1.this, ResultActivity.class);
                    b = new Bundle();
                    b.putInt("score", level1.this.score);
                    intent1.putExtras(b);
                    intent1.putExtra("level", 8);
                    level1.this.startActivity(intent1);
                    level1.this.finish();
                }
                if (this.val$level == 9 && level1.this.time == 10 && !level1.boolean1) {
                    intent1 = new Intent(level1.this, ResultActivity.class);
                    b = new Bundle();
                    b.putInt("score", level1.this.score);
                    intent1.putExtras(b);
                    intent1.putExtra("level", 9);
                    level1.this.startActivity(intent1);
                    level1.this.finish();
                }
            }
        }

        C02621(ProgressBar progressBar, int i) {
            this.val$pb = progressBar;
            this.val$level = i;
        }

        public void run() {
            level1.this.runOnUiThread(new C02611(this.val$pb, this.val$level));
        }
    }

    /* renamed from: satsumadroid.iq.test.intelligence.level1.2 */
    class C02632 implements OnClickListener {
        private final /* synthetic */ int val$level;

        C02632(int i) {
            this.val$level = i;
        }

        public void onClick(View v) {
            RadioGroup grp = (RadioGroup) level1.this.findViewById(R.id.radioGroup1);
            RadioButton answer = (RadioButton) level1.this.findViewById(grp.getCheckedRadioButtonId());
            switch (grp.getCheckedRadioButtonId()) {
                case R.id.radio0:
                    level1.this.selectedIndex = 0;
                    break;
                case R.id.radio1:
                    level1.this.selectedIndex = 1;
                    break;
                case R.id.radio2:
                    level1.this.selectedIndex = 2;
                    break;
            }
//            Log.d("yourans", new StringBuilder(String.valueOf(level1.this.currentQ.getANSWER())).append(" ").append(answer.getText()).toString());
            level1 satsumadroid_iq_test_intelligence_level1;

            if (level1.this.currentQ.getANSWER().equals(level1.this.ANS[level1.this.selectedIndex])) {
                satsumadroid_iq_test_intelligence_level1 = level1.this;
                satsumadroid_iq_test_intelligence_level1.score++;
                Log.d("score", "Your score" + level1.this.score);
                System.out.println("score" + level1.this.score);
                Double.valueOf((((double) level1.this.score) / ((double) level1.this.total)) * 100.0d);
            }
            if (level1.this.count < 20) {
                satsumadroid_iq_test_intelligence_level1 = level1.this;
                satsumadroid_iq_test_intelligence_level1.count++;
                level1.this.qid = level1.this.RandomCheck();
                int x = 0;
                while (x < level1.this.idsCheck.size()) {
                    if (level1.this.qid == Integer.parseInt((String) level1.this.idsCheck.get(x))) {
                        level1.this.qid = level1.this.RandomCheck();
                        x = 0;
                    }
                    x++;
                }
                level1.this.idsCheck.add(String.valueOf(level1.this.qid));
                level1.this.currentQ = (Question) level1.this.quesList.get(level1.this.qid);
                level1.this.setQuestionView();
                return;
            }
            level1.boolean1 = true;
            Intent intent = new Intent(level1.this, ResultActivity.class);
            Bundle b = new Bundle();
            b.putInt("score", level1.this.score);
            b.putInt("level", this.val$level);
            System.out.println("scoreInNext" + level1.this.score);
            intent.putExtras(b);
            level1.this.startActivity(intent);
            level1.this.finish();
        }
    }

    public level1() {
        this.value1 = Double.valueOf(0.0d);
        this.ANS = new String[]{"A", "B", "C"};
        this.selectedIndex = 0;
        this.total = 20;
        this.idsCheck = new ArrayList();
        this.score = 0;
        this.count = 1;
        this.qid = 1;
        this.time = 0;
    }

    static {
        boolean1 = false;
    }

    private void SavePreferences(String key, String value) {
        this.preferences = PreferenceManager.getDefaultSharedPreferences(this);
        Editor editor = this.preferences.edit();
        editor.putString(key, value);
        editor.commit();
    }

    private String LoadPreferences(String name, String defl) {
        this.sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        return new String(this.sharedPreferences.getString(name, defl));
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        int level = getIntent().getIntExtra("level", 1);
        ProgressBar pb = (ProgressBar) findViewById(R.id.main_timer_bar);
        pb.setScaleY(2.5f);
        if (level == 1) {
            pb.setMax(90);
        }
        if (level == 2) {
            pb.setMax(80);
        }
        if (level == 3) {
            pb.setMax(70);
        }
        if (level == 4) {
            pb.setMax(60);
        }
        if (level == 5) {
            pb.setMax(50);
        }
        if (level == 6) {
            pb.setMax(40);
        }
        if (level == 7) {
            pb.setMax(30);
        }
        if (level == 8) {
            pb.setMax(20);
        }
        if (level == 9) {
            pb.setMax(10);
        }
        this.f48t = new Timer();
        this.f48t.scheduleAtFixedRate(new C02621(pb, level), 0, 1000);
        this.quesList = new DataBaseHelper(this).getAllQuestions();
        this.qid = RandomCheck();
        this.currentQ = (Question) this.quesList.get(this.qid);
        this.txtQuestion = (TextView) findViewById(R.id.textView1);
        this.rda = (RadioButton) findViewById(R.id.radio0);
        this.rdb = (RadioButton) findViewById(R.id.radio1);
        this.rdc = (RadioButton) findViewById(R.id.radio2);
        this.butNext = (Button) findViewById(R.id.button1);
        setQuestionView();
        this.butNext.setOnClickListener(new C02632(level));
        rda.setTextColor(Color.WHITE);
        rdb.setTextColor(Color.WHITE);
        rdc.setTextColor(Color.WHITE);

        rda.setTextSize(18f);
        rdb.setTextSize(18f);
        rdc.setTextSize(18f);
        //rda.setButtonTintMode(PorterDuff.Mode.LIGHTEN);
    }

//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_result, menu);
//        return true;
//    }

    public int RandomCheck() {
        return new Random().nextInt(199);
    }

    private void setQuestionView() {
        this.txtQuestion.setText(this.currentQ.getQUESTION());
        this.rda.setText(this.currentQ.getOPTA());
        this.rdb.setText(this.currentQ.getOPTB());
        this.rdc.setText(this.currentQ.getOPTC());
    }
}
