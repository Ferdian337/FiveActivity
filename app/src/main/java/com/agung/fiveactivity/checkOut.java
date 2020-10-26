package com.agung.fiveactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.net.HttpCookie;
import java.util.Arrays;

public class checkOut extends AppCompatActivity {

//    private static final String LOG_TAG = checkOut.class.getSimpleName();

    String[] label = {"Pensil", "Penggaris", "Penghapus", "Buku", "Peraut"};

    private int zeroCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);


        TextView jumlah1 = findViewById(R.id.jumlah1);
        TextView jumlah2 = findViewById(R.id.jumlah2);
        TextView jumlah3 = findViewById(R.id.jumlah3);
        TextView jumlah4 = findViewById(R.id.jumlah4);
        TextView jumlah5 = findViewById(R.id.jumlah5);

//        TextView samaDengan1 = findViewById(R.id.samaDengan1);
//        TextView samaDengan2 = findViewById(R.id.samaDengan2);
//        TextView samaDengan3 = findViewById(R.id.samaDengan3);
//        TextView samaDengan4 = findViewById(R.id.samaDengan4);
//        TextView samaDengan5 = findViewById(R.id.samaDengan5);

        TextView barang1 = findViewById(R.id.barang1);
        TextView barang2 = findViewById(R.id.barang2);
        TextView barang3 = findViewById(R.id.barang3);
        TextView barang4 = findViewById(R.id.barang4);
        TextView barang5 = findViewById(R.id.barang5);

        Intent intent = getIntent();
        String[] nilai = intent.getStringArrayExtra(DaftarBarang.EXTRA_MESSAGE);

        barang1.setText(label[0]);
        jumlah1.setText(nilai[0]);

        barang2.setText(label[1]);
        jumlah2.setText(nilai[1]);

        barang3.setText(label[2]);
        jumlah3.setText(nilai[2]);

        barang4.setText(label[3]);
        jumlah4.setText(nilai[3]);

        barang5.setText(label[4]);
        jumlah5.setText(nilai[4]);

    }

    public void checkout(View view) {
        Uri uri = Uri.parse("http://www.google.com"); // ga ada 'http://' akan crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}