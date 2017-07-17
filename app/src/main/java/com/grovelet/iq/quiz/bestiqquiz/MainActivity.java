package com.grovelet.iq.quiz.bestiqquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

import com.grovelet.iq.quiz.bestiqquiz.R;

public class MainActivity extends AppCompatActivity {


    ImageButton ib1, ib2;
    public static Ads ads;
    public static GoogleAnalytics analytics;
    public static Tracker tracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ads = new Ads(this, true, true, false);

        if (android.os.Build.VERSION.SDK_INT >= 21) {
            Window statusBar = getWindow();
            statusBar.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            statusBar.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            statusBar.setStatusBarColor(getResources().getColor(R.color.colorPrimaryDark));
            statusBar.setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
        }
        setContentView(R.layout.activity_main);
        RelativeLayout adView = (RelativeLayout) findViewById(R.id.adViewCon);

        ads.loadInterstitial();
        ads.loadBanner(adView);

        analytics = GoogleAnalytics.getInstance(this);
        analytics.setLocalDispatchPeriod(10);
        tracker = analytics.newTracker(getResources().getString(R.string.analytics_id));
        tracker.enableAutoActivityTracking(true);


        ib1 = (ImageButton) findViewById(R.id.bNew);
        ib2 = (ImageButton) findViewById(R.id.bExit);

        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, levels.class));
                ads.showInterstitial(false);
            }
        });

        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        ads.showInterstitial(true);

    }
}
