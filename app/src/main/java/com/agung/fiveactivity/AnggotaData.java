package com.agung.fiveactivity;

import java.util.ArrayList;

public class AnggotaData {
    private static String[] NamaAnggota = {
            "Agung Wibowo",
            "Ahmad Akbary Mediansyahada",
            "M imamul ikhlas",
            "Syafiq Irfan Isnaindar",
            "Bayu dwiyanto",
            "Ferdian Nursulistio"
    };

    private static String[] NIMAnggota = {
            "18523230",
            "18523212",
            "18523220",
            "18523134",
            "18523162",
            "18523149"
    };

    private static int[] FotoAnggota = {
            R.drawable.phoenix,
            R.drawable.breach,
            R.drawable.jett,
            R.drawable.raze,
            R.drawable.sage,
            R.drawable.viper
    };

    private static String[] QuoteAnggota = {
            "''Jangan lupa tidur, tidur sehat tapi kalo kelamaan pusing" + "\n" + "0" + "\n "+ "1" + "\n"  + "2" + "\n" + "3''",
            "''Jangan lupa main game''",
            "''Pantang Pisang Berbuah Dua Kali''",
            "''Jalan aja terus, tau-tau dah lewat''",
            "''Stay curious''",
            "''Berbuat baik sampai masuk iseka''"
    };

    private static String[] TTLAnggota = {
            "Sukabumi, 17 Juli 2000",
            "Jakarta,26 oktober 2000",
            "Duri,5 Juni 2000",
            "Manna, 11 October 1999",
            "Samarinda, 26 Agustus 1999",
            "Batam, 17 Oktober 2000"
    };

    private static String[] HobiAnggota = {
            "Game, Tiduran, Nonton",
            "Game, masak, nonton",
            "Developing Server",
            " Baca Info terbaru, Sepedaan,  liat youtube ",
            "Nonton, game, berkebun",
            "Belajar, game, nge-wibu"
    };


    static ArrayList<Anggota> getListData() {
        ArrayList<Anggota> list = new ArrayList<>();
        for (int position = 0; position < NamaAnggota.length; position++) {
            Anggota anggota = new Anggota();
            anggota.setNama(NamaAnggota[position]);
            anggota.setNim(NIMAnggota[position]);
            anggota.setFoto(FotoAnggota[position]);
            anggota.setHobi(HobiAnggota[position]);
            anggota.setQuote(QuoteAnggota[position]);
            anggota.setTtl(TTLAnggota[position]);
            list.add(anggota);
        }
        return list;
    }
}
