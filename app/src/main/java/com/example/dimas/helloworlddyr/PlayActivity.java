package com.example.dimas.helloworlddyr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class PlayActivity extends AppCompatActivity {

    ProgressBar pgBar;
    private static int progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        pgBar = (ProgressBar) findViewById(R.id.progressBar);
        pgBar.setMax(15);
        progress=0;
    }

    public void tambahProgress(View v){
        pgBar.setProgress(progress);
        progress+=1;
    }

    public void bantuanFifty2(View v){

    }
}
