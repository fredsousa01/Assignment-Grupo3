package com.example.faculdade.txungamoyoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Conta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conta);
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
