package model;

public abstract class Orang {
    protected String nama;

    public Orang(String nama) {
        this.nama = nama;
    }

    public abstract void tampil();
}