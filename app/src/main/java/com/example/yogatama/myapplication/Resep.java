package com.example.yogatama.myapplication;

public class Resep {
    private String nama_makanan;
    private  String harga;
    private  String tipe;
    private String deskripsi;
    private int gambar;


    public static final Resep[] resepmakanan= {
            new Resep("AGYA", "*OTR Jabodetabek, Harga Bisa Berubah Sewaktu-Waktu Tanpa Pemberitahuan Terlebih Dahulu",
                    "Start From 135.000.000", "Tersedia Tipe Pilihan : G, TRD",R.drawable.agya),
            new Resep("ALPHARD", "*OTR Jabodetabek, Harga Bisa Berubah Sewaktu-Waktu Tanpa Pemberitahuan Terlebih Dahulu",
                    "Start From 950.000.000", "Tersedia Tipe Pilihan : X, G, Q",R.drawable.alphard),
            new Resep("AVANZA", "*OTR Jabodetabek, Harga Bisa Berubah Sewaktu-Waktu Tanpa Pemberitahuan Terlebih Dahulu",
                    "Start From 188.000.000", "Tersedia Tipe Pilihan : S, E, G",R.drawable.avanza),
            new Resep("CALYA", "*OTR Jabodetabek, Harga Bisa Berubah Sewaktu-Waktu Tanpa Pemberitahuan Terlebih Dahulu",
                    "Start From 188.000.000", "Tersedia Tipe Pilihan : E, G",R.drawable.calya),
            new Resep("CAMRY", "*OTR Jabodetabek, Harga Bisa Berubah Sewaktu-Waktu Tanpa Pemberitahuan Terlebih Dahulu",
                    "Start From 600.000.000", "Tersedia Tipe Pilihan : G, V",R.drawable.camry),
            new Resep("COROLLA ALTIS", "*OTR Jabodetabek, Harga Bisa Berubah Sewaktu-Waktu Tanpa Pemberitahuan Terlebih Dahulu",
                    "Start From 436.000.000", "Tersedia Tipe Pilihan : G, V",R.drawable.corolla),
            new Resep("FORTUNER", "*OTR Jabodetabek, Harga Bisa Berubah Sewaktu-Waktu Tanpa Pemberitahuan Terlebih Dahulu",
                    "Start From 405.000.000", "Tersedia Tipe Pilihan : G, VRZ, SRZ, TRD",R.drawable.fortuner ),
            new Resep("VELOZ", "*OTR Jabodetabek, Harga Bisa Berubah Sewaktu-Waktu Tanpa Pemberitahuan Terlebih Dahulu",
                    "Start From 250.000.000", "Tersedia Tipe Pilihan : Veloz Matic, Veloz Manual",R.drawable.veloz),

    };

    private Resep(String name,String description, String harga, String tipe, int gambar){
        this.nama_makanan = name;
        this.deskripsi= description;
        this.harga=harga;
        this.tipe=tipe;
        this.gambar=gambar;
    }
    public int getGambar() {
        return gambar;
    }
    public String getDescription() {
        return deskripsi;
    }
    public String getHarga() {
        return harga;
    }
    public String getTipe() {
        return tipe;
    }
    public String getName() {
        return nama_makanan;
    }
    public String toString() {
        return this.nama_makanan;
    }
}
