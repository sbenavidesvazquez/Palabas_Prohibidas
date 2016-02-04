package com.example.samsung.palabasprohibidas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chat);

        WebView view= (WebView) findViewById(R.id.webView);
        view.loadUrl("https://chat-sergbena.c9users.io/");

    }


}
