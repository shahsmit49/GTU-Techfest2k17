package com.es.smit.gtu_techfest5;

import android.content.Intent;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements OnItemClickListener,DrawerLayout.DrawerListener
{
    CustomAd cad;
    DrawerLayout mDrawerLayout;
    ListView lv;
    ActionBarDrawerToggle mDrawerToggle;
    FrameLayout mFrameLayout;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*if(savedInstanceState==null)
        {
            mFragmentManager=getFragmentManager();
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.add(R.id.frg,new Home());
            mFragmentTransaction.addToBackStack("Home");
            mFragmentTransaction.commit();
        }*/
        mDrawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(Color.WHITE);
        lv=(ListView)findViewById(R.id.listView1);
        cad=new CustomAd(this);
        lv.setAdapter(cad);

        mDrawerLayout.openDrawer(lv);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        lv.setOnItemClickListener(this);
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mFragmentManager=getFragmentManager();
        mFragmentTransaction=mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.frg,new Home());
        mFragmentTransaction.commit();
    }

    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    @Override
    public void onDrawerSlide(View drawerView, float slideOffset) {
        toolbar.setBackgroundColor(getResources().getColor(R.color.toolbarr));
    }

    @Override
    public void onDrawerOpened(View drawerView) {
        toolbar.setBackgroundColor(getResources().getColor(R.color.toolbarr));

    }

    @Override
    public void onDrawerClosed(View drawerView) {
        toolbar.setBackgroundColor(getResources().getColor(R.color.toolbarr));

    }

    @Override
    public void onDrawerStateChanged(int newState) {
        toolbar.setBackgroundColor(getResources().getColor(R.color.toolbarr));

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
    {
        switch (i)
        {
            case 0:
                addFragment(i);
                break;
            case 1:
                addFragment(i);
                break;
            case 2:
                addFragment(i);
                break;
            case 3:
                addFragment(i);
                break;
            case 4:
                addFragment(i);
                break;
            case 5:
                addFragment(i);
                break;
            case 6:
                addFragment(i);
                break;

        }
        mDrawerLayout.closeDrawer(lv);
        //setTitlee(cad.names[i]);
    }
    void setTitlee(String title)
    {
        CharSequence cs=title;
        getSupportActionBar().setTitle(cs);
    }
    public void addFragment(int i)
    {
        if(i==0)
        {
            //String backStateName="Home";
            //boolean fragmentpooped=mFragmentManager.popBackStackImmediate(backStateName,0);
            //if(!fragmentpooped)
            //{
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Home());
            //mFragmentTransaction.addToBackStack(null);  //backStateName
            mFragmentManager.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
            // Toast.makeText(this,"new",Toast.LENGTH_SHORT).show();
            mFragmentTransaction.commit();
            //}
        }
        if(i==1)
        {
            //String backStateName="Events";
            //boolean fragmentpooped=mFragmentManager.popBackStackImmediate(backStateName,0);
            //if(!fragmentpooped)
            //{
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Events());
            mFragmentTransaction.addToBackStack("events");  //backstackname

            mFragmentManager.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
            // Toast.makeText(this,"new",Toast.LENGTH_SHORT).show();
            mFragmentTransaction.commit();
            //}
        }
        if(i==2)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new MapsActivity());
            mFragmentTransaction.addToBackStack("maps");  //backstackname

            mFragmentManager.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
            //Toast.makeText(this,"maps",Toast.LENGTH_SHORT).show();
            mFragmentTransaction.commit();
        }

        if(i==3)
        {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT,
                    "Hey check out our techfest app at: https://play.google.com/store/apps/details?id=com.es.smit.gtu_techfest5");
            sendIntent.setType("text/plain");
            startActivity(sendIntent);
        }
        if(i==5)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new contact_us());
            mFragmentTransaction.addToBackStack("contact");  //backstackname

            mFragmentManager.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
            //Toast.makeText(this,"maps",Toast.LENGTH_SHORT).show();
            mFragmentTransaction.commit();
        }
        if(i==6)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Developers());
            mFragmentTransaction.addToBackStack("devs");  //backstackname

            mFragmentManager.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
            //Toast.makeText(this,"maps",Toast.LENGTH_SHORT).show();
            mFragmentTransaction.commit();
        }
        if(i==4)
        {
            mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frg,new Buttonss());
            mFragmentTransaction.addToBackStack("schedule");  //backstackname

            mFragmentManager.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
            //Toast.makeText(this,"maps",Toast.LENGTH_SHORT).show();
            mFragmentTransaction.commit();
        }
    }

    /*@Override
    public void onBackPressed() {
        if (mFragmentManager.getBackStackEntryCount() > 0) {
            mFragmentManager.popBackStack();

        } else {
            super.onBackPressed();
        }
    }*/
}
