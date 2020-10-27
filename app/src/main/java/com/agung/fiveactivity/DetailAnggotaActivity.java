package com.agung.fiveactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailAnggotaActivity extends AppCompatActivity {
    public static final String EXTRA_ANGGOTA = "extra_anggota";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_anggota);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView foto = findViewById(R.id.foto_anggota);
        TextView nama = findViewById(R.id.txt_nama);
        TextView nim = findViewById(R.id.txt_nim);
        TextView quote = findViewById(R.id.txt_quote);
        TextView hobi = findViewById(R.id.txt_hobi);
        TextView ttl = findViewById(R.id.txt_ttl);

        Anggota anggota = getIntent().getParcelableExtra(EXTRA_ANGGOTA);
        nama.setText(anggota.getNama());
        nim.setText(anggota.getNim());
        quote.setText(anggota.getQuote());
        hobi.setText(anggota.getHobi());
        ttl.setText(anggota.getTtl());

        Glide.with(this).load(anggota.getFoto()).into(foto);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}