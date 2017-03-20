package com.es.smit.gtu_techfest5;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by smit on 02-03-2017.
 */

public class WebVieew extends android.app.Fragment
{
    WebView wb;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state)
    {
        getActivity().setTitle("Schedule");
        View v=inflater.inflate(R.layout.webvieww,container,false);
        wb=(WebView)v.findViewById(R.id.webview1);
        wb.setWebViewClient(new WebViewClient());
        wb.getSettings().setBuiltInZoomControls(true);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        wb.loadUrl("http://www.techfest.ckpcetinspire.in/schedule/mobile_day1.html");
        wb.setOnKeyListener(new View.OnKeyListener()
        {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event)
            {
                if(event.getAction() == KeyEvent.ACTION_DOWN)
                {
                    WebView webView = (WebView) v;

                    switch(keyCode)
                    {
                        case KeyEvent.KEYCODE_BACK:
                            if(webView.canGoBack())
                            {
                                webView.goBack();
                                return true;
                            }
                            break;
                    }
                }

                return false;
            }
        });
        return v;
    }
}

