package com.example.tarea8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.frameIni, new IrWebView()).commit();
    }


    public void calculadora(View v){

        getSupportFragmentManager().beginTransaction().replace(R.id.frameIni, new Calculadora()).commit();

    }

    public void webview(View v){

        getSupportFragmentManager().beginTransaction().replace(R.id.frameIni, new IrWebView()).commit();

    }
}