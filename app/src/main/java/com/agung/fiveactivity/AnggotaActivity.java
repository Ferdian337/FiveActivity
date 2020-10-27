package com.agung.fiveactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AnggotaActivity extends AppCompatActivity {
    private RecyclerView rvAnggota;
    private ArrayList<Anggota> listAnggota = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anggota);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rvAnggota = findViewById(R.id.rv_list_anggota);
        rvAnggota.setHasFixedSize(true);

        listAnggota.addAll(AnggotaData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView(){
        rvAnggota.setLayoutManager(new LinearLayoutManager(this));
        CardViewAnggota cardViewFootballPlayer = new CardViewAnggota(this);
        cardViewFootballPlayer.setListAnggota(listAnggota);
        rvAnggota.setAdapter(cardViewFootballPlayer);
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