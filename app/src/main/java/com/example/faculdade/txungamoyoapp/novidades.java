package com.example.faculdade.txungamoyoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class novidades extends AppCompatActivity {
    private WebView webView;

    ViewFlipper v_flipper;
/*
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            WebView myWebView = (WebView) findViewById(R.id.webView);
            myWebView.loadUrl("http://www.youtube.com");
            WebView webView = (WebView) findViewById(R.id.webView);
            myWebView.setWebViewClient(new WebViewClient());
            myWebView = (WebView) findViewById(R.id.webView);
            WebSettings webSettings = myWebView.getSettings();
            ((WebSettings) webSettings).setJavaScriptEnabled(true);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novidades);


        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://www.txungamoyo.com/categoria-produto/uncategorized/");



    }
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();

        } else {
            super.onBackPressed();
        }
    }


public void flipperImages(int image) {

    ImageView imageView = new ImageView(this);
    imageView.setBackgroundResource(image);
    v_flipper.addView(imageView);
    v_flipper.setFlipInterval(4000); //4sec
    v_flipper.setAutoStart(true);

    //animation

    v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
    v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);


    }

}


