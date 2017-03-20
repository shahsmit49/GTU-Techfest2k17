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

import com.es.smit.gtu_techfest5.electrical.CircuitRix;
import com.es.smit.gtu_techfest5.electrical.CodeFest;
import com.es.smit.gtu_techfest5.electrical.LaserMaze;
import com.es.smit.gtu_techfest5.robotics.RoboLineFollow;
import com.es.smit.gtu_techfest5.robotics.RoboRace;
import com.es.smit.gtu_techfest5.robotics.RoboWar;

/**
 * Created by smit on 27-02-2017.
 */

public class Robotics extends Fragment implements View.OnClickListener
{

    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    ImageView robo_race1,robo_line_follow1,robo_war1;
    TextView robo_race2,robo_race3,robo_line_follow2,robo_line_follow3,robo_war2,robo_war3;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state)
    {
        View v=inflater.inflate(R.layout.details_robotics,container,false);
        getActivity().setTitle("Robotics");
        mFragmentManager=getFragmentManager();

        robo_race1=(ImageView)v.findViewById(R.id.robo_race1);
        robo_line_follow1=(ImageView)v.findViewById(R.id.robo_line_follow1);
        robo_war1=(ImageView)v.findViewById(R.id.robo_war1);

        robo_race2=(TextView)v.findViewById(R.id.robo_race2);
        robo_race3=(TextView)v.findViewById(R.id.robo_race3);
        robo_line_follow2=(TextView)v.findViewById(R.id.robo_line_follow2);
        robo_line_follow3=(TextView)v.findViewById(R.id.robo_line_follow3);
        robo_war2=(TextView)v.findViewById(R.id.robo_war2);
        robo_war3=(TextView)v.findViewById(R.id.robo_war3);

        robo_race1.setOnClickListener(this);
        robo_race2.setOnClickListener(this);
        robo_race3.setOnClickListener(this);
        robo_line_follow1.setOnClickListener(this);
        robo_line_follow2.setOnClickListener(this);
        robo_line_follow3.setOnClickListener(this);
        robo_war1.setOnClickListener(this);
        robo_war2.setOnClickListener(this);
        robo_war3.setOnClickListener(this);

        return v;
    }
    @Override
    public void onClick(View view)
    {
        if(view.getId()==R.id.robo_race1 || view.getId()==R.id.robo_race2 || view.getId()==R.id.robo_race3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new RoboRace());
            mFragmentTransaction.addToBackStack("robo_race");
            mFragmentTransaction.commit();
        }

        if(view.getId()==R.id.robo_line_follow1 || view.getId()==R.id.robo_line_follow2 || view.getId()==R.id.robo_line_follow3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new RoboLineFollow());
            mFragmentTransaction.addToBackStack("robo_line_follow");
            mFragmentTransaction.commit();
        }

        if(view.getId()==R.id.robo_war1 || view.getId()==R.id.robo_war2 || view.getId()==R.id.robo_war3)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new RoboWar());
            mFragmentTransaction.addToBackStack("robo_war");
            mFragmentTransaction.commit();
        }

    }
}
