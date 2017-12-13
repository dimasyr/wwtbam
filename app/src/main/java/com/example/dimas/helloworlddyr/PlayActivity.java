package com.example.dimas.helloworlddyr;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PlayActivity extends AppCompatActivity {

    ProgressBar pgBar;
    private static int progress = 1;
    private TextView textHadiahSekarang;
    private TextView textPertanyaan;
    private Button btnJawabanA;
    private Button btnJawabanB;
    private Button btnJawabanC;
    private Button btnJawabanD;

    private String jawabanYangBenar;
    private int soalKe = 1;
    private boolean salah = false;

    ArrayList<ArrayList<String>> pertanyaanArray = new ArrayList<>();

    String dataPertanyaan[][]={
        // {"pertanyaan","jawaban yg benar","opsi2","opsi3","opsi4"}
            {"Siapakah penemu mesin turing","Alan Turing","Alan Walker","Alan Mbah Dukun","Alan Alan Yuk"},
            {"Apa kepanjangan dari KTP","Kartu Tanda Penduduk","Kartu Tanda Lahir","Kartu Tanda Pengenal","Kartu Tanda Pelajar"},
            {"Jika kita berhasil membunuh semua lawan pada game Mobile Legend, apa yang akan kita dapat","Savage","Maniac","Chain Killer","Headshot"},
            {"pertanyaan","jawaban yg benar","opsi2","opsi3","opsi4"},
            {"pertanyaan","jawaban yg benar","opsi2","opsi3","opsi4"},
            {"pertanyaan","jawaban yg benar","opsi2","opsi3","opsi4"},
            {"pertanyaan","jawaban yg benar","opsi2","opsi3","opsi4"},
            {"pertanyaan","jawaban yg benar","opsi2","opsi3","opsi4"},
            {"pertanyaan","jawaban yg benar","opsi2","opsi3","opsi4"},
            {"pertanyaan","jawaban yg benar","opsi2","opsi3","opsi4"},
            {"pertanyaan","jawaban yg benar","opsi2","opsi3","opsi4"},
            {"pertanyaan","jawaban yg benar","opsi2","opsi3","opsi4"},
            {"pertanyaan","jawaban yg benar","opsi2","opsi3","opsi4"},
            {"pertanyaan","jawaban yg benar","opsi2","opsi3","opsi4"},
            {"pertanyaan","jawaban yg benar","opsi2","opsi3","opsi4"},
    };

    String listHadiah[]={"50.000","100.000","250.000","50.000","100.000","250.000","50.000","100.000","250.000","50.000","100.000","250.000","50.000","100.000","250.000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        pgBar = (ProgressBar) findViewById(R.id.progressBar);
        pgBar.setMax(15);
        textHadiahSekarang = (TextView)findViewById(R.id.txt_hadiah_sekarang);
        textPertanyaan = (TextView)findViewById(R.id.tv_pertanyaan);
        btnJawabanA = (Button)findViewById(R.id.btn_answer_a);
        btnJawabanB = (Button)findViewById(R.id.btn_answer_b);
        btnJawabanC = (Button)findViewById(R.id.btn_answer_c);
        btnJawabanD = (Button)findViewById(R.id.btn_answer_d);

        //Crate quizArray from quizData
        for(int i=0;i<dataPertanyaan.length;i++){

            //prepare array
            ArrayList<String> tmpArray = new ArrayList<>();
            tmpArray.add(dataPertanyaan[i][0]); //pertanyaan
            tmpArray.add(dataPertanyaan[i][1]); //jwbnya
            tmpArray.add(dataPertanyaan[i][2]); //opsi2
            tmpArray.add(dataPertanyaan[i][3]); //opsi3
            tmpArray.add(dataPertanyaan[i][4]); //opsi4

            //add tmpArray to pertanyaanArray
            pertanyaanArray.add(tmpArray);
        }
        pgBar.setProgress(progress);

        showNextQuiz();
    }

    public void tambahProgress(View v){
        progress+=1;
        pgBar.setProgress(progress);
        textHadiahSekarang.setText(progress+"");
    }

    public void bantuanFifty2(View v){

    }

    public void showNextQuiz2(View v){
        showNextQuiz();
    }

    public void showNextQuiz(){
        //update hadiah sekarang
        textHadiahSekarang.setText(listHadiah[soalKe-1]);

        //random soal
        Random rand = new Random();
        int randNum = rand.nextInt(pertanyaanArray.size());

        //ambil satu pertanyaan
        ArrayList<String> pertanyaan = pertanyaanArray.get(randNum);

        //set pertanyaan dan jawaban yg benar
        textPertanyaan.setText(pertanyaan.get(0));
        jawabanYangBenar = pertanyaan.get(1);

        //remove soal dari pertanyaan dan mengacak jawaban
        pertanyaan.remove(0);
        Collections.shuffle(pertanyaan);

        //set jawaban
        btnJawabanA.setText(pertanyaan.get(0));
        btnJawabanB.setText(pertanyaan.get(1));
        btnJawabanC.setText(pertanyaan.get(2));
        btnJawabanD.setText(pertanyaan.get(3));

        //remove isi pertanyaan dari pertanyaanArray
        pertanyaanArray.remove(randNum);
    }

    public void cekJawaban(View view){
        //mendapatkan button yg di tekan
        Button btnYangDitekan = (Button)findViewById(view.getId());
        String teksButtonnya = btnYangDitekan.getText().toString();

        String alertTitle;

        if (teksButtonnya.equals(jawabanYangBenar)){
            alertTitle = "Benar!";
            soalKe++;
            showNextQuiz();
        } else {
            alertTitle = "Salah!";
            salah = true;
        }

    }
}
