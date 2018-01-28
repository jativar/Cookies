package com.jativa.ramiro.cookies;
// The cookies app is an app that display a cookie on a dish.
// Has two buttons: 1) EAT COOKIE and 2) MORE COOKIE
// Every time that EAT COOKIE is clicked the cookie on the dish
// the cookie is eaten. When the MORE COOKIE is clicked, a new
// cookie show up on the dish.
// This is a basic app. For children, to practice the classic
// PEEK A BOO GAME.
// Target is 1-3 years old.

// This app has AdMob for Android implementation
// Banner Ads are implemented. Banners Ads are rectangular
// image or text ads that occupy a spot within an app's layout.
// They stay on screen while users are interacting with the app,
// and can refresh automatically after a certain period of time.

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// This following import is needed to initialize the Mobile Ads SDK
// by calling MobileAds.initialize() with my AdMob App ID. This only
// needs to be done once, ideally at app launch. I can find my app's
// App ID in the AdMob UI.
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
// Once the AdView is in place, the next step is to load an ad.
// That's done with the loadAd() method in the AdView class.
// It takes an AdRequest parameter, which holds runtime information (such as
// target info) about a single ad request.


public class MainActivity extends AppCompatActivity {

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // This line is needed to AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
        // Once the AdView is in place, the next step is to load an ad.
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView cokieImageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        //cokieImageView.setVisibility(View.INVISIBLE);
        cokieImageView.setImageResource(R.drawable.after_cookie);


        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView statusChangeView = (TextView) findViewById(R.id.status_text_view);
        statusChangeView.setText("I'm so full");

    }

    public void moreCookie(View view) {
        // TODO: Return to uneating Cookie
        ImageView cookieImageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        cookieImageView.setImageResource(R.drawable.before_cookie);

        // TODO: Find a reference to the TextView in the layout. Change the text to eat more cookies.
        TextView statusChangeView = (TextView) findViewById(R.id.status_text_view);
        statusChangeView.setText("I'm so hungry!");


    }
}