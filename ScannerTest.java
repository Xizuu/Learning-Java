package me.raihanpratama.belajarjava;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama = null, tanggal = null, bulan = null, tahun = null;

        System.out.print("Masukkan nama: ");

        while (scanner.hasNextLine()) {
            nama = scanner.nextLine();
            if (!nama.isEmpty()) break;
            System.out.print("Input tidak diperbolehkan\nMasukkan nama: ");
        }

        System.out.print("Masukkan tanggal lahir: ");

        while (scanner.hasNextLine()) {
            tanggal = scanner.nextLine();
            if (!tanggal.isEmpty() && tanggal.matches("[0-9]{1,2}")) break;
            System.out.print("Input tidak diperbolehkan\nMasukkan tanggal lahir: ");
        }

        System.out.print("Masukkan bulan lahir: ");

        while (scanner.hasNextLine()) {
            bulan = scanner.nextLine();
            if (!bulan.isEmpty() && bulan.matches("[0-9]{1,2}")) break;
            System.out.print("Input tidak diperbolehkan\nMasukkan bulan lahir: ");
        }

        System.out.print("Masukkan tahun lahir: ");

        while (scanner.hasNextLine()) {
            tahun = scanner.nextLine();
            if (!tahun.isEmpty() && tahun.matches("[0-9]{3,4}")) break;
            System.out.print("Input tidak diperbolehkan\nMasukkan tahun lahir: ");
        }

        System.out.println("Nama: " + nama);
        assert tanggal != null;
        System.out.println("Tanggal lahir: " + Integer.parseInt(tanggal));
        assert bulan != null;
        System.out.println("Bulan lahir: " + getBulan(Integer.parseInt(bulan)));
        assert tahun != null;
        System.out.println("Tahun lahir: " + Integer.parseInt(tahun));
    }

    public static String getBulan (int bulan) {
        return switch (bulan) {
            case 1 -> "Januari";
            case 2 -> "Februari";
            case 3 -> "Maret";
            case 4 -> "April";
            case 5 -> "Mei";
            case 6 -> "Juni";
            case 7 -> "Juli";
            case 8 -> "Agustus";
            case 9 -> "September";
            case 10 -> "Oktober";
            case 11 -> "November";
            case 12 -> "Desember";
            default -> throw new IllegalStateException("Nama bulan tidak ditemukan: " + bulan);
        };
    }
}
