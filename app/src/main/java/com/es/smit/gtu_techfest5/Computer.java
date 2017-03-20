package com.es.smit.gtu_techfest5;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;

import com.es.smit.gtu_techfest5.computer.*;

/**
 * Created by smit on 21-02-2017.
 */

public class Computer extends Fragment implements OnClickListener
{
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    ImageView relay1,cquiz1,etreas1,quickpage1,gaming1,logo1;
    TextView relay2,relay3,cquiz2,cquiz3,etreas2,etreas3,quickpage2,quickpage3,gaming2,gaming3,logo2,logo3;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state)
    {
        View v=inflater.inflate(R.layout.details_computer,container,false);
        getActivity().setTitle("Computer");
        mFragmentManager=getFragmentManager();
        relay1=(ImageView)v.findViewById(R.id.relay1);
        cquiz1=(ImageView)v.findViewById(R.id.cquiz1);
        etreas1=(ImageView)v.findViewById(R.id.etreas1);
        quickpage1=(ImageView)v.findViewById(R.id.quickpage1);
        gaming1=(ImageView)v.findViewById(R.id.gaming1);
        logo1=(ImageView)v.findViewById(R.id.logo1);
        relay2=(TextView)v.findViewById(R.id.relay2);
        relay3=(TextView)v.findViewById(R.id.relay3);
        cquiz2=(TextView)v.findViewById(R.id.cquiz2);
        cquiz3=(TextView)v.findViewById(R.id.cquiz3);
        etreas2=(TextView)v.findViewById(R.id.etreas2);
        etreas3=(TextView)v.findViewById(R.id.etreas3);
        quickpage2=(TextView)v.findViewById(R.id.quickpage2);
        quickpage3=(TextView)v.findViewById(R.id.quickpage3);
        gaming2=(TextView)v.findViewById(R.id.gaming2);
        gaming3=(TextView)v.findViewById(R.id.gaming3);
        logo2=(TextView)v.findViewById(R.id.logo2);
        logo3=(TextView)v.findViewById(R.id.logo3);
        relay1.setOnClickListener(this);
        relay2.setOnClickListener(this);
        relay3.setOnClickListener(this);
        cquiz1.setOnClickListener(this);
        cquiz2.setOnClickListener(this);
        cquiz3.setOnClickListener(this);
        etreas1.setOnClickListener(this);
        etreas2.setOnClickListener(this);
        etreas3.setOnClickListener(this);
        logo1.setOnClickListener(this);
        logo2.setOnClickListener(this);
        logo3.setOnClickListener(this);
        gaming1.setOnClickListener(this);
        gaming2.setOnClickListener(this);
        gaming3.setOnClickListener(this);
        quickpage1.setOnClickListener(this);
        quickpage2.setOnClickListener(this);
        quickpage3.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View view)
    {
        if(view.getId()==R.id.relay1 || view.getId()==R.id.relay2 || view.getId()==R.id.relay3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Relay_computer());
            mFragmentTransaction.addToBackStack("relay coding");
            mFragmentTransaction.commit();
        }

        if(view.getId()==R.id.cquiz1 || view.getId()==R.id.cquiz2 || view.getId()==R.id.cquiz3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new cquiz_computer());
            mFragmentTransaction.addToBackStack("c quiz");
            mFragmentTransaction.commit();
        }

        if(view.getId()==R.id.etreas1 || view.getId()==R.id.etreas2 || view.getId()==R.id.etreas3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new etreasure_computer());
            mFragmentTransaction.addToBackStack("e treasure");
            mFragmentTransaction.commit();
        }


        if(view.getId()==R.id.logo1 || view.getId()==R.id.logo2 || view.getId()==R.id.logo3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new logo_computer());
            mFragmentTransaction.addToBackStack("logo 2");
            mFragmentTransaction.commit();
        }


        if(view.getId()==R.id.quickpage1 || view.getId()==R.id.quickpage2 || view.getId()==R.id.quickpage3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new quick_computer());
            mFragmentTransaction.addToBackStack("quick page");
            mFragmentTransaction.commit();
        }


        if(view.getId()==R.id.gaming1 || view.getId()==R.id.gaming2 || view.getId()==R.id.gaming3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new gaming_computer());
            mFragmentTransaction.addToBackStack("gaming");
            mFragmentTransaction.commit();
        }
    }
}
