package com.example.samsung.palabasprohibidas;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * La clase que enviará datos al servidor
 * Created by samsung on 20/01/2016.
 */
public class Cliente {

    final String host="168.100.1.3";
    final int port=8080;
    Socket socketcliente;
    OutputStream ops;

    public void conect(){
        try {
            socketcliente= new Socket();
            InetSocketAddress adress= new InetSocketAddress(host, port);
            socketcliente.connect(adress);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
