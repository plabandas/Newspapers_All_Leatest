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

public class All_Web_Pages extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;

    ProgressBar progressBar;
    TextView textView;

    String webPage;

    WebView superWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_page_drawer_for_webpage);

        webPage = getIntent().getStringExtra("Web");


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.nav_view);
        progressBar = findViewById(R.id.progressBar_ID);
        navigationView.setNavigationItemSelectedListener(this);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(true);
        toggle.syncState();

        superWebView = findViewById(R.id.webView);
        textView = findViewById(R.id.App_bar_text_progress);

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

                if (newProgress < 100) {
                    textView.setText("Loading " + string + "%");
                }
                if (newProgress == 100) {
                    textView.setText("");
                }


                if (newProgress == 100) {
                    progressBar.setVisibility(View.GONE);
                }

                super.onProgressChanged(view, newProgress);
            }

        });

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        drawerLayout.closeDrawer(GravityCompat.START);
        if (item.getItemId() == R.id.menuTab) {
            Toast.makeText(this, "Btn is clicked.", Toast.LENGTH_SHORT).show();
        }

        return false;
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
