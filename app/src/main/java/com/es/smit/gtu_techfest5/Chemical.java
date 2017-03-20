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

import com.es.smit.gtu_techfest5.chemical.Chemocar;
import com.es.smit.gtu_techfest5.chemical.Chemohunt;
import com.es.smit.gtu_techfest5.pharmacy.Myselfmedicine;
import com.es.smit.gtu_techfest5.pharmacy.Pharmamodels;
import com.es.smit.gtu_techfest5.pharmacy.Pharmarecipe;

/**
 * Created by smit on 28-02-2017.
 */

public class Chemical extends Fragment implements View.OnClickListener {
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    ImageView car1, hunt1;
    TextView car2, car3, hunt2, hunt3;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state) {
        View v = inflater.inflate(R.layout.details_chemical, container, false);
        getActivity().setTitle("Chemical");
        mFragmentManager = getFragmentManager();
        car1 = (ImageView) v.findViewById(R.id.car1);
        hunt1 = (ImageView) v.findViewById(R.id.hunt1);

        car2 = (TextView) v.findViewById(R.id.car2);
        car3 = (TextView) v.findViewById(R.id.car3);
        hunt2 = (TextView) v.findViewById(R.id.hunt2);
        hunt3 = (TextView) v.findViewById(R.id.hunt3);


        car1.setOnClickListener(this);
        car2.setOnClickListener(this);
        car3.setOnClickListener(this);
        hunt1.setOnClickListener(this);
        hunt2.setOnClickListener(this);
        hunt3.setOnClickListener(this);


        return v;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.car1 || view.getId() == R.id.car2 || view.getId() == R.id.car3) {
            mFragmentTransaction = mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg, new Chemocar());
            mFragmentTransaction.addToBackStack("chemocar");
            mFragmentTransaction.commit();
        }

        if (view.getId() == R.id.hunt1 || view.getId() == R.id.hunt2 || view.getId() == R.id.hunt3) {
            mFragmentTransaction = mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg, new Chemohunt());
            mFragmentTransaction.addToBackStack("chemohunt");
            mFragmentTransaction.commit();
        }

    }
}
