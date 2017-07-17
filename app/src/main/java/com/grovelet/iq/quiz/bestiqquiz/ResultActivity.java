package com.grovelet.iq.quiz.bestiqquiz;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;

import com.grovelet.iq.quiz.bestiqquiz.R;


public class ResultActivity extends Activity {
    public SharedPreferences preferences;
    SharedPreferences sharedPreferences;

    /* renamed from: satsumadroid.iq.test.intelligence.ResultActivity.1 */
    class C02571 implements OnClickListener {
        C02571() {
        }

        public void onClick(DialogInterface dialog, int which) {
            Intent game3 = new Intent(ResultActivity.this, level1.class);
            game3.putExtra("level", ResultActivity.this.getIntent().getIntExtra("level", 1) + 1);
            ResultActivity.this.startActivity(game3);
            ResultActivity.this.finish();
        }
    }

    /* renamed from: satsumadroid.iq.test.intelligence.ResultActivity.2 */
    class C02582 implements OnClickListener {
        C02582() {
        }

        public void onClick(DialogInterface dialog, int which) {
            ResultActivity.this.startActivity(new Intent(ResultActivity.this, levels.class));
            MainActivity.ads.showInterstitial(false);

            ResultActivity.this.finish();
        }
    }

    /* renamed from: satsumadroid.iq.test.intelligence.ResultActivity.3 */
    class C02593 implements OnClickListener {
        C02593() {
        }

        public void onClick(DialogInterface dialog, int which) {
            ResultActivity.this.startActivity(new Intent(ResultActivity.this, levels.class));
            MainActivity.ads.showInterstitial(false);

            ResultActivity.this.finish();
        }
    }

    /* renamed from: satsumadroid.iq.test.intelligence.ResultActivity.4 */
    class C02604 implements OnClickListener {
        C02604() {
        }

        public void onClick(DialogInterface dialog, int which) {
            Intent game3 = new Intent(ResultActivity.this, level1.class);
            game3.putExtra("level", ResultActivity.this.getIntent().getIntExtra("level", 1));
            ResultActivity.this.startActivity(game3);
            MainActivity.ads.showInterstitial(false);

            ResultActivity.this.finish();
        }
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

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        int level = getIntent().getIntExtra("level", 1);
        int score = getIntent().getExtras().getInt("score");
        System.out.println("scoreInResult" + score);
        Double value1 = Double.valueOf((((double) score) / Double.valueOf(20.0d).doubleValue()) * 100.0d);
        System.out.println("value1>>>" + value1);

        Builder alertDialog = new Builder(this);
        AlertDialog dialog;
        Button btn2;
        Button btn1;
        if (value1.doubleValue() >= 70.0d) {

            SavePreferences(String.valueOf(level), "yes");
            alertDialog.setTitle("Congrats!!!");
            alertDialog.setCancelable(true);
            alertDialog.setMessage("Your Score: " + Float.valueOf(String.valueOf(value1)));
            alertDialog.setIcon(R.drawable.quizicon);
            alertDialog.setPositiveButton("Next Level", new C02571());
            alertDialog.setNeutralButton("Menu", new C02582());
            dialog=alertDialog.create();
            dialog.show();
            btn2 = dialog.getButton(-1);
            if (btn2 != null) {
                btn2.setBackgroundDrawable(getResources().getDrawable(R.drawable.btn));
                btn2.setTextColor(Color.WHITE);
            }
            btn2.setTextSize(20);
            btn1 = dialog.getButton(-3);
            if (btn1 != null) {
                btn1.setBackgroundDrawable(getResources().getDrawable(R.drawable.btn));
                btn1.setTextColor(Color.WHITE);
            }
            btn1.setTextSize(20);
            return;
        }
        alertDialog = new Builder(this);
        alertDialog.setTitle("blue");
        alertDialog.setTitle("Sorry Try Again");
        alertDialog.setCancelable(true);
        alertDialog.setMessage("Your Score is " + Float.valueOf(String.valueOf(value1)) + "\n" + "Passing score is 70");
        alertDialog.setIcon(R.drawable.quizicon);

        alertDialog.setNegativeButton("Exit", new C02593());

                alertDialog.setPositiveButton("Restart", new C02604());
        dialog = alertDialog.create();
        dialog.show();
        btn2 = dialog.getButton(-1);
        if (btn2 != null) {
            btn2.setBackgroundDrawable(getResources().getDrawable(R.drawable.btn));
            btn2.setTextColor(Color.WHITE);

        }
        btn2.setTextSize(20);
        btn1 = dialog.getButton(-2);
        if (btn1 != null) {
            btn1.setBackgroundDrawable(getResources().getDrawable(R.drawable.btn));
            btn1.setTextColor(Color.WHITE);

        }
        btn1.setTextSize(20);
    }

//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_result, menu);
//        return true;
//    }
}

