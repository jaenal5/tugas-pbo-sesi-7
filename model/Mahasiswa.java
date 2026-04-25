package model;

import service.TampilData;

public class Mahasiswa<N, S, I> extends Orang implements TampilData {
    private N nim;
    private I clas;

    public Mahasiswa(S nama) {
        super((String) nama);
    }

    // Setter
    public void setNim(N nim) {
        this.nim = nim;
    }

    public void setClas(I clas) {
        this.clas = clas;
    }

    // Getter
    public N getNim() {
        return nim;
    }

    public I getClas() {
        return clas;
    }

    public String getNama() {
        return nama;
    }

    // Override (Polymorphism)
    @Override
    public void tampil() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Kelas: " + clas);
    }
}