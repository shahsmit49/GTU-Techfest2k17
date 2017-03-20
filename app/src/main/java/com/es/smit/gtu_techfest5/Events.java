package com.es.smit.gtu_techfest5;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toolbar;

/**
 * Created by smit on 20-02-2017.
 */

public class Events extends Fragment implements OnClickListener
{
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    ImageView comp1,elect1,robo1,mech1,civil1,phar1,chem1,gen1,mang1;
    TextView comp2,comp3,elect2,elect3,robo2,robo3,mech2,mech3,civil2,civil3,phar2,phar3,chem2,chem3,gen2,gen3,mang2,mang3;
    /*void Events(MainActivity mc)
    {
        c=mc;
    }*/
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state)
    {
        View v=inflater.inflate(R.layout.fragment_competitions,container,false);
        getActivity().setTitle("Events");
        mFragmentManager=getFragmentManager();
        comp1=(ImageView)v.findViewById(R.id.comp1);
        elect1=(ImageView)v.findViewById(R.id.electrical1);
        robo1=(ImageView)v.findViewById(R.id.robotics1);
        mech1=(ImageView)v.findViewById(R.id.mechanical1);
        civil1=(ImageView)v.findViewById(R.id.civil1);
        phar1=(ImageView)v.findViewById(R.id.pharmacy1);
        chem1=(ImageView)v.findViewById(R.id.chemical1);
        gen1=(ImageView)v.findViewById(R.id.general1);
        mang1=(ImageView)v.findViewById(R.id.management1);


        comp2=(TextView)v.findViewById(R.id.comp2);
        comp3=(TextView)v.findViewById(R.id.comp3);
        elect2=(TextView)v.findViewById(R.id.electrical2);
        elect3=(TextView)v.findViewById(R.id.electrical3);
        robo2=(TextView)v.findViewById(R.id.robotics2);
        robo3=(TextView)v.findViewById(R.id.robotics3);
        mech2=(TextView)v.findViewById(R.id.mechanical2);
        mech3=(TextView)v.findViewById(R.id.mechanical3);
        civil2=(TextView)v.findViewById(R.id.civi2);
        civil3=(TextView)v.findViewById(R.id.civil3);
        phar2=(TextView)v.findViewById(R.id.pharmacy2);
        phar3=(TextView)v.findViewById(R.id.pharmacy3);
        chem2=(TextView)v.findViewById(R.id.chemical2);
        chem3=(TextView)v.findViewById(R.id.chemical3);
        gen2=(TextView)v.findViewById(R.id.general2);
        gen3=(TextView)v.findViewById(R.id.general3);
        mang2=(TextView)v.findViewById(R.id.management2);
        mang3=(TextView)v.findViewById(R.id.management3);


        comp1.setOnClickListener(this);
        comp2.setOnClickListener(this);
        comp3.setOnClickListener(this);
        elect1.setOnClickListener(this);
        elect2.setOnClickListener(this);
        elect3.setOnClickListener(this);
        robo1.setOnClickListener(this);
        robo2.setOnClickListener(this);
        robo3.setOnClickListener(this);
        mech1.setOnClickListener(this);
        mech2.setOnClickListener(this);
        mech3.setOnClickListener(this);
        civil1.setOnClickListener(this);
        civil2.setOnClickListener(this);
        civil3.setOnClickListener(this);
        phar1.setOnClickListener(this);
        phar2.setOnClickListener(this);
        phar3.setOnClickListener(this);
        chem1.setOnClickListener(this);
        chem2.setOnClickListener(this);
        chem3.setOnClickListener(this);
        gen1.setOnClickListener(this);
        gen2.setOnClickListener(this);
        gen3.setOnClickListener(this);
        mang1.setOnClickListener(this);
        mang2.setOnClickListener(this);
        mang3.setOnClickListener(this);


        return v;
    }

    @Override
    public void onClick(View view)
    {
            if(view.getId()==R.id.comp1 || view.getId()==R.id.comp2 || view.getId()==R.id.comp3)
            {
                mFragmentTransaction=mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.frg,new Computer());
                mFragmentTransaction.addToBackStack("computer");
                mFragmentTransaction.commit();
            }

            if(view.getId()==R.id.electrical1 || view.getId()==R.id.electrical2 || view.getId()==R.id.electrical3)
            {
                mFragmentTransaction=mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.frg,new Electrical());
                mFragmentTransaction.addToBackStack("Electrical");
                mFragmentTransaction.commit();
            }

            if(view.getId()==R.id.robotics1 || view.getId()==R.id.robotics2 || view.getId()==R.id.robotics3)
            {
                mFragmentTransaction=mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.frg,new Robotics());
                mFragmentTransaction.addToBackStack("Robotics");
                mFragmentTransaction.commit();
            }


            if(view.getId()==R.id.mechanical1 || view.getId()==R.id.mechanical2 || view.getId()==R.id.mechanical3)
            {
                mFragmentTransaction=mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.frg,new Mechanical());
                mFragmentTransaction.addToBackStack("Mechanical");
                mFragmentTransaction.commit();
            }



            if(view.getId()==R.id.civil1 || view.getId()==R.id.civi2 || view.getId()==R.id.civil3)
            {
                mFragmentTransaction=mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.frg,new Civil());
                mFragmentTransaction.addToBackStack("Civil");
                mFragmentTransaction.commit();
            }



            if(view.getId()==R.id.pharmacy1 || view.getId()==R.id.pharmacy2 || view.getId()==R.id.pharmacy3)
            {
                mFragmentTransaction=mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.frg,new Pharmacy());
                mFragmentTransaction.addToBackStack("Pharmacy");
                mFragmentTransaction.commit();
            }



            if(view.getId()==R.id.chemical1 || view.getId()==R.id.chemical2 || view.getId()==R.id.chemical3)
            {
                mFragmentTransaction=mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.frg,new Chemical());
                mFragmentTransaction.addToBackStack("Chemical");
                mFragmentTransaction.commit();
            }



            if(view.getId()==R.id.general1 || view.getId()==R.id.general2 || view.getId()==R.id.general3)
            {
                mFragmentTransaction=mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.frg,new General());
                mFragmentTransaction.addToBackStack("generalll");
                mFragmentTransaction.commit();
            }



            if(view.getId()==R.id.management1 || view.getId()==R.id.management2 || view.getId()==R.id.management3)
            {
                mFragmentTransaction=mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.frg,new Management());
                mFragmentTransaction.addToBackStack("manageement11");
                mFragmentTransaction.commit();
            }
    }
}
