package com.agung.fiveactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DaftarBarang extends AppCompatActivity {

    private int nilaiAngkaPensil = 0;
    private int nilaiAngkaPenghapus = 0;
    private int nilaiAngkaPenggaris = 0;
    private int nilaiAngkaBuku = 0;
    private int nilaiAngkaPeraut = 0;

    private TextView AngkaPensil;
    private TextView AngkaPenghapus;
    private TextView AngkaPenggaris;
    private TextView AngkaBuku;
    private TextView AngkaPeraut;

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

    public void PlusPenggaris(View view) {
        nilaiAngkaPenggaris +=1;
        AngkaPenggaris.setText(Integer.toString(nilaiAngkaPenggaris));
    }

    public void PlusPensil(View view) {
        nilaiAngkaPensil +=1;
        AngkaPensil.setText(Integer.toString(nilaiAngkaPensil));
    }

    public void PlusPenghapus(View view) {
        nilaiAngkaPenghapus +=1;
        AngkaPenghapus.setText(Integer.toString(nilaiAngkaPenghapus));
    }

    public void PlusBuku(View view) {
        nilaiAngkaBuku +=1;
        AngkaBuku.setText(Integer.toString(nilaiAngkaBuku));
    }


    public void PlusPeraut(View view) {
        nilaiAngkaPeraut +=1;
        AngkaPeraut.setText(Integer.toString(nilaiAngkaPeraut));
    }

    public void MinusPensil(View view) {
        nilaiAngkaPensil -=1;
        AngkaPensil.setText(Integer.toString(nilaiAngkaPensil));
    }

    public void MinusPenggaris(View view) {
        nilaiAngkaPenggaris -=1;
        AngkaPenggaris.setText(Integer.toString(nilaiAngkaPenggaris));
    }

    public void MinusPenghapus(View view) {
        nilaiAngkaPenghapus -=1;
        AngkaPenghapus.setText(Integer.toString(nilaiAngkaPenghapus));
    }

    public void MinusBuku(View view) {
        nilaiAngkaBuku -=1;
        AngkaBuku.setText(Integer.toString(nilaiAngkaBuku));
    }

    public void MinusPeraut(View view) {
        nilaiAngkaPeraut -=1;
        AngkaPeraut.setText(Integer.toString(nilaiAngkaPeraut));
    }


    public void ResetAngka(View view) {
        nilaiAngkaPensil = 0;
        nilaiAngkaPenghapus = 0;
        nilaiAngkaPenggaris = 0;
        nilaiAngkaBuku = 0;
        nilaiAngkaPeraut = 0;

        AngkaPensil.setText(Integer.toString(nilaiAngkaPensil));
        AngkaPenghapus.setText(Integer.toString(nilaiAngkaPensil));
        AngkaPenggaris.setText(Integer.toString(nilaiAngkaPensil));
        AngkaBuku.setText(Integer.toString(nilaiAngkaPensil));
        AngkaPeraut.setText(Integer.toString(nilaiAngkaPensil));

    }

    public void LaunchMenuCheckout(View view) {
        Intent intent = new Intent(this, checkOut.class);
        startActivity(intent);
    }
}