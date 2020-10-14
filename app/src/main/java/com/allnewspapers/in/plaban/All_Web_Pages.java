package com.allnewspapers.in.plaban;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class All_Web_Pages extends AppCompatActivity {

    ProgressBar progressBar;
    TextView textView;

    String webPage;

    WebView superWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_page_content_main);

        webPage = getIntent().getStringExtra("Web");

        progressBar = findViewById(R.id.progressBar_ID);
        superWebView = findViewById(R.id.webView);

        superWebView.loadUrl(webPage);
        superWebView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = superWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(true);
        webSettings.setSupportZoom(false);
        webSettings.setCacheMode(webSettings.LOAD_NO_CACHE);
        webSettings.setDomStorageEnabled(true);

        superWebView.setScrollBarStyle(View.SCROLLBARS_OUTSIDE_OVERLAY);
        superWebView.setScrollbarFadingEnabled(true);


        superWebView.setWebChromeClient(new WebChromeClient() {

            @Override
            public void onProgressChanged(WebView view, int newProgress) {

                progressBar.setVisibility(View.VISIBLE);
                progressBar.setProgress(newProgress);
                String string = String.valueOf(newProgress);

                if (newProgress == 100) {
                    progressBar.setVisibility(View.GONE);
                }

                super.onProgressChanged(view, newProgress);
            }

        });


    }


    @Override
    public void onBackPressed() {
        if (this.superWebView.canGoBack()) {
            this.superWebView.goBack();
        } else {
            finish();
        }
    }
}
