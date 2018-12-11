package com.example.yogatama.myapplication;

public class datavideo {
    private String nama;
    private String durasi;
    private String videoRawId;

    // Array nama sinetron di kategori drama
    public static final datavideo[] drama = {

            new datavideo("Iklan ",
                    "4:12",
                    "coba"),

    };

    // Setiap data punya nama, deskripsi, dan gambar
    private datavideo(String nama, String durasi, String videoRawId) {
        this.nama = nama;
        this.durasi = durasi;
        this.videoRawId = videoRawId;
    }
    public String getNama() {
        return nama;
    }
    public String getDurasi() {
        return durasi;
    }
    public String getVideoRawId() {
        return videoRawId;
    }
    public String toString() {
        return this.nama;
    }

}


