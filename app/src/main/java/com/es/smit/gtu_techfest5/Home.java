package com.es.smit.gtu_techfest5;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by smit on 20-02-2017.
 */

public class Home extends android.app.Fragment
{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state)
    {
        getActivity().setTitle("Home");
        View v=inflater.inflate(R.layout.home,container,false);
        return v;
    }
}
