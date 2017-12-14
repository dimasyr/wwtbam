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
            {"Orang Buta adalah orang yang tidak bisa melihat .Istilah yang digunakan untuk menyebut orang buta adalah ","Tuna Netra","Tuna Wisma","Tuna Daksa","Tuna Susila"},
            {"Jika dalam suatu denah, jarak sebenarnya 10 meter, digambar  1 centimeter, maka denah tersebut menggunakan skala","1 : 1000","10 : 100000","1 : 10000","1000 : 1"},
            {"Penyejuk Ruangan biasanya disebut AC, AC disini adalah singkatan dari","Air Conditioner","Air Conditioning","Alternating Current","Ante Christum"},
            {"Permainan kartu solitaire, umumnya dimainkan oleh","1 Orang","3 Orang","2 Orang","5 Orang"},
            {"Delegasi Indonesia dalam konferensi meja bundar adalah","Drs. Moh. Hatta","Sultan Hamid II","Mohammad Natsir","Soetomo"},
            {"Sistem sprinkle adalah proteksi gedung atau bangunan terhadap ","Kebakaran","Gempa","Konsleting","Tsunami"},
            {"Penduduk asli benua amerika adalah","Indian" ,"Comanche","Sioux","Cheyenne"},
            {"Yang bukan merek mobil buatan eropa adalah ","Honda","Peugeut","Mini Cooper","Fiat"},
            {"Salah satu agen amerika adalah ATF, huruf F disini adalah singkatan dari","Firearms" ,"Fighter","Fordarms","Forcearms"},
            {"Lapangan terbang rendani terletak dikota" ,"Manokwari","Tidore Kepulauan","Lhokseumawe","Kotamobagu"},
            {"Negara bagian di AS yang lambing atau bendera bergambar George Washington adalah","Washington","Georgia","Wisconsin" ,"Nebraska"},
            {"Sungai Amazone terletak di negara","Brazilla","Kolumbia","Bolivia","Ekuador"},
            {"Kata signal radio internasional yang digunakan sebagai panggilan minta pertolongan (distress call ) adalah","May Day","Help Day","I Help","Me Day"},
            {"Unit pembangkit Uap Air di pabrik dinamakan" ,"Boiler","Evapolator","SuperHeater","Economizer"},
            {"Negara bagian AS yang dikenal dengan sebutan Sunflower adalah","Kansa","Montana","Iola","Hawaii"},
            {"Pengukur kecepatan arah angin","Anemometer","Densimeter","Alimeter","Luxmeter"},
            {"Huruf terakhir pada abjad yunani adalah" ,"Omega","Upsilon" ,"Sigma","Psi"},
            {"Nama ayah dan anak sama , dialah yang membagi kata menjadi 10 jenis, dia itu adalah","Aristoteles","Socrates","Plato","Anaximandros"},
            {"Dikota mana John f.kennedy dibunuh" ,"Dallas" ,"Austin","El Paso" ,"Plano"},
            {"Pada fotosintesis, reaksi pengikatan CO2 berlangsung didalam","Kloropas","Epidermis","Jaringan Spons","Stomata"},
            {"Orang yang hobinya mengumpulkan dan mengoleksi perangko disebut","Filatelis" ,"Filumenis","Numimastik","Librocubicularist"},
            {"Negara yang mempunyai hak Veto di forum PBB adalah","Cina","Jepang","Indonesia","Perancis"},
            {"Term yang umum dipakai untuk menyebut ruangan dalam kapal adalah","Kabin","Buritan","Propeller","Geladak Utama"},
            {"Percakapan antar pemain drama disebut" ,"Dialog","Prolog","Epilog","Monolog"},
            {"Lagu kalayar berasal dari daerah","Kalimatan Timur","Kalimatan  Selatan","Kalimatan Barat","KALIMANTAN TENGAH"},
            {"Aktor yang bukan pemeran  James Bond adalah","Harrison Ford","Sean Connery","George Lazenby","Roger Moore"},
            {"Mick Jager adalah vokalis terkenal dari group musik","The Smiths","Black Sabbath","ROLLING STONE","Scorpions"},
            {"Pemain basket NBA yang terjangkung bernama Gheorge Minesan adalah atlet kelahiran","Rumania","Polandia","Slowakia" ,"Ceko"},
            {"Negara Brunei Darussalam masuk sebagai anggota ASEAN sjak tahun","1984", "1964", "1974","1994"},
            {"Bakteri pengikat nitrogen yang hidup beesimbiosis dengan akar polong-polongan adalah" ,"Rhizobium","RUMANIA","Acetobacter","Staphylococcus"},
            {"John Dever adalah penyanyi terkenal pada tahun 70 – an dengan lagu Take me Home Country road adalah pria kelahiran","Meksiko","Kanada","Puerto Riko","Kuba"},
            {"Lagu berikut berasal dari Sulawesi utara kecuali","Pakarena","Cik Cik Periook","Badindang Ria","Kandera Benaiso"},
            {"Negara yang mengklaim sebagai negara pemilik pipa minyak terpanjang di dunia adalah","Kanada","Arab Saudi","Selandia Baru","Kuwait"},
            {"Salah satu pemeran tokoh James Bond adalah","Pierce Brosnan","Robert Shaw","John Jackman","John Goodman"},
            {"Suku wolimo terdapat di provinsi","Sulawesi Selatan","Sumatra Barat","Kalimantan Utara","Jawa Timur"},
            {"C35, M35 dan S35 adalah nomor seri handphone dengan merek","Siemens","Sony" ,"Siemens","Nokia"},
            {"Binatang apa yang digunakan sebagai simbol dalam pada majalah playboy ","Kelinci","Anjing","Tikus","Kucing"},
            {"Sungai Zaire terletak di afrika bagian","Barat","Selatan","Utara","Timur"},
            {"Titik yang digunakan untuk pengukuran ketinggian suatu tempat disebut","Triangulasi","Dramaturgi","Etnografi","Historis"},
            {"Dari keempat bilangan dibawah ini, yang bukan bilangan prima adalah","4","7" ,"19","31"},
            {"Siapa nama teman wanita Donald Duck" ,"Daisy","Minnie","Elsa","Anna"},
            {"Berasal dari planet apa Mr. Spock pada serial Star Treck","Vulcan","Cybertron","Kepler","Pandora"},
            {"Berikut produsen pupuk di Indonesia kecuali","PT. Samator","PT. BAS Organik","PT. Dharma Ayu Tani","PT. Sarana Hayati"},
    };

    String listHadiah[]={"50.000","1.000.000","5.000.000","15.000.000","25.000.000","50.000.000","75.000.000","100.000.000","120.000.000","180.000.000","230.000.000","400.000","500.000.000","600.000.000","700.000.000","1.000.000.000"};

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
