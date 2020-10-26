package com.agung.fiveactivity;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class DaftarBarang extends AppCompatActivity {

//    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "ini key untuk extra di daftar barang";

    private int nilaiAngkaPensil = 0;
    private int nilaiAngkaPenghapus = 0;
    private int nilaiAngkaPenggaris = 0;
    private int nilaiAngkaBuku = 0;
    private int nilaiAngkaPeraut = 0;

    private TextView AngkaPensil;
    private TextView AngkaPenggaris;
    private TextView AngkaPenghapus;
    private TextView AngkaBuku;
    private TextView AngkaPeraut;

    int[] nilai = {0, 0, 0, 0, 0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_barang);

        AngkaPensil = (TextView) findViewById(R.id.angka_pensil);
        AngkaPenghapus = (TextView) findViewById(R.id.angka_penghapus);
        AngkaPenggaris = (TextView) findViewById(R.id.angka_penggaris);
        AngkaBuku = (TextView) findViewById(R.id.angka_buku);
        AngkaPeraut = (TextView) findViewById(R.id.angka_peraut);
    }

    public void PlusPensil(View view) {
        nilaiAngkaPensil +=1;
        nilai[0] += 1;
        AngkaPensil.setText(Integer.toString(nilaiAngkaPensil));
    }

    public void MinusPensil(View view) {
        if (nilaiAngkaPensil>0){
            nilaiAngkaPensil -=1;
            nilai[0] -= 1;
            AngkaPensil.setText(Integer.toString(nilaiAngkaPensil));
        }
    }

    public void PlusPenggaris(View view) {
        nilaiAngkaPenggaris +=1;
        nilai[1] += 1;
        AngkaPenggaris.setText(Integer.toString(nilaiAngkaPenggaris));
    }

    public void MinusPenggaris(View view) {
        if (nilaiAngkaPenggaris > 0) {
            nilaiAngkaPenggaris -= 1;
            nilai[1] -= 1;
            AngkaPenggaris.setText(Integer.toString(nilaiAngkaPenggaris));
        }
    }

    public void PlusPenghapus(View view) {
        nilaiAngkaPenghapus +=1;
        nilai[2] += 1;
        AngkaPenghapus.setText(Integer.toString(nilaiAngkaPenghapus));
    }

    public void MinusPenghapus(View view) {
        if (nilaiAngkaPenghapus > 0) {
            nilaiAngkaPenghapus -= 1;
            nilai[2] -= 1;
            AngkaPenghapus.setText(Integer.toString(nilaiAngkaPenghapus));
        }
    }

    public void PlusBuku(View view) {
        nilaiAngkaBuku +=1;
        nilai[3] += 1;
        AngkaBuku.setText(Integer.toString(nilaiAngkaBuku));
    }

    public void MinusBuku(View view) {
        if (nilaiAngkaBuku > 0) {
            nilaiAngkaBuku -= 1;
            nilai[3] -= 1;
            AngkaBuku.setText(Integer.toString(nilaiAngkaBuku));
        }
    }

    public void PlusPeraut(View view) {
        nilaiAngkaPeraut +=1;
        nilai[4] += 1;
        AngkaPeraut.setText(Integer.toString(nilaiAngkaPeraut));
    }

    public void MinusPeraut(View view) {
        if (nilaiAngkaPeraut > 0) {
            nilaiAngkaPeraut -= 1;
            nilai[4] -= 1;
            AngkaPeraut.setText(Integer.toString(nilaiAngkaPeraut));
        }
    }


    public void ResetAngka(View view) {
        nilaiAngkaPensil = 0;
        nilaiAngkaPenghapus = 0;
        nilaiAngkaPenggaris = 0;
        nilaiAngkaBuku = 0;
        nilaiAngkaPeraut = 0;

        for(int i=0; i<nilai.length; i++){
            nilai[i] = 0;
        }

        AngkaPensil.setText(Integer.toString(nilaiAngkaPensil));
        AngkaPenghapus.setText(Integer.toString(nilaiAngkaPensil));
        AngkaPenggaris.setText(Integer.toString(nilaiAngkaPensil));
        AngkaBuku.setText(Integer.toString(nilaiAngkaPensil));
        AngkaPeraut.setText(Integer.toString(nilaiAngkaPensil));

    }

    public void LaunchMenuCheckout(View view) {
        String strNilai[] = new String[nilai.length];
        for (int i = 0; i < nilai.length; i++)
            strNilai[i] = String.valueOf(nilai[i]);

        Intent intent = new Intent(this, checkOut.class);
        intent.putExtra(EXTRA_MESSAGE, strNilai);
//        Log.d(LOG_TAG, String.valueOf(nilai[1]));
        startActivity(intent);
    }
}