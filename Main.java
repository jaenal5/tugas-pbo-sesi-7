import model.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa<String, String, Integer> m = new Mahasiswa<>("Ferdi");

        m.setNim("1120020");
        m.setClas(21);

        System.out.println(m.getNim());
        System.out.println(m.getNama());
        System.out.println(m.getClas());
    }
}