package me.raihanpratama.belajarjava;

public class Hitung {

    public static void main(String[] args) {
        System.out.println("Pertambahan: " + hitung(10, 2, "tambah"));
        System.out.println("Pengurang: " + hitung(2, 10, "kurang"));
        System.out.println("Perkalian: " + hitung(10, 2, "kali"));
        System.out.println("Pembagian: " + hitung(2, 10, "bagi"));
        System.out.println("Hasil Bagi: " + hitung(10, 2, "modulus"));
    }

    private static int hitung (Integer pertama, Integer kedua, String tipe) {
        return switch (tipe) {
            case "tambah" -> pertama + kedua;
            case "kurang" -> pertama - kedua;
            case "kali" -> pertama * kedua;
            case "bagi" -> pertama / kedua;
            case "modulus" -> pertama % kedua;
            default -> 0;
        };
    }
}
