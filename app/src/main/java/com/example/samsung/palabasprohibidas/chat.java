package com.example.samsung.palabasprohibidas;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

/**
 * Created by samsung on 04/04/2016.
 */
public class chat extends Fragment{

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        View view=inflater.inflate(R.layout.layout_chat,container,false);

        WebView wv= (WebView) view.findViewById(R.id.pagechat);
        wv.loadUrl("http://apptabu.herokuapp.com/");
        return view;
    }
}
