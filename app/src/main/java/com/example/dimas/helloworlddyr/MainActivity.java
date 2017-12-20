package com.example.dimas.helloworlddyr;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    DataHelper dataHelper;
    SQLiteDatabase db;
    public MediaPlayer mainMusicMP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        dataHelper = new DataHelper(getApplicationContext());
//        db = dataHelper.getReadableDatabase();
        mainMusicMP = MediaPlayer.create(this,R.raw.main_theme);
        mainMusicMP.start();
    }

    @Override
    public void onBackPressed(){

    }


    public void mulaiPermainan(View v){
        mainMusicMP.release();
        Intent intent = new Intent(this,InputNamaActivity.class);
        startActivity(intent);
    }

    public void keluarPermainan(View v){
        mainMusicMP.release();
        finish();
    }
}
