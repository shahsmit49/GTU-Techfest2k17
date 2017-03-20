package com.es.smit.gtu_techfest5.pharmacy;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.es.smit.gtu_techfest5.R;

import java.util.Calendar;

/**
 * Created by smit on 28-02-2017.
 */

public class Pharmarecipe extends Fragment implements View.OnClickListener
{
    Button b;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state)
    {
        getActivity().setTitle("Pharma Recipe");
        View v=inflater.inflate(R.layout.details_pharmarecipe,container,false);
        b=(Button)v.findViewById(R.id.set_alarm);
        b.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.set_alarm)
        {
            Calendar cal=Calendar.getInstance();
            cal.set(2017,02,06,9,00);
            Intent intent = new Intent(Intent.ACTION_EDIT);
            intent.setType("vnd.android.cursor.item/event");
            intent.putExtra(CalendarContract.Events.TITLE, "GTU-Techfest");
            intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,cal.getTimeInMillis());
            intent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
            intent.putExtra(CalendarContract.Events.EVENT_LOCATION, "C K Pithawala College of Eng & Tech");
            startActivity(intent);
        }
    }
}

