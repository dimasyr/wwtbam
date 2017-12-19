package com.example.dimas.helloworlddyr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultLabel = (TextView) findViewById(R.id.tv_hadiah);
        TextView resultText = (TextView) findViewById(R.id.tv_uangAnda);
        String skor = getIntent().getStringExtra("skorAnda");
        resultText.setText("Selamat "+InputNamaActivity.nama+", anda berhasil membawa");
        resultLabel.setText("Rp. "+skor);
    }

    public void keluarPermainan(View v){
        finish();
    }

    public void backToHome(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void mulaiPermainan(View v){
        Intent intent = new Intent(this,PlayActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {

    }
}
