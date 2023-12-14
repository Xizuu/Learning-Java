package me.raihanpratama.belajarjava;

import java.util.Scanner;

public class MultiArray {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nama pasien: ");
            while (!scanner.hasNext()) {
                System.out.println("Nama pasien tidak boleh kosong:");
                scanner.next();
            }
            String pasien = scanner.next();
            System.out.print(" ");

            System.out.println("Masukkan kode kamar:\n"
                    + "1: Rp100.000/hari\n"
                    + "2: Rp250.000/hari\n"
                    + "3: Rp500.000/hari\n"
            );
            while (!(scanner.nextInt() > 3)) {
                System.out.println("Kode kamar tidak ditemukan");
                while (!scanner.hasNextInt()) {
                    System.out.println("Kode kamar tidak boleh kosong:");
                    scanner.next();
                }
                int kode = scanner.nextInt();
            }
            System.out.print(" ");


        }
    }
}
