package com.es.smit.gtu_techfest5;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by smit on 20-02-2017.
 */

public class CustomAd extends BaseAdapter
{
    MainActivity c;
    ImageView iv;
    int a[]={R.drawable.home,R.drawable.events,R.drawable.map,R.drawable.share4,R.drawable.calendarr,R.drawable.contact,R.drawable.dev};
    String names[]={"Home","Events","Map","Spread the word","Schedule","Contact Us","Developers"};

    public  CustomAd(MainActivity mc)
    {
        c=mc;
    }
    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        LayoutInflater lf=LayoutInflater.from(c);
        View v=lf.inflate(R.layout.menu_item,null);
        TextView tx=(TextView)v.findViewById(R.id.item_text);
        tx.setText(names[i]);
        iv=(ImageView)v.findViewById(R.id.menu_item_icon);
        iv.setImageResource(a[i]);
        return  v;
    }
}
