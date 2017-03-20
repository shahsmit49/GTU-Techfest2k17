package com.es.smit.gtu_techfest5.computer;

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
 * Created by smit on 25-02-2017.
 */

public class etreasure_computer extends Fragment implements View.OnClickListener
{
    Button b;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state)
    {
        getActivity().setTitle("E-Treasure Hunt");
        View v=inflater.inflate(R.layout.details_etreasurehunt,container,false);
        b = (Button) v.findViewById(R.id.set_alarm);
        b.setOnClickListener(this);
        return v;
    }

    public void onClick(View view) {
        if (view.getId() == R.id.set_alarm) {
            Calendar cal = Calendar.getInstance();
            cal.set(2017, 02, 06, 9, 00);


            Intent intent = new Intent(Intent.ACTION_EDIT);
            intent.setType("vnd.android.cursor.item/event");
            intent.putExtra(CalendarContract.Events.TITLE, "GTU-Techfest");
            intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, cal.getTimeInMillis());
            intent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
            intent.putExtra(CalendarContract.Events.EVENT_LOCATION, "C K Pithawala College of Eng & Tech");
            startActivity(intent);
        }
    }
}
