package com.example.dimas.helloworlddyr;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    DataHelper dataHelper;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        dataHelper = new DataHelper(getApplicationContext());
//        db = dataHelper.getReadableDatabase();
    }

    public void mulaiPermainan(View v){
        Intent intent = new Intent(this,PlayActivity.class);
        startActivity(intent);
    }

    public void keluarPermainan(View v){
        finish();
    }
}
