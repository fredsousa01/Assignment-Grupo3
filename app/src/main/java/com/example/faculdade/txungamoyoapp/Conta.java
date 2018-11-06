package com.example.faculdade.txungamoyoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Conta extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conta);

        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://www.txungamoyo.com/minha-conta/");
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();

        } else {
            super.onBackPressed();
        }
    }

    public void Carrinho (View View){

        setContentView(R.layout.activity_carrinho);
    }

    public void StoreList (View View){

        setContentView(R.layout.activity_novidades);
    }

    public void Home (View View){

        setContentView(R.layout.activity_main);
    }
}
