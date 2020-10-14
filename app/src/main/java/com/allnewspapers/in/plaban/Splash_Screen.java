package com.allnewspapers.in.plaban;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Splash_Screen extends AppCompatActivity {

    ProgressBar progressBar ;
    TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        progressBar = findViewById(R.id.progress_bar);
        textView = findViewById(R.id.text_view);


       /* Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep(8000) ;
                    Intent intent = new Intent(Splash_Screen.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();*/


        progressBar.setMax(100);
        progressBar.setScaleY(3f);

        progressAnimation();




    }

    public void  progressAnimation(){

        Splash_Screen_ProgressAnimation anim = new Splash_Screen_ProgressAnimation(this,progressBar,textView,0f,100f);
        anim.setDuration(2000);
        progressBar.setAnimation(anim);

    }


}