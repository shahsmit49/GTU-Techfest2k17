package com.es.smit.gtu_techfest5;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Admin on 03/03/2017.
 */

public class Buttonss extends android.app.Fragment implements View.OnClickListener
{
    ImageView i1,i2;
    TextView t1,t2;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state)
    {
        getActivity().setTitle("Schedule");
        View v=inflater.inflate(R.layout.bttons,container,false);
        i1=(ImageView)v.findViewById(R.id.imagemar6);
        i2=(ImageView)v.findViewById(R.id.imagemar7);
        t1=(TextView) v.findViewById(R.id.textmar6);
        t2=(TextView) v.findViewById(R.id.textmar7);
        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
        t1.setOnClickListener(this);
        t2.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v)
    {
        if(v.getId()==R.id.imagemar6  || v.getId()==R.id.textmar6)
        {
            mFragmentManager=getFragmentManager();
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new WebVieew());
            mFragmentTransaction.addToBackStack("marchsixx");
            mFragmentTransaction.commit();
        }
        if(v.getId()==R.id.imagemar7  || v.getId()==R.id.textmar7)
        {
            mFragmentManager=getFragmentManager();
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new WebVieww());
            mFragmentTransaction.addToBackStack("marchsiven");
            mFragmentTransaction.commit();
        }
    }
}


