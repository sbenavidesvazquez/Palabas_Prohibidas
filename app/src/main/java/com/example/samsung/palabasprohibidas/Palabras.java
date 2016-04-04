package com.example.samsung.palabasprohibidas;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by samsung on 04/04/2016.
 */
public class Palabras extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        View view=inflater.inflate(R.layout.words_layout,container,false);

        TextView txa= (TextView) view.findViewById(R.id.tvAdivinar);
        TextView tx1= (TextView) view.findViewById(R.id.tvPalabra1);
        TextView tx2= (TextView) view.findViewById(R.id.tvpalabra2);
        TextView tx3= (TextView) view.findViewById(R.id.tvpalabra3);
        TextView tx4= (TextView) view.findViewById(R.id.tvpalabra4);
        TextView tx5= (TextView) view.findViewById(R.id.tvpalabra5);

        AccesoPalabras ap=new AccesoPalabras(txa,tx1,tx2,tx3,tx4,tx5);
        ap.start();
        return view;
    }
}
