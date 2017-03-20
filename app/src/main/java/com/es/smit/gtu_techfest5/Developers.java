package com.es.smit.gtu_techfest5;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Admin on 28/02/2017.
 */

public class Developers extends Fragment implements View.OnClickListener
{

    ImageView iv1,iv2,iv3;
    ImageView iv4,iv5,iv6;
    ImageView iv7,iv8,iv9,i8,i9;
    TextView t8,t9;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state)
    {
        View v = inflater.inflate(R.layout.developers,container,false);

        iv1 = (ImageView) v.findViewById(R.id.vln);
        iv2 = (ImageView) v.findViewById(R.id.vg);
        iv3 = (ImageView) v.findViewById(R.id.vfb);

        iv4 = (ImageView) v.findViewById(R.id.sln);
        iv5 = (ImageView) v.findViewById(R.id.sg);
        iv6 = (ImageView) v.findViewById(R.id.sfb);

        iv7 = (ImageView) v.findViewById(R.id.fln);
        iv8 = (ImageView) v.findViewById(R.id.fg);
        iv9 = (ImageView) v.findViewById(R.id.ffb);
        i8 = (ImageView) v.findViewById(R.id.imageButton8);
        i9 = (ImageView) v.findViewById(R.id.imageButton9);
        t8 = (TextView) v.findViewById(R.id.textbutton8);
        t9 = (TextView) v.findViewById(R.id.textbutton9);


        iv1.setOnClickListener(this);
        iv2.setOnClickListener(this);
        iv3.setOnClickListener(this);

        iv4.setOnClickListener(this);
        iv5.setOnClickListener(this);
        iv6.setOnClickListener(this);

        iv7.setOnClickListener(this);
        iv8.setOnClickListener(this);
        iv9.setOnClickListener(this);
        i8.setOnClickListener(this);
        i9.setOnClickListener(this);
        t8.setOnClickListener(this);
        t9.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v)
    {
        if(v.getId()==R.id.vln)
        {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://in.linkedin.com/in/vishvesh-soni-a25276101"));
            startActivity(intent);
        }
        if(v.getId()==R.id.vg)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("mailto:"+"vishveshsoni54@gmail.com"));
            startActivity(intent);
        }
        if(v.getId()==R.id.vfb)
        {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.facebook.com/vishvesh.soni.1"));
            startActivity(intent);
        }



        if(v.getId()==R.id.sln)
        {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://in.linkedin.com/in/smit-shah-459459b2"));
            startActivity(intent);
        }
        if(v.getId()==R.id.sg)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("mailto:"+"shahsmit49@gmail.com"));
            startActivity(intent);
        }
        if(v.getId()==R.id.sfb)
        {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.facebook.com/smit.shah.507027"));
            startActivity(intent);
        }


        if(v.getId()==R.id.fln)
        {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://in.linkedin.com/in/falgun-patel-977283101"));
            startActivity(intent);
        }
        if(v.getId()==R.id.fg)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("mailto:"+"falgunpatel96@gmail.com"));
            startActivity(intent);
        }
        if(v.getId()==R.id.ffb)
        {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.facebook.com/falgun.patel.33"));
            startActivity(intent);
        }


        if(v.getId()==R.id.imageButton8 || v.getId()==R.id.textbutton8)
        {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://github.com/vishveshsoni/GTU-Techfest-17"));
            startActivity(intent);
        }


        if(v.getId()==R.id.imageButton9 || v.getId()==R.id.textbutton9)
        {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.es.smit.gtu_techfest5"));
            startActivity(intent);
        }
    }
}
