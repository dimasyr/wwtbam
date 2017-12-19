package com.example.dimas.helloworlddyr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputNamaActivity extends AppCompatActivity {

    public static String nama;
    private EditText inputan_nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_nama);
        inputan_nama = (EditText)findViewById(R.id.input_nama_user);
    }

    public void mulaiSekarang(View v){
        nama = inputan_nama.getText().toString();
        Intent intent = new Intent(this,PlayActivity.class);
        startActivity(intent);
    }
}
