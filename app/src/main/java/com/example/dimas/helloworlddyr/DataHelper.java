package com.example.dimas.helloworlddyr;

import android.content.Context;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;
        import android.util.Log;


public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "game.db";
    private static final int DATABASE_VERSION = 1;

    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String sql = "" +
                "CREATE TABLE pertanyaan(" +
                "id TEXT UNIQUE, " +
                "level NUMBER, " +
                "soal TEXT, " +
                "kuncijawaban TEXT, " +
                "jawabanA TEXT, " +
                "jawabanB TEXT, " +
                "jawabanC TEXT, " +
                "jawabanD TEXT " +
                ");";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        //level 1
        sql = "INSERT INTO pertanyaan(id) VALUES('001');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('1');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Orang Buta adalah orang yang tidak bisa melihat .Istilah yang digunakan untuk menyebut orang buta adalah');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('A');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Tuna Netra');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Tuna Wisma');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Tuna Daksu');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Tuna Susila');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('002');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('1');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Jika dalam suatu denah, jarak sebenarnya 10 meter, digambar  1 centimeter, maka denah tersebut menggunakan skala');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('C');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('10 : 100000');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('1 : 10000');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('1 : 1000');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('1000 : 1');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('003');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('1');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Penyejuk Ruangan biasanya disebut AC, AC disini adalah singkatan dari');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('B');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Air Conditioning');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Air Conditioner');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Alternating Current');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Ante Christum');";
        db.execSQL(sql);

        //level 2
        sql = "INSERT INTO pertanyaan(id) VALUES('004');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('2');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Permainan kartu solitaire, umumnya dimainkan oleh');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('A');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('1 Orang');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('3 Orang');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('2 Orang');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('5 Orang');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('005');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('2');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Delegasi Indonesia dalam konferensi meja bundar adalah');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('D');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Sultan Hamid II');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Mohammad Natsir');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Soetomo');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Drs. Moh. Hatta');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('006');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('2');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Sistem sprinkle adalah proteksi gedung atau bangunan terhadap');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('A');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Kebakaran');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Gempa');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Konsleting');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Tsunami');";
        db.execSQL(sql);

        //level 3
        sql = "INSERT INTO pertanyaan(id) VALUES('007');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('3');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Nama Ibukota Pakistan adalah');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('B');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Karachi');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Islam Abad');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Skardu');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Abbottabad');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('008');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('3');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Jumlah sudut dalam segitiga adalah');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('A');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('180');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('60');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('360');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('270');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('009');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('3');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Penduduk asli benua amerika adalah');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('D');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Cheyenne');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Comanche');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Sioux');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Indian');";
        db.execSQL(sql);

        //level 4
        sql = "INSERT INTO pertanyaan(id) VALUES('010');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('4');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Yang bukan merek mobil buatan eropa adalah');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('B');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Peugeut');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Honda');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Mini Cooper');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Fiat');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('011');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('4');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Salah satu agen amerika adalah ATF, huruf F disini adalah singkatan dari');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('A');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Firearms');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Fighter');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Fordarms');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Forcearms');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('012');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('4');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Lapangan terbang rendani terletak dikota');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('C');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Lhokseumawe');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Tidore Kepulauan');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Manokwari');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Kotamobagu');";
        db.execSQL(sql);

        //level 5
        sql = "INSERT INTO pertanyaan(id) VALUES('013');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('5');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Negara bagian di AS yang lambing atau bendera bergambar George Washington adalah');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('A');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Washington');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Georgia');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Wisconsin');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Nebraska');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('014');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('5');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Sungai Amazone terletak di negara');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('C');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Bolivia');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Kolumbia');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Brazilia');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Ekuador');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('015');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('5');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Kata signal radio internasional yang digunakan sebagai panggilan minta pertolongan (distress call ) adalah');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('D');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Me Day');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Help Day');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('I Help');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('May Day');";
        db.execSQL(sql);

        //level 6
        sql = "INSERT INTO pertanyaan(id) VALUES('016');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('6');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Unit pembangkit Uap Air di pabrik dinamakan');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('A');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Boiler');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Evapolator');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Superheater');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Economizer');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('017');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('6');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Negara bagian AS yang dikenal dengan sebutan Sunflower adalah');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('C');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Iola');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Montana');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Kansas');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Hawaii');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('018');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('6');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Pengukur kecepatan arah angin');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('A');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Anemometer');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Densimeter');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Alimeter');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Luxmeter');";
        db.execSQL(sql);

        //level 7
        sql = "INSERT INTO pertanyaan(id) VALUES('019');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('7');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Huruf terakhir pada abjad yunani adalah');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('D');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Psi');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Upsilon');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Sigma');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Omega');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('020');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('7');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Nama ayah dan anak sama , dialah yang membagi kata menjadi 10 jenis, dia itu adalah');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('A');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Aristoteles');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Socrates');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Plato');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Anaximandros');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('021');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('7');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Dikota mana john f.kennedy dibunuh');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('B');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Austin');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Dallas');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('El Paso');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Plano');";
        db.execSQL(sql);

        //level 8
        sql = "INSERT INTO pertanyaan(id) VALUES('022');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('8');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Pada fotosintesis, reaksi pengikatan CO2 berlangsung didalam');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('D');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Stomata');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Epidermis');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Jaringan Spons');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Kloroplas');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('023');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('8');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Orang yang hobinya mengumpulkan dan mengoleksi perangko disebut');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('A');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Filatelis');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Filumenis');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Numimastik');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Librocubicularist');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('024');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('8');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Negara yang mempunyai hak Veto di forum PBB adalah ');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('D');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Jepang ');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Indonesia');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Perancis');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('China');";
        db.execSQL(sql);

        //level 9
        sql = "INSERT INTO pertanyaan(id) VALUES('025');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('9');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Term yang umum dipakai untuk menyebut ruangan dalam kapal adalah ');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('B');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Buritan');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Kabin');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Propeller');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Geladak Utama');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('026');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('9');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Percakapan antar pemain drama disebut ');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('B');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Prolog');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Dialog');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Epilog');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Monolog');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('027');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('9');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Lagu kalayar berasal dari daerah ');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('D');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Kalimatan Timur');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Kalimatan  Selatan');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Kalimatan Barat');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Kalimantan Tengah');";
        db.execSQL(sql);

        //level 10
        sql = "INSERT INTO pertanyaan(id) VALUES('028');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('10');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Aktor yang bukan pemeran  James Bond adalah ');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('A');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Harrison Ford');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Sean Connery');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('George Lazenby');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Roger Moore');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('029');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('10');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Mick Jager adalah vokalis terkenal dari group musik ');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('C');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('The Smiths');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Black Sabbath');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Rolling Stone');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Scorpions');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('030');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('10');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Pemain basket NBA yang terjangkung bernama Gheorge Minesan adalah atlet kelahiran ');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('B');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Polandia');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Rumania');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Slowakia');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Ceko');";
        db.execSQL(sql);

        //level 11
        sql = "INSERT INTO pertanyaan(id) VALUES('031');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('11');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Negara Brunei Darussalam masuk sebagai anggota ASEAN sejak tahun');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('C');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('1964');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('1974');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('1984');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('1994');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('032');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('11');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Bakteri pengikat nitrogen yang hidup beesimbiosis dengan akar polong-polongan adalah');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('A');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Rhizobium');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Bacillus Subtilis');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Acetobacter');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Staphylococcus');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('033');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('11');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('John Dever adalah penyanyi terkenal pada tahun 70 – an dengan lagu Take me Home Country road adalah pria kelahiran');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('B');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Kanada');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Meksiko');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Puerto Riko');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Kuba');";
        db.execSQL(sql);

        //level 12
        sql = "INSERT INTO pertanyaan(id) VALUES('034');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('12');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Lagu berikut berasal dari Sulawesi utara kecuali ');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('B');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Cik Cik Periook');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Pakarena');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Badindang Ria');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Kandera Benaiso');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('035');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('12');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Negara yang mengklaim sebagai negara pemilik pipa minyak terpanjang di dunia adalah ');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('A');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Kanada');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Arab Saudi');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Selandia Baru');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Kuwait');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('036');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('12');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Salah satu pemeran tokoh James Bond adalah ');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('D');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Robert Shaw');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('John Goodman');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Javier Bardem');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Pierce Brosnan');";
        db.execSQL(sql);

        //level 13
        sql = "INSERT INTO pertanyaan(id) VALUES('037');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('13');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Suku wolimo terdapat di provinsi ');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('D');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Sumatra Barat');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Kalimantan Utara');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Jawa Timur');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Sulawesi Selatan');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('038');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('13');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('C35, M35 dan S35 adalah nomor seri handphone dengan merek ');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('B');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Sony');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Siemens');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Sony');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Nokia');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('039');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('13');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Binatang apa yang digunakan sebagai simbol dalam pada majalah playboy ');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('D');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Anjing');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Tikus');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Kucing');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Kelinci');";
        db.execSQL(sql);

        //level 14
        sql = "INSERT INTO pertanyaan(id) VALUES('040');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('14');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Sungai Zaire terletak di afrika ');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('C');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Selatan');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Utara');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Barat');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Timur');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('041');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('14');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Titik yang digunakan untuk pengukuran ketinggian suatu tempat disebut ');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('A');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Triangulasi');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Dramaturgi');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Etnografi');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Historis');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('042');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('14');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Dari keempat bilangan dibawah ini, yang bukan bilangan prima adalah ');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('A');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('4');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('7');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('19');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('31');";
        db.execSQL(sql);

        //level 15
        sql = "INSERT INTO pertanyaan(id) VALUES('043');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('15');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Siapa nama teman wanita Donald Duck ');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('B');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Minnie');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Daisy');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Elsa');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Anna');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('044');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('15');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Berasal dari planet apa Mr. Spock pada serial Star Treck ');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('D');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('Cybertron');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('Kepler');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('Pandora');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('Vulcan');";
        db.execSQL(sql);

        sql = "INSERT INTO pertanyaan(id) VALUES('045');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(level) VALUES('15');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(soal) VALUES('Berikut produsen pupuk di Indonesia kecuali ');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(kuncijawaban) VALUES('B');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanA) VALUES('PT. BAS Organik');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanB) VALUES('PT. Samator');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanC) VALUES('PT. Dharma Ayu Tani');";
        db.execSQL(sql);
        sql = "INSERT INTO pertanyaan(jawabanD) VALUES('PT. Sarana Hayati');";
        db.execSQL(sql);
    }


    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub
    }
}