package com.example.samsung.palabasprohibidas;

import android.app.Fragment;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.TextView;
import android.widget.Toast;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * La clase que enviará datos al servidor
 * Created by samsung on 20/01/2016.
 */
public class Cliente extends AsyncTask<String,Void,ResultSet>{

    @Override
    protected ResultSet doInBackground(String... params) {
        Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            con=DriverManager.getConnection("jdbc:mysql://db4free.net:3306/palabras?autoReconnect=True&useSSL=false","sergbena","benavides1893");

            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from adivinar");
            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(ResultSet resultSet){
        Context context = null;
        Toast t=Toast.makeText(context,"conexion realizada",Toast.LENGTH_LONG);
        t.show();
    }

}
