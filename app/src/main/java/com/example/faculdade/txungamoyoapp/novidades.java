package com.example.faculdade.txungamoyoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class novidades extends AppCompatActivity {

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


        v_flipper = findViewById(R.id.v_flipper);
        int images[] = {R.drawable.bg1, R.drawable.bg2, R.drawable.bg3};

        //for loop

       /* for(int i = 0; i < images.length; i++){
            flipperImages(images[i]);
        }*/

       for (int image: images){
           flipperImages(image);
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


    public void Carrinho (View View){

        setContentView(R.layout.activity_carrinho);
    }

    public void Conta (View View){

        setContentView(R.layout.activity_conta);
    }

    public void Home (View View){

        setContentView(R.layout.activity_main);
    }

}


