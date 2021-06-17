package com.example.tarea8;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;


public class IrWebView extends Fragment {
    private EditText etURL;
    private Button btIR;
    private WebView wv1;

    public IrWebView() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_web_view, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        etURL = (EditText) view.findViewById(R.id.etURL);
        btIR = (Button) view.findViewById(R.id.btIR);

        wv1 = (WebView) view.findViewById(R.id.wv1);

        btIR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url1 = etURL.getText().toString();
                int seguridad = url1.indexOf("https://", 0);
                if (seguridad == -1) {

                    String url2 = "https://" + etURL.getText();
                    wv1.loadUrl(url2);
                } else {
                    wv1.loadUrl(url1);
                }
                wv1.setWebViewClient(new WebViewClient());
                wv1.setWebChromeClient(new WebChromeClient());


            }
        });


    }


}