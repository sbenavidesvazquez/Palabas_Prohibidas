package com.example.samsung.palabasprohibidas;

import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by samsung on 04/04/2016.
 */
public class Palabras extends Fragment {

    TextView txa;
    TextView tx1;
    TextView tx2;
    TextView tx3;
    TextView tx4;
    TextView tx5;
    Connection con;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.words_layout,container,false);
        conexion c=new conexion();

        txa.findViewById(R.id.tvAdivinar);
        tx1.findViewById(R.id.tvPalabra1);
        tx2.findViewById(R.id.tvpalabra2);
        tx3.findViewById(R.id.tvpalabra3);
        tx4.findViewById(R.id.tvpalabra4);
        tx5.findViewById(R.id.tvpalabra5);

        c.execute(null,null,null);

        return view;
    }

    public class conexion extends AsyncTask<String,Void,ResultSet>{

        Statement sentencia;
        @Override
        protected ResultSet doInBackground(String... params) {

            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (java.lang.InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            try {
                con= DriverManager.getConnection("jdbc:mysql://db4free.net:3306/palabras?autoReconnect=True&useSSL=false","sergbena","benavides1893");
                sentencia=con.createStatement();
                ResultSet resul=sentencia.executeQuery("select * from adivinar");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(ResultSet res){
            try {
                while (res.next()){
                    txa.setText(res.getString("pacertar"));
                    tx1.setText(res.getString("pp1"));
                    tx2.setText(res.getString("pp2"));
                    tx3.setText(res.getString("pp3"));
                    tx4.setText(res.getString("pp4"));
                    tx5.setText(res.getString("pp5"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
