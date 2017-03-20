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

import com.es.smit.gtu_techfest5.computer.Relay_computer;
import com.es.smit.gtu_techfest5.computer.cquiz_computer;
import com.es.smit.gtu_techfest5.computer.etreasure_computer;
import com.es.smit.gtu_techfest5.computer.gaming_computer;
import com.es.smit.gtu_techfest5.computer.logo_computer;
import com.es.smit.gtu_techfest5.computer.quick_computer;
import com.es.smit.gtu_techfest5.management.Corpotrade;
import com.es.smit.gtu_techfest5.management.Indianenter;
import com.es.smit.gtu_techfest5.management.Khajane;
import com.es.smit.gtu_techfest5.management.Recruite;
import com.es.smit.gtu_techfest5.management.Smartmanager;

/**
 * Created by smit on 28-02-2017.
 */

public class Management extends Fragment implements View.OnClickListener
{
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    ImageView smart1,indian1,corpo1,khajan1,recruit1;
    TextView smart2,smart3,indian2,indian13,corpo2,corpo3,khajan2,khajan3,recruit2,recruit3;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state)
    {
        View v=inflater.inflate(R.layout.details_management,container,false);
        getActivity().setTitle("Management");
        mFragmentManager=getFragmentManager();
        smart1=(ImageView)v.findViewById(R.id.smartmanager1);
        indian1=(ImageView)v.findViewById(R.id.startupindia1);
        corpo1=(ImageView)v.findViewById(R.id.corpotrade1);
        khajan1=(ImageView)v.findViewById(R.id.treasurehunt1);
        recruit1=(ImageView)v.findViewById(R.id.recruiterace1);
        smart2=(TextView)v.findViewById(R.id.smartmanager2);
        smart3=(TextView)v.findViewById(R.id.smartmanager3);
        indian2=(TextView)v.findViewById(R.id.startupindia2);
        indian13=(TextView)v.findViewById(R.id.startupindia3);
        corpo2=(TextView)v.findViewById(R.id.corpotrade2);
        corpo3=(TextView)v.findViewById(R.id.corpotrade3);
        khajan2=(TextView)v.findViewById(R.id.treasurehunt2);
        khajan3=(TextView)v.findViewById(R.id.treasurehunt3);
        recruit2=(TextView)v.findViewById(R.id.recruiterace2);
        recruit3=(TextView)v.findViewById(R.id.recruiterace3);

        smart1.setOnClickListener(this);
        smart2.setOnClickListener(this);
        smart3.setOnClickListener(this);
        corpo1.setOnClickListener(this);
        corpo2.setOnClickListener(this);
        corpo3.setOnClickListener(this);
        khajan1.setOnClickListener(this);
        khajan2.setOnClickListener(this);
        khajan3.setOnClickListener(this);
        recruit1.setOnClickListener(this);
        recruit2.setOnClickListener(this);
        recruit3.setOnClickListener(this);
        indian1.setOnClickListener(this);
        indian2.setOnClickListener(this);
        indian13.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view)
    {
        if(view.getId()==R.id.smartmanager1 || view.getId()==R.id.smartmanager2 || view.getId()==R.id.smartmanager3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Smartmanager());
            mFragmentTransaction.addToBackStack("smartmanager");
            mFragmentTransaction.commit();
        }

        if(view.getId()==R.id.corpotrade1 || view.getId()==R.id.corpotrade2 || view.getId()==R.id.corpotrade3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Corpotrade());
            mFragmentTransaction.addToBackStack("c corpo");
            mFragmentTransaction.commit();
        }

        if(view.getId()==R.id.treasurehunt1 || view.getId()==R.id.treasurehunt2 || view.getId()==R.id.treasurehunt3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Khajane());
            mFragmentTransaction.addToBackStack("khajan");
            mFragmentTransaction.commit();
        }


        if(view.getId()==R.id.startupindia1 || view.getId()==R.id.startupindia2 || view.getId()==R.id.startupindia3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Indianenter());
            mFragmentTransaction.addToBackStack("idnainenter");
            mFragmentTransaction.commit();
        }


        if(view.getId()==R.id.recruiterace1 || view.getId()==R.id.recruiterace2 || view.getId()==R.id.recruiterace3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Recruite());
            mFragmentTransaction.addToBackStack("recruit race");
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

