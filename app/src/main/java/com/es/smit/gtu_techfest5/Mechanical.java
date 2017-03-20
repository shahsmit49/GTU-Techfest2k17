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

import com.es.smit.gtu_techfest5.mechanical.Cad_Combat;
import com.es.smit.gtu_techfest5.mechanical.Grave_the_junk;
import com.es.smit.gtu_techfest5.mechanical.Knock_On;
import com.es.smit.gtu_techfest5.mechanical.Model_Rocketry;
import com.es.smit.gtu_techfest5.robotics.RoboLineFollow;
import com.es.smit.gtu_techfest5.robotics.RoboRace;
import com.es.smit.gtu_techfest5.robotics.RoboWar;

/**
 * Created by smit on 27-02-2017.
 */

public class Mechanical extends Fragment implements View.OnClickListener
{

    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    ImageView grave1,knock1,model1,cad1;
    TextView grave2,grave3,knock2,knock3,model2,model3,cad2,cad3;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state)
    {
        View v=inflater.inflate(R.layout.details__mechanical,container,false);
        getActivity().setTitle("Mechanical");
        mFragmentManager=getFragmentManager();

        grave1=(ImageView)v.findViewById(R.id.grave1);
        knock1=(ImageView)v.findViewById(R.id.knock1);
        model1=(ImageView)v.findViewById(R.id.rocket1);
        cad1=(ImageView)v.findViewById(R.id.cad1);

        grave2=(TextView)v.findViewById(R.id.grave2);
        grave3=(TextView)v.findViewById(R.id.grave3);
        knock2=(TextView)v.findViewById(R.id.knock2);
        knock3=(TextView)v.findViewById(R.id.knock3);
        model2=(TextView)v.findViewById(R.id.rocket2);
        model3=(TextView)v.findViewById(R.id.rocket3);
        cad2=(TextView)v.findViewById(R.id.cad2);
        cad3=(TextView)v.findViewById(R.id.cad3);

        grave1.setOnClickListener(this);
        grave2.setOnClickListener(this);
        grave3.setOnClickListener(this);
        knock1.setOnClickListener(this);
        knock2.setOnClickListener(this);
        knock3.setOnClickListener(this);
        model1.setOnClickListener(this);
        model2.setOnClickListener(this);
        model3.setOnClickListener(this);
        cad1.setOnClickListener(this);
        cad2.setOnClickListener(this);
        cad3.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View view)
    {

        if(view.getId()==R.id.grave1 || view.getId()==R.id.grave2 || view.getId()==R.id.grave3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Grave_the_junk());
            mFragmentTransaction.addToBackStack("model_rocket");
            mFragmentTransaction.commit();
        }

        if(view.getId()==R.id.knock1 || view.getId()==R.id.knock2 || view.getId()==R.id.knock3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Knock_On());
            mFragmentTransaction.addToBackStack("knock_on");
            mFragmentTransaction.commit();
        }

        if(view.getId()==R.id.rocket1 || view.getId()==R.id.rocket2 || view.getId()==R.id.rocket3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Model_Rocketry());
            mFragmentTransaction.addToBackStack("model rocket");
            mFragmentTransaction.commit();
        }

        if(view.getId()==R.id.cad1 || view.getId()==R.id.cad2 || view.getId()==R.id.cad3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Cad_Combat());
            mFragmentTransaction.addToBackStack("cad combat");
            mFragmentTransaction.commit();
        }
    }
}
