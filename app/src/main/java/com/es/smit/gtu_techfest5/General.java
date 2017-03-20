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

import com.es.smit.gtu_techfest5.general.Aqua1;
import com.es.smit.gtu_techfest5.general.Indianstart1;

/**
 * Created by smit on 28-02-2017.
 */

public class General extends Fragment implements View.OnClickListener
{
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    ImageView indian1,aqua1;
    TextView indian2,indian3,aqua2,aqua3;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state)
    {
        View v=inflater.inflate(R.layout.details_general,container,false);
        getActivity().setTitle("General");
        mFragmentManager=getFragmentManager();
        aqua1=(ImageView)v.findViewById(R.id.aqua11);
        aqua2=(TextView)v.findViewById(R.id.aqua21);
        aqua3=(TextView)v.findViewById(R.id.aqua31);
        indian1=(ImageView)v.findViewById(R.id.startupindia11);
        indian2=(TextView)v.findViewById(R.id.startupindia21);
        indian3=(TextView)v.findViewById(R.id.startupindia31);

        aqua1.setOnClickListener(this);
        aqua2.setOnClickListener(this);
        aqua3.setOnClickListener(this);

        indian1.setOnClickListener(this);
        indian2.setOnClickListener(this);
        indian3.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.aqua11 || view.getId()==R.id.aqua21 || view.getId()==R.id.aqua31)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Aqua1());
            mFragmentTransaction.addToBackStack("aqua11");
            mFragmentTransaction.commit();
        }

        if(view.getId()==R.id.startupindia11 || view.getId()==R.id.startupindia21 || view.getId()==R.id.startupindia31)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Indianstart1());
            mFragmentTransaction.addToBackStack("idnainenter11");
            mFragmentTransaction.commit();
        }

    }
}

