package com.allnewspapers.in.plaban;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

import com.allnewspapers.in.plaban.R;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;

    private TabLayout tabLayout ;
    private ViewPager viewPager ;
    private ViewPagerAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawer_id);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(true);
        toggle.syncState();



        tabLayout = findViewById(R.id.tablayout_id);
        viewPager = findViewById(R.id.viewpager_id);

        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //add Fragment Here

        adapter.AddFragment(new Bangla(),"Bangla");
        adapter.AddFragment(new English(),"English");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        String string = null;
        Intent intent = new Intent(this, All_Web_Pages.class);

        drawerLayout.closeDrawer(GravityCompat.START);
        if (item.getItemId()== R.id.menuTab){

            Toast.makeText(this, "Internet Speed Test", Toast.LENGTH_SHORT).show();

            string = "https://fast.com/";

            intent.putExtra("Web", string);
            this.startActivity(intent);

        }

        return false;
    }



}