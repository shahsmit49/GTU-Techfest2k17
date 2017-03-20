package com.es.smit.gtu_techfest5;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.es.smit.gtu_techfest5.MapsActivity;
import com.es.smit.gtu_techfest5.R;

import java.util.Locale;


public class contact_us extends Fragment implements View.OnClickListener
{
    TextView t1,t2,t3,t4;
    ImageView iv1,iv2,iv3;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state)
    {
        getActivity().setTitle("Contact Us");
        View v = inflater.inflate(R.layout.contact_us,container,false);
        mFragmentManager=getFragmentManager();

        t1 = (TextView) v.findViewById(R.id.textView6);
        t2 = (TextView) v.findViewById(R.id.textview7);
        t3 = (TextView) v.findViewById(R.id.textView8);
        t4 = (TextView) v.findViewById(R.id.textview10);

        iv1 = (ImageView) v.findViewById(R.id.imageButton);
        iv2 = (ImageView) v.findViewById(R.id.imageButton1);
        iv3 = (ImageView) v.findViewById(R.id.imageButton2);

        t1.setOnClickListener(this);
        t2.setOnClickListener(this);
        t3.setOnClickListener(this);
        t4.setOnClickListener(this);

        iv1.setOnClickListener(this);
        iv2.setOnClickListener(this);
        iv3.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v)
    {
        if(v.getId()==R.id.textView6 || v.getId()==R.id.textview7 || v.getId()==R.id.imageButton )
        {

            /*mFragmentTransaction = mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new MapsActivity());
            mFragmentTransaction.addToBackStack("maps1"); */ //backstackname
            String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?daddr=%f,%f", 21.132894, 72.717705);
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
            startActivity(intent);

           // mFragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            //Toast.makeText(this,"maps",Toast.LENGTH_SHORT).show();
            //mFragmentTransaction.commit();
        }
        if(v.getId()==R.id.textview9 || v.getId()==R.id.imageButton1 || v.getId()==R.id.textView8)
        {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:+918980038196"));
            startActivity(intent);
        }
        if( v.getId()==R.id.imageButton2 )
        {
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("mailto:"+"techfest17@ckpcet.ac.in"));
            startActivity(intent);
        }
    }
}
