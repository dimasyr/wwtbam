package com.example.dimas.helloworlddyr;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PlayActivity extends AppCompatActivity {

    ProgressBar pgBar;
    private int progress = 1;
    private int proses_fifty = 2;
    private TextView textHadiahSekarang;
    private TextView textPertanyaan;
    private TextView textCallAFriend;
    private TextView tvPgA;
    private TextView tvPgB;
    private TextView tvPgC;
    private TextView tvPgD;
    private Button btnJawabanA;
    private Button btnJawabanB;
    private Button btnJawabanC;
    private Button btnJawabanD;
    private ImageView btnFifty2;
    private ImageView btnCallAFriend;
    private ImageView btnVote;
    private ProgressBar pgA;
    private ProgressBar pgB;
    private ProgressBar pgC;
    private ProgressBar pgD;
    private View frameCallAFriend;
    private View framePermainan;
    private View frameVote;
    private boolean kesempatanCallaFriend = true;
    private String jawabanYangBenar;
    private int soalKe = 1;
    public MediaPlayer mainMusicMP;
    public MediaPlayer mainMusicMP2;
    public MediaPlayer soundCorrect;
    public MediaPlayer soundHelpCall;
    public MediaPlayer soundWrong;

    ArrayList<ArrayList<String>> pertanyaanArray = new ArrayList<>();

    String dataPertanyaan[][] = {
            // {"pertanyaan","jawaban yg benar","opsi2","opsi3","opsi4"}
            {"Orang Buta adalah orang yang tidak bisa melihat .Istilah yang digunakan untuk menyebut orang buta adalah ", "Tuna Netra", "Tuna Wisma", "Tuna Daksa", "Tuna Susila"},
            {"Jika dalam suatu denah, jarak sebenarnya 10 meter, digambar  1 centimeter, maka denah tersebut menggunakan skala", "1 : 1000", "10 : 100000", "1 : 10000", "1000 : 1"},
            {"Penyejuk Ruangan biasanya disebut AC, AC disini adalah singkatan dari", "Air Conditioner", "Air Conditioning", "Alternating Current", "Ante Christum"},
            {"Permainan kartu solitaire, umumnya dimainkan oleh", "1 Orang", "3 Orang", "2 Orang", "5 Orang"},
            {"Delegasi Indonesia dalam konferensi meja bundar adalah", "Drs. Moh. Hatta", "Sultan Hamid II", "Mohammad Natsir", "Soetomo"},
            {"Sistem sprinkle adalah proteksi gedung atau bangunan terhadap ", "Kebakaran", "Gempa", "Konsleting", "Tsunami"},
            {"Penduduk asli benua amerika adalah", "Indian", "Comanche", "Sioux", "Cheyenne"},
            {"Yang bukan merek mobil buatan eropa adalah ", "Honda", "Peugeut", "Mini Cooper", "Fiat"},
            {"Salah satu agen amerika adalah ATF, huruf F disini adalah singkatan dari", "Firearms", "Fighter", "Fordarms", "Forcearms"},
            {"Lapangan terbang rendani terletak dikota", "Manokwari", "Tidore Kepulauan", "Lhokseumawe", "Kotamobagu"},
            {"Negara bagian di AS yang lambing atau bendera bergambar George Washington adalah", "Washington", "Georgia", "Wisconsin", "Nebraska"},
            {"Sungai Amazone terletak di negara", "Brazilla", "Kolumbia", "Bolivia", "Ekuador"},
            {"Kata signal radio internasional yang digunakan sebagai panggilan minta pertolongan (distress call ) adalah", "May Day", "Help Day", "I Help", "Me Day"},
            {"Unit pembangkit Uap Air di pabrik dinamakan", "Boiler", "Evapolator", "SuperHeater", "Economizer"},
            {"Negara bagian AS yang dikenal dengan sebutan Sunflower adalah", "Kansa", "Montana", "Iola", "Hawaii"},
            {"Pengukur kecepatan arah angin", "Anemometer", "Densimeter", "Alimeter", "Luxmeter"},
            {"Huruf terakhir pada abjad yunani adalah", "Omega", "Upsilon", "Sigma", "Psi"},
            {"Nama ayah dan anak sama , dialah yang membagi kata menjadi 10 jenis, dia itu adalah", "Aristoteles", "Socrates", "Plato", "Anaximandros"},
            {"Dikota mana John f.kennedy dibunuh", "Dallas", "Austin", "El Paso", "Plano"},
            {"Pada fotosintesis, reaksi pengikatan CO2 berlangsung didalam", "Kloropas", "Epidermis", "Jaringan Spons", "Stomata"},
            {"Orang yang hobinya mengumpulkan dan mengoleksi perangko disebut", "Filatelis", "Filumenis", "Numimastik", "Librocubicularist"},
            {"Negara yang mempunyai hak Veto di forum PBB adalah", "Cina", "Jepang", "Indonesia", "Perancis"},
            {"Term yang umum dipakai untuk menyebut ruangan dalam kapal adalah", "Kabin", "Buritan", "Propeller", "Geladak Utama"},
            {"Percakapan antar pemain drama disebut", "Dialog", "Prolog", "Epilog", "Monolog"},
            {"Lagu kalayar berasal dari daerah", "Kalimatan Timur", "Kalimatan  Selatan", "Kalimatan Barat", "KALIMANTAN TENGAH"},
            {"Aktor yang bukan pemeran  James Bond adalah", "Harrison Ford", "Sean Connery", "George Lazenby", "Roger Moore"},
            {"Mick Jager adalah vokalis terkenal dari group musik", "The Smiths", "Black Sabbath", "ROLLING STONE", "Scorpions"},
            {"Pemain basket NBA yang terjangkung bernama Gheorge Minesan adalah atlet kelahiran", "Rumania", "Polandia", "Slowakia", "Ceko"},
            {"Negara Brunei Darussalam masuk sebagai anggota ASEAN sjak tahun", "1984", "1964", "1974", "1994"},
            {"Bakteri pengikat nitrogen yang hidup beesimbiosis dengan akar polong-polongan adalah", "Rhizobium", "RUMANIA", "Acetobacter", "Staphylococcus"},
            {"John Dever adalah penyanyi terkenal pada tahun 70 – an dengan lagu Take me Home Country road adalah pria kelahiran", "Meksiko", "Kanada", "Puerto Riko", "Kuba"},
            {"Lagu berikut berasal dari Sulawesi utara kecuali", "Pakarena", "Cik Cik Periook", "Badindang Ria", "Kandera Benaiso"},
            {"Negara yang mengklaim sebagai negara pemilik pipa minyak terpanjang di dunia adalah", "Kanada", "Arab Saudi", "Selandia Baru", "Kuwait"},
            {"Salah satu pemeran tokoh James Bond adalah", "Pierce Brosnan", "Robert Shaw", "John Jackman", "John Goodman"},
            {"Suku wolimo terdapat di provinsi", "Sulawesi Selatan", "Sumatra Barat", "Kalimantan Utara", "Jawa Timur"},
            {"C35, M35 dan S35 adalah nomor seri handphone dengan merek", "Siemens", "Sony", "Samsung", "Nokia"},
            {"Binatang apa yang digunakan sebagai simbol dalam pada majalah playboy ", "Kelinci", "Anjing", "Tikus", "Kucing"},
            {"Sungai Zaire terletak di afrika bagian", "Barat", "Selatan", "Utara", "Timur"},
            {"Titik yang digunakan untuk pengukuran ketinggian suatu tempat disebut", "Triangulasi", "Dramaturgi", "Etnografi", "Historis"},
            {"Dari keempat bilangan dibawah ini, yang bukan bilangan prima adalah", "4", "7", "19", "31"},
            {"Siapa nama teman wanita Donald Duck", "Daisy", "Minnie", "Elsa", "Anna"},
            {"Berasal dari planet apa Mr. Spock pada serial Star Treck", "Vulcan", "Cybertron", "Kepler", "Pandora"},
            {"Berikut produsen pupuk di Indonesia kecuali", "PT. Samator", "PT. BAS Organik", "PT. Dharma Ayu Tani", "PT. Sarana Hayati"},
    };

    String listHadiah[] = {"50.000", "1.000.000", "5.000.000", "15.000.000", "25.000.000", "50.000.000", "75.000.000", "100.000.000", "120.000.000", "180.000.000", "230.000.000", "400.000", "500.000.000", "600.000.000", "700.000.000", "1.000.000.000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        pgBar = (ProgressBar) findViewById(R.id.progressBar);
        pgBar.setMax(15);
        textHadiahSekarang = (TextView) findViewById(R.id.txt_hadiah_sekarang);
        textPertanyaan = (TextView) findViewById(R.id.tv_pertanyaan);
        btnJawabanA = (Button) findViewById(R.id.btn_answer_a);
        btnJawabanB = (Button) findViewById(R.id.btn_answer_b);
        btnJawabanC = (Button) findViewById(R.id.btn_answer_c);
        btnJawabanD = (Button) findViewById(R.id.btn_answer_d);
        btnFifty2 = (ImageView) findViewById(R.id.btn_help_fifty2);
        btnCallAFriend = (ImageView) findViewById(R.id.btn_help_call);
        btnVote = (ImageView) findViewById(R.id.btn_help_vote);
        textCallAFriend = (TextView) findViewById(R.id.tv_callafriend);
        frameCallAFriend = (View) findViewById(R.id.frame_layout_callafriend);
        framePermainan = (View) findViewById(R.id.frame_permainan);
        frameVote = (View)findViewById(R.id.frame_layout_vote);
        frameVote.setVisibility(View.GONE);
        frameCallAFriend.setVisibility(View.GONE);
        mainMusicMP = MediaPlayer.create(this,R.raw.lets_play);
        mainMusicMP2 = MediaPlayer.create(this,R.raw.satujuta_music);
        soundCorrect = MediaPlayer.create(this,R.raw.correct_answer);
        soundWrong = MediaPlayer.create(this,R.raw.wrong_answer);
        soundHelpCall = MediaPlayer.create(this,R.raw.phone_a_friend);
        mainMusicMP2.setLooping(true);
        mainMusicMP.start();
        mainMusicMP2.start();
        pgA = (ProgressBar) findViewById(R.id.pb_A);
        pgB = (ProgressBar) findViewById(R.id.pb_B);
        pgC = (ProgressBar) findViewById(R.id.pb_C);
        pgD = (ProgressBar) findViewById(R.id.pb_D);
        tvPgA = (TextView) findViewById(R.id.tv_pgA);
        tvPgB = (TextView) findViewById(R.id.tv_pgB);
        tvPgC = (TextView) findViewById(R.id.tv_pgC);
        tvPgD = (TextView) findViewById(R.id.tv_pgD);

        //Crate quizArray from quizData
        for (int i = 0; i < dataPertanyaan.length; i++) {

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

    public void tambahProgress(View v) {
        progress += 1;
        pgBar.setProgress(progress);
        textHadiahSekarang.setText(listHadiah[progress - 1]);
    }

    public void bantuanCallaFriend(View v) {
        if (kesempatanCallaFriend) {
            mainMusicMP2.pause();
            soundHelpCall.start();
            String jawaban = "";
            if (btnJawabanA.getText().toString().equals(jawabanYangBenar)) {
                jawaban = "A";
            } else if (btnJawabanB.getText().toString().equals(jawabanYangBenar)) {
                jawaban = "B";
            } else if (btnJawabanC.getText().toString().equals(jawabanYangBenar)) {
                jawaban = "C";
            } else if (btnJawabanD.getText().toString().equals(jawabanYangBenar)) {
                jawaban = "D";
            }
            frameCallAFriend.setVisibility(View.VISIBLE);
            //framePermainan.setVisibility(View.GONE);
            textCallAFriend.setText("Perkiraan tertinggi saya, saya rasa jawabannya adalah " + jawaban);
            kesempatanCallaFriend = false;
            btnCallAFriend.setVisibility(View.GONE);
        }
    }

    public void bantuanVote(View view) {
        frameVote.setVisibility(View.VISIBLE);
        if (btnJawabanA.getText().toString().equals(jawabanYangBenar)) {
            pgA.setProgress(60);
            tvPgA.setText("60%");
            pgB.setProgress(20);
            tvPgB.setText("20%");
            pgC.setProgress(10);
            tvPgC.setText("10%");
            pgD.setProgress(10);
            tvPgD.setText("10%");
        }
        if (btnJawabanB.getText().toString().equals(jawabanYangBenar)) {
            pgB.setProgress(65);
            tvPgB.setText("65%");
            pgA.setProgress(5);
            tvPgA.setText("5%");
            pgC.setProgress(20);
            tvPgC.setText("20%");
            pgD.setProgress(10);
            tvPgD.setText("10%");
        }
        if (btnJawabanC.getText().toString().equals(jawabanYangBenar)) {
            pgC.setProgress(58);
            tvPgC.setText("58%");
            pgA.setProgress(10);
            tvPgA.setText("10%");
            pgB.setProgress(12);
            tvPgB.setText("12%");
            pgD.setProgress(20);
            tvPgD.setText("20%");
        }
        if (btnJawabanD.getText().toString().equals(jawabanYangBenar)) {
            pgD.setProgress(54);
            tvPgD.setText("54%");
            pgA.setProgress(20);
            tvPgA.setText("20%");
            pgB.setProgress(16);
            tvPgB.setText("16%");
            pgC.setProgress(10);
            tvPgC.setText("10%");
        }
    }

    public void bantuanFifty2(View v) {
        for (int x = 1; x < 5; x++) {
            if (proses_fifty != 0) {
                if (x == 1) {
                    if (btnJawabanA.getText().toString().equals(jawabanYangBenar)) {

                    } else {
                        btnJawabanA.setText("");
                        proses_fifty--;
                    }
                } else if (x == 2) {
                    if (btnJawabanB.getText().toString().equals(jawabanYangBenar)) {

                    } else {
                        btnJawabanB.setText("");
                        proses_fifty--;
                    }
                } else if (x == 3) {
                    if (btnJawabanC.getText().toString().equals(jawabanYangBenar)) {

                    } else {
                        btnJawabanC.setText("");
                        proses_fifty--;
                    }
                } else {
                    if (btnJawabanD.getText().toString().equals(jawabanYangBenar)) {

                    } else {
                        btnJawabanD.setText("");
                        proses_fifty--;
                    }
                }
            } else {

            }
        }
        btnFifty2.setVisibility(View.INVISIBLE);
    }

    public void tutupBantuanCall(View v) {
        soundHelpCall.release();
        mainMusicMP2.start();
        frameCallAFriend.setVisibility(View.INVISIBLE);
        btnCallAFriend.setVisibility(View.INVISIBLE);
    }

    public void tutupBantuanVote(View view){
        frameVote.setVisibility(View.GONE);
        btnVote.setVisibility(View.GONE);
    }


    public void showNextQuiz2(View v) {
        showNextQuiz();
    }

    public void showNextQuiz() {
        //update hadiah sekarang
        textHadiahSekarang.setText(listHadiah[soalKe - 1]);

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

    public void cekJawaban(View view) {
        //mendapatkan button yg di tekan
        Button btnYangDitekan = (Button) findViewById(view.getId());
        String teksButtonnya = btnYangDitekan.getText().toString();

        String alertTitle;

        if (teksButtonnya.equals(jawabanYangBenar)) {
            alertTitle = "Benar!";
            if(soundCorrect.isPlaying()){
                soundCorrect.pause();
                soundCorrect.seekTo(0);
                soundCorrect.start();
            }
            else{
                soundCorrect.start();
            }
            Toast.makeText(getApplicationContext(), alertTitle, Toast.LENGTH_SHORT).show();
            soalKe++;
            tambahProgress(view);
            if (soalKe == 16) {
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                intent.putExtra("skorAnda", listHadiah[progress - 2]);
                startActivity(intent);
            } else {
                showNextQuiz();
            }


        } else {
            alertTitle = "Salah!";
            soundWrong.start();
            mainMusicMP2.setLooping(false);
            mainMusicMP2.release();
            Toast.makeText(getApplicationContext(), alertTitle, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
            if (soalKe == 1) {
                intent.putExtra("skorAnda", "0");
            } else {
                intent.putExtra("skorAnda", listHadiah[progress - 2]);
            }

            startActivity(intent);
        }

    }
}
