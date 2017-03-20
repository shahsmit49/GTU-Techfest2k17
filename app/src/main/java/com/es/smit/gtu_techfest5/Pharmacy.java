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
import com.es.smit.gtu_techfest5.pharmacy.Myselfmedicine;
import com.es.smit.gtu_techfest5.pharmacy.Pharmamodels;
import com.es.smit.gtu_techfest5.pharmacy.Pharmarecipe;

/**
 * Created by smit on 28-02-2017.
 */

public class Pharmacy extends Fragment implements View.OnClickListener
{
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    ImageView recipe1,modeel1,medicine1;
    TextView recipe2,recipe3,modeel2,modeel3,medicine2,medicine3;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state)
    {
        View v=inflater.inflate(R.layout.details_pharmacy,container,false);
        getActivity().setTitle("Pharmacy");
        mFragmentManager=getFragmentManager();
        recipe1=(ImageView)v.findViewById(R.id.recipe1);
        modeel1=(ImageView)v.findViewById(R.id.model1);
        medicine1=(ImageView)v.findViewById(R.id.medicine1);
        recipe2=(TextView)v.findViewById(R.id.recipe2);
        recipe3=(TextView)v.findViewById(R.id.recipe3);
        modeel2=(TextView)v.findViewById(R.id.model2);
        modeel3=(TextView)v.findViewById(R.id.model3);
        medicine2=(TextView)v.findViewById(R.id.medicine2);
        medicine3=(TextView)v.findViewById(R.id.medicine3);

        recipe1.setOnClickListener(this);
        recipe2.setOnClickListener(this);
        recipe3.setOnClickListener(this);
        modeel1.setOnClickListener(this);
        modeel2.setOnClickListener(this);
        modeel3.setOnClickListener(this);
        medicine1.setOnClickListener(this);
        medicine2.setOnClickListener(this);
        medicine3.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.recipe1 || view.getId() == R.id.recipe2 || view.getId() == R.id.recipe3) {
            mFragmentTransaction = mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg, new Pharmarecipe());
            mFragmentTransaction.addToBackStack("pharmarecipie");
            mFragmentTransaction.commit();
        }

        if (view.getId() == R.id.model1 || view.getId() == R.id.model2 || view.getId() == R.id.model3) {
            mFragmentTransaction = mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg, new Pharmamodels());
            mFragmentTransaction.addToBackStack("pharmamodel");
            mFragmentTransaction.commit();
        }

        if (view.getId() == R.id.medicine1 || view.getId() == R.id.medicine2 || view.getId() == R.id.medicine3) {
            mFragmentTransaction = mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg, new Myselfmedicine());
            mFragmentTransaction.addToBackStack("myself medicine");
            mFragmentTransaction.commit();
        }
    }
}
