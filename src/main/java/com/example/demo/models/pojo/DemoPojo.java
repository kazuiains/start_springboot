package com.example.demo.models.pojo;

public class DemoPojo {
    private int id;
    private String judul;
    private String deskripsi;

    public DemoPojo() {
    }

    public DemoPojo(int id, String judul, String deskripsi) {
        this.id = id;
        this.judul = judul;
        this.deskripsi = deskripsi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @Override
    public String toString() {
        return "DemoPojo{" +
                "id=" + id +
                ", judul='" + judul + '\'' +
                ", deskripsi='" + deskripsi + '\'' +
                '}';
    }
}
