package com.jativa.ramiro.cookies;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



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