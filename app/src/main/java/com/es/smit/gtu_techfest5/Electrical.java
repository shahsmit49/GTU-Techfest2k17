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
import com.es.smit.gtu_techfest5.electrical.*;
/**
 * Created by smit on 27-02-2017.
 */

public class Electrical extends Fragment implements View.OnClickListener
{
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    ImageView codefest1,circuitrix1,lasermaze1,arduino1;
    TextView codefest2,codefest3,circuitrix2,circuitrix3,lasermaze2,lasermaze3,arduino2,arduino3;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state)
    {
        View v = inflater.inflate(R.layout.details_electrical, container, false);
        getActivity().setTitle("Electrical");
        mFragmentManager = getFragmentManager();
        codefest1=(ImageView)v.findViewById(R.id.codefest1);
        circuitrix1=(ImageView)v.findViewById(R.id.circuitrix1);
        lasermaze1=(ImageView)v.findViewById(R.id.lasermaze1);
        arduino1=(ImageView)v.findViewById(R.id.arduino1);

        codefest2=(TextView)v.findViewById(R.id.codefest2);
        codefest3=(TextView)v.findViewById(R.id.codefest3);
        circuitrix2=(TextView)v.findViewById(R.id.circuitrix2);
        circuitrix3=(TextView)v.findViewById(R.id.circuitrix3);
        lasermaze2=(TextView)v.findViewById(R.id.lasermaze2);
        lasermaze3=(TextView)v.findViewById(R.id.lasermaze3);
        arduino2=(TextView)v.findViewById(R.id.arduino2);
        arduino3=(TextView)v.findViewById(R.id.arduino3);


        codefest1.setOnClickListener(this);
        codefest2.setOnClickListener(this);
        codefest3.setOnClickListener(this);
        circuitrix1.setOnClickListener(this);
        circuitrix2.setOnClickListener(this);
        circuitrix3.setOnClickListener(this);
        lasermaze1.setOnClickListener(this);
        lasermaze2.setOnClickListener(this);
        lasermaze3.setOnClickListener(this);
        arduino1.setOnClickListener(this);
        arduino2.setOnClickListener(this);
        arduino3.setOnClickListener(this);

        return v;

    }
    @Override
    public void onClick(View view)
    {
        if(view.getId()==R.id.codefest1 || view.getId()==R.id.codefest2 || view.getId()==R.id.codefest3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new CodeFest());
            mFragmentTransaction.addToBackStack("codefest");
            mFragmentTransaction.commit();
        }

        if(view.getId()==R.id.circuitrix1 || view.getId()==R.id.circuitrix2 || view.getId()==R.id.circuitrix3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new CircuitRix());
            mFragmentTransaction.addToBackStack("circuitrix");
            mFragmentTransaction.commit();
        }

        if(view.getId()==R.id.lasermaze1 || view.getId()==R.id.lasermaze2 || view.getId()==R.id.lasermaze3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new LaserMaze());
            mFragmentTransaction.addToBackStack("lasermaze");
            mFragmentTransaction.commit();
        }


        if(view.getId()==R.id.arduino1 || view.getId()==R.id.arduino2 || view.getId()==R.id.arduino3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Arduino());
            mFragmentTransaction.addToBackStack("Arduino");
            mFragmentTransaction.commit();
        }

    }
}
