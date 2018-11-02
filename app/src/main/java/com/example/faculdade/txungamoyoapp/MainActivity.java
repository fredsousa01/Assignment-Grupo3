package com.example.faculdade.txungamoyoapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    String url = "http://www.thejavaprogrammer.com/wp-json/wp/v2/posts?filter[posts_per_page]=10&fields=id,title";
    List<Object> list;
    ProgressDialog progressDialog;
    ListView postList;
    Map<String,Object> mapPost;
    Map<String,Object> mapTitle;
    int postID;
    String postTitle[];

    private static final String TAG = "MainActivity";

    private ArrayList<String> mNames = new ArrayList<>();
//    private ArrayList<String> mImageUrls = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.btnConta))
                .setOnClickListener(new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent i = new Intent(MainActivity.this, Conta.class);
                        startActivity(i);
                    }
                });

        getItems();
    }


    private void getItems(){
        Log. d ( TAG , " initGetItems: Buscando Itens. " );

//        mImageUrls . add ( " https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg " );
        mNames . add ( " Bathtime Goods " );

//        mImageUrls . add ( " https://i.redd.it/tpsnoz5bzo501.jpg " );
        mNames . add ( " Beach Chairs " );

//        mImageUrls . add ( " https://i.redd.it/qn7f9oqu7o501.jpg " );
        mNames . add ( " Bed Room " );

//        mImageUrls . add ( " https://i.redd.it/j6myfqglup501.jpg " );
        mNames . add ( " Carros, Motos e Barcos " );


//        mImageUrls . add ( " https://i.redd.it/0h2gm1ix6p501.jpg " );
        mNames . add ( " Celulares e Tablets " );

//        mImageUrls . add ( " https://i.redd.it/k98uzl68eh501.jpg " );
        mNames . add ( " Dinning Room " );


//        mImageUrls . add ( " https://i.redd.it/glin0nwndo501.jpg " );
        mNames . add ( " Electronicos " );

//        mImageUrls . add ( " https://i.redd.it/obx4zydshg601.jpg " );
        mNames . add ( " Games " );

//        mImageUrls . add ( " https://i.imgur.com/ZcLLrkY.jpg " );
        mNames . add ( " Office Lamps " );

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: chamado");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames);
        recyclerView.setAdapter(adapter);
    }

    public void StoreList (View View){

        setContentView(R.layout.activity_novidades);
    }

    public void Carrinho (View View){

        setContentView(R.layout.activity_carrinho);
    }

}
