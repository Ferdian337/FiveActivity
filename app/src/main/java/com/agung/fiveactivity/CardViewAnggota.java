package com.agung.fiveactivity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewAnggota extends RecyclerView.Adapter<CardViewAnggota.CardViewViewHolder> {
    private Context context;
    private ArrayList<Anggota> listAnggota;

    public CardViewAnggota(Context context) {
        this.context = context;
    }

    public ArrayList<Anggota> getListAnggota() {
        return listAnggota;
    }

    public void setListAnggota(ArrayList<Anggota> listAnggota) {
        this.listAnggota = listAnggota;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_anggota,parent,  false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, final int position) {
        holder.tvName.setText(getListAnggota().get(position).getNama());
        holder.tvNIM.setText(getListAnggota().get(position).getNim());
        Glide.with(context).load(getListAnggota().get(position).getFoto()).into(holder.imgPhoto);

        holder.tvRv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailAnggotaActivity = new Intent(context, DetailAnggotaActivity.class);
                detailAnggotaActivity.putExtra(DetailAnggotaActivity.EXTRA_ANGGOTA, listAnggota.get(position));
                context.startActivity(detailAnggotaActivity);
            }
        });

    }

    @Override
    public int getItemCount() {
        return getListAnggota().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        TextView tvNIM;
        CardView tvRv;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_photo);
            tvName = itemView.findViewById(R.id.txt_name);
            tvNIM = itemView.findViewById(R.id.txt_nim);
            tvRv = itemView.findViewById(R.id.tv_rv);
        }
    }
}
