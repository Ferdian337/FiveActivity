package com.agung.fiveactivity;

import android.os.Parcel;
import android.os.Parcelable;

public class Anggota implements Parcelable {
    private String nim;
    private String nama;
    private String ttl;
    private String quote;
    private String hobi;
    private int foto;

    public Anggota() {

    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }



    protected Anggota(Parcel in) {
        nim = in.readString();
        nama = in.readString();
        ttl = in.readString();
        quote = in.readString();
        hobi = in.readString();
        foto = in.readInt();
    }

    public static final Creator<Anggota> CREATOR = new Creator<Anggota>() {
        @Override
        public Anggota createFromParcel(Parcel in) {
            return new Anggota(in);
        }

        @Override
        public Anggota[] newArray(int size) {
            return new Anggota[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nim);
        dest.writeString(nama);
        dest.writeString(ttl);
        dest.writeString(quote);
        dest.writeString(hobi);
        dest.writeInt(foto);
    }
}
