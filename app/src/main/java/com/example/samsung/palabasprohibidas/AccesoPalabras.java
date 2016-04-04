package com.example.samsung.palabasprohibidas;

import android.app.Fragment;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by samsung on 31/03/2016.
 */
public class AccesoPalabras extends Thread {

    Connection con;
    TextView ta,tp1,tp2,tp3,tp4,tp5;

    public AccesoPalabras(TextView ta,TextView tp1,TextView tp2,
                          TextView tp3, TextView tp4, TextView tp5){
        this.ta=ta;
        this.tp1=tp1;
        this.tp2=tp2;
        this.tp3=tp3;
        this.tp4=tp4;
        this.tp5=tp5;

    }

    public void run(){

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            con= DriverManager.getConnection("jdbc:mysql://db4free.net:3306/palabras?autoReconnect=True&&useSSL=false", "sergbena", "benavides1893");

            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from adivinar");
            while(rs.next()){
                ta.setText(rs.getString(2));
                tp1.setText(rs.getString(3));
                tp2.setText(rs.getString(4));
                tp3.setText(rs.getString(5));
                tp4.setText(rs.getString(6));
                tp5.setText(rs.getString(7));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
