package com.example.dimas.helloworlddyr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutGameActivity extends AppCompatActivity {

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_game);
        btnBack = (Button)findViewById(R.id.btn_back);
    }

    public void kembaliKeMenu(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
