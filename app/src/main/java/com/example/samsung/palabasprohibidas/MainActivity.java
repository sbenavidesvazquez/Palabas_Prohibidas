package com.example.samsung.palabasprohibidas;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_layout);

        //WebView views= (WebView) findViewById(R.id.pagechat);
        //views.loadUrl("http://apptabu.herokuapp.com/");
        TextView ta= (TextView) findViewById(R.id.tvAdivinar);
        TextView tp1= (TextView) findViewById(R.id.tvPalabra1);
        TextView tp2= (TextView) findViewById(R.id.tvpalabra2);
        TextView tp3= (TextView) findViewById(R.id.tvpalabra3);
        TextView tp4= (TextView) findViewById(R.id.tvpalabra4);
        TextView tp5= (TextView) findViewById(R.id.tvpalabra5);

        AccesoPalabras ap=new AccesoPalabras(ta,tp1,tp2,tp3,tp4,tp5);
        ap.run();

    }



}
