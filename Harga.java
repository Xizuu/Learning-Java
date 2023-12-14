package me.raihanpratama.belajarjava;

import java.util.Scanner;

public class Harga {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Pilih barang (A. Jeans, B. Lea, C. Levis):");
            while (!scanner.hasNext("[abcABC]")) {
                System.out.println("Data tidak ditemukan");
                scanner.next();
            }
            String barang = scanner.next();

            System.out.println("Masukkan kuantitas:");
            while (!scanner.hasNextInt()) {
                System.out.println("Hanya dapat memasukkan angka:");
                scanner.next();
            }
            int kuantitas = scanner.nextInt();

            System.out.println("Barang yang dibeli: " + translateChar(barang));
            System.out.println("Jumlah kuantitas: " + kuantitas);
            System.out.println("Harga per item: Rp" + getHarga(translateChar(barang)));
            int total = getHarga(translateChar(barang)) * kuantitas;
            if (total >= 1000000) {
                System.out.println("Kamu mendapat diskon 10% karena berbelanja diatas Rp1.000.000");
                System.out.println("Total harga awal: Rp" + total);
                int hasil = total - total * 10 / 100;
                System.out.println("Total harga: Rp" + hasil);
            } else if (total >= 500000 || total <= 99999) {
                System.out.println("Kamu mendapat diskon 5% karena berbelanja diatas Rp500.000");
                System.out.println("Total harga awal: Rp" + total);
                int hasil = total - total * 5 / 100;
                System.out.println("Total harga: Rp" + hasil);
            } else {
                System.out.println("Total harga: Rp" + total);
            }
        }
    }

    public static int getHarga (String barang) {
        return switch (barang.toLowerCase()) {
            case "jeans" -> 200000;
            case "lea" -> 300000;
            case "levis" -> 500000;
            default -> throw new IllegalStateException("Unexpected value: " + barang);
        };
    }

    public static String translateChar (String character) {
        return switch (character.toLowerCase()) {
            case "a" -> "Jeans";
            case "b" -> "Lea";
            case "c" -> "Levis";
            default -> throw new IllegalStateException("Unexpected value: " + character);
        };
    }
}