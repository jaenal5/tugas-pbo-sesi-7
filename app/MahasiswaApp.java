package app;

import java.util.ArrayList;
import model.Mahasiswa;

public class MahasiswaApp {
    public static void main(String[] args) {

        ArrayList<Mahasiswa<String, String, Integer>> list = new ArrayList<>();

        Mahasiswa<String, String, Integer> m1 = new Mahasiswa<>("Andi");
        m1.setNim("001");
        m1.setClas(21);

        Mahasiswa<String, String, Integer> m2 = new Mahasiswa<>("Budi");
        m2.setNim("002");
        m2.setClas(22);

        list.add(m1);
        list.add(m2);

        for (Mahasiswa<String, String, Integer> m : list) {
            m.tampil();
            System.out.println("------------");
        }
    }
}