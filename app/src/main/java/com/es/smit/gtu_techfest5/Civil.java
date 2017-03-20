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

import com.es.smit.gtu_techfest5.civil.Aqua;
import com.es.smit.gtu_techfest5.civil.Citadel;
import com.es.smit.gtu_techfest5.civil.Pralay;
import com.es.smit.gtu_techfest5.civil.Sesimo;
import com.es.smit.gtu_techfest5.civil.Struterent;
import com.es.smit.gtu_techfest5.computer.Relay_computer;
import com.es.smit.gtu_techfest5.computer.cquiz_computer;
import com.es.smit.gtu_techfest5.computer.etreasure_computer;
import com.es.smit.gtu_techfest5.computer.logo_computer;
import com.es.smit.gtu_techfest5.computer.quick_computer;

import org.w3c.dom.Text;

/**
 * Created by smit on 27-02-2017.
 */

public class Civil extends Fragment implements View.OnClickListener
{
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    ImageView struterent1,citadel1,aqua1,pralay1,sesimo1;
    TextView struterent2,struterent3,citadel2,citadel3,aqua2,aqua3,pralay2,pralay3,sesimo2,sesimo3;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state)
    {
        View v=inflater.inflate(R.layout.details_civil,container,false);
        getActivity().setTitle("Civil");
        mFragmentManager=getFragmentManager();

        struterent1=(ImageView)v.findViewById(R.id.magni1);
        citadel1=(ImageView)v.findViewById(R.id.citadel1);
        aqua1=(ImageView)v.findViewById(R.id.aqua1);
        pralay1=(ImageView)v.findViewById(R.id.pralay1);
        sesimo1=(ImageView)v.findViewById(R.id.seismo1);

        struterent2=(TextView)v.findViewById(R.id.magni2);
        struterent3=(TextView)v.findViewById(R.id.magni3);
        citadel2=(TextView)v.findViewById(R.id.citadel2);
        citadel3=(TextView)v.findViewById(R.id.citadel3);
        aqua2=(TextView)v.findViewById(R.id.aqua2);
        aqua3=(TextView)v.findViewById(R.id.aqua3);
        pralay2=(TextView)v.findViewById(R.id.pralay2);
        pralay3=(TextView)v.findViewById(R.id.pralay3);
        sesimo2=(TextView)v.findViewById(R.id.seismo2);
        sesimo3=(TextView)v.findViewById(R.id.seismo3);

        struterent1.setOnClickListener(this);
        struterent2.setOnClickListener(this);
        struterent3.setOnClickListener(this);
        citadel1.setOnClickListener(this);
        citadel2.setOnClickListener(this);
        citadel3.setOnClickListener(this);
        aqua1.setOnClickListener(this);
        aqua2.setOnClickListener(this);
        aqua3.setOnClickListener(this);
        pralay1.setOnClickListener(this);
        pralay2.setOnClickListener(this);
        pralay3.setOnClickListener(this);
        sesimo1.setOnClickListener(this);
        sesimo2.setOnClickListener(this);
        sesimo3.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view)
    {
        if(view.getId()==R.id.magni1 || view.getId()==R.id.magni2 || view.getId()==R.id.magni3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Struterent());
            mFragmentTransaction.addToBackStack("magnifica");
            mFragmentTransaction.commit();
        }

        if(view.getId()==R.id.aqua1 || view.getId()==R.id.aqua2 || view.getId()==R.id.aqua3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Aqua());
            mFragmentTransaction.addToBackStack("aqua");
            mFragmentTransaction.commit();
        }

        if(view.getId()==R.id.citadel1 || view.getId()==R.id.citadel2 || view.getId()==R.id.citadel3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Citadel());
            mFragmentTransaction.addToBackStack("citadel");
            mFragmentTransaction.commit();
        }


        if(view.getId()==R.id.pralay1 || view.getId()==R.id.pralay2 || view.getId()==R.id.pralay3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Pralay());
            mFragmentTransaction.addToBackStack("pralay");
            mFragmentTransaction.commit();
        }


        if(view.getId()==R.id.seismo1 || view.getId()==R.id.seismo2 || view.getId()==R.id.seismo3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Sesimo());
            mFragmentTransaction.addToBackStack("seismo");
            mFragmentTransaction.commit();
        }

    }
}