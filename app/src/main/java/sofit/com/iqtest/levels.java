package sofit.com.iqtest;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class levels extends Activity {
    public SharedPreferences preferences;
    SharedPreferences sharedPreferences;

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

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);
        Button Level1 = (Button) findViewById(R.id.button1);
        Typeface font = Typeface.createFromAsset(getAssets(), "ethnocentric rg.ttf");
        Level1.setTypeface(font);
        Button Level2 = (Button) findViewById(R.id.button2);
        Level2.setTypeface(font);
        if (LoadPreferences("1", "no").equals("yes")) {
            Level2.setBackgroundResource(R.drawable.lock_bttn);
            Level2.setText("2");
            Level2.setTextColor(Color.WHITE);
            Level2.setTextSize(19);
            Level2.setTypeface(null, Typeface.BOLD);
        } else {
            Level2.setBackgroundResource(R.drawable.lock);
            Level2.setText("");
        }
        Button Level3 = (Button) findViewById(R.id.button3);
        Level3.setTypeface(font);
        if (LoadPreferences("2", "no").equals("yes")) {
            Level3.setBackgroundResource(R.drawable.lock_bttn);
            Level3.setText("3");
            Level3.setTextColor(Color.WHITE);
            Level3.setTextSize(19);
            Level3.setTypeface(null, Typeface.BOLD);
        } else {
            Level3.setBackgroundResource(R.drawable.lock);
            Level3.setText("");
        }
        Button Level4 = (Button) findViewById(R.id.button4);
        Level4.setTypeface(font);
        if (LoadPreferences("3", "no").equals("yes")) {
            Level4.setBackgroundResource(R.drawable.lock_bttn);
            Level4.setText("4");
            Level4.setTextColor(Color.WHITE);
            Level4.setTextSize(19);
            Level4.setTypeface(null, Typeface.BOLD);
        } else {
            Level4.setBackgroundResource(R.drawable.lock);
            Level4.setText("");
        }
        Button Level5 = (Button) findViewById(R.id.button5);
        Level5.setTypeface(font);
        if (LoadPreferences("4", "no").equals("yes")) {
            Level5.setBackgroundResource(R.drawable.lock_bttn);
            Level5.setText("5");
            Level5.setTextColor(Color.WHITE);
            Level5.setTextSize(19);
            Level5.setTypeface(null, Typeface.BOLD);
        } else {
            Level5.setBackgroundResource(R.drawable.lock);
            Level5.setText("");
        }
        Button Level6 = (Button) findViewById(R.id.button6);
        Level6.setTypeface(font);
        if (LoadPreferences("4", "no").equals("yes")) {
            Level6.setBackgroundResource(R.drawable.lock_bttn);
            Level6.setText("6");
            Level6.setTextColor(Color.WHITE);
            Level6.setTextSize(19);
            Level6.setTypeface(null, Typeface.BOLD);
        } else {
            Level6.setBackgroundResource(R.drawable.lock);
            Level6.setText("");
        }
        Button Level7 = (Button) findViewById(R.id.button7);
        Level7.setTypeface(font);
        if (LoadPreferences("4", "no").equals("yes")) {
            Level7.setBackgroundResource(R.drawable.lock_bttn);
            Level7.setText("7");
            Level7.setTextColor(Color.WHITE);
            Level7.setTextSize(19);
            Level7.setTypeface(null, Typeface.BOLD);
        } else {
            Level7.setBackgroundResource(R.drawable.lock);
            Level7.setText("");
        }
        Button Level8 = (Button) findViewById(R.id.button8);
        Level8.setTypeface(font);
        if (LoadPreferences("4", "no").equals("yes")) {
            Level8.setBackgroundResource(R.drawable.lock_bttn);
            Level8.setText("8");
            Level8.setTextColor(Color.WHITE);
            Level8.setTextSize(19);
            Level8.setTypeface(null, Typeface.BOLD);
        } else {
            Level8.setBackgroundResource(R.drawable.lock);
            Level8.setText("");
        }
        Button Level9 = (Button) findViewById(R.id.button9);
        Level9.setTypeface(font);
        if (LoadPreferences("4", "no").equals("yes")) {
            Level9.setBackgroundResource(R.drawable.lock_bttn);
            Level9.setText("9");
            Level9.setTextColor(Color.WHITE);
            Level9.setTextSize(19);
            Level9.setTypeface(null, Typeface.BOLD);
        } else {
            Level9.setBackgroundResource(R.drawable.lock);
            Level9.setText("");
        }
        Level1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(levels.this, level1.class);
                intent.putExtra("level",1);
                startActivity(intent);
                finish();


            }
        });
        Level2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(levels.this, level1.class);
                if(LoadPreferences("1","no").equals("yes")){
                    intent.putExtra("level",2);
                    startActivity(intent);
                    finish();
                }
            }
        });

        Level3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(levels.this, level1.class);
                if(LoadPreferences("2","no").equals("yes")){
                    intent.putExtra("level",3);
                    startActivity(intent);
                    finish();
                }

            }
        });

        Level4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(levels.this, level1.class);
                if(LoadPreferences("3","no").equals("yes")){
                    intent.putExtra("level",4);
                    startActivity(intent);
                    finish();
                }

            }
        });

        Level5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(levels.this, level5.class);
                if(LoadPreferences("4","no").equals("yes")){
                    intent.putExtra("level",5);
                    startActivity(intent);
                    finish();
                }

            }
        });

        Level6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(levels.this, level6.class);
                if(LoadPreferences("4", "no").equals("yes")) {
                    intent.putExtra("level",6);
                    startActivity(intent);
                    finish();
                }

            }
        });

        Level7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(levels.this, level7.class);
                if(LoadPreferences("4", "no").equals("yes")) {
                    intent.putExtra("level",7);
                    startActivity(intent);
                    finish();
                }

            }
        });

        Level8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(levels.this, level8.class);
                if(LoadPreferences("4", "no").equals("yes")) {
                    intent.putExtra("level",8);
                    startActivity(intent);
                    finish();
                }

            }
        });

        Level9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(levels.this, level9.class);
                if(LoadPreferences("4", "no").equals("yes")) {
                    intent.putExtra("level",9);
                    startActivity(intent);
                    finish();
                }

            }
        });

//        Level3.setOnClickListener(this);
//        Level4.setOnClickListener(this);
//        Level5.setOnClickListener(this);
//        Level6.setOnClickListener(this);
//        Level7.setOnClickListener(this);
//        Level8.setOnClickListener(this);
//        Level9.setOnClickListener(this);



    }


}

