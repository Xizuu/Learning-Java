package me.raihanpratama.belajarjava;

import java.util.Scanner;

public class InputHitung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        float a = scanner.nextFloat();
        System.out.print("Masukkan angka kedua: ");
        float b = scanner.nextFloat();
        System.out.print("Masukkan operasi: ");
        String operasi = scanner.next();

        switch (operasi) {
            case "tambah" -> {
                float c = a + b;
                System.out.println("Penjumlahan dari " + a + " + " + b + " adalah " + c);
            }
            case "kurang" -> {
                float c = a - b;
                System.out.println("Pengurangan dari " + a + " - " + b + " adalah " + c);
            }
            case "kali" -> {
                float c = a * b;
                System.out.println("Perkalian dari " + a + " * " + b + " adalah " + c);
            }
            case "bagi" -> {
                float c = a / b;
                System.out.println("Pembagian dari " + a + " / " + b + " adalah " + c);
            }
            case "modulus" -> {
                float c = a % b;
                System.out.println("Sisa pembagian dari " + a + " % " + b + " adalah " + c);
            }
            default -> System.out.println("Operasi tidak ditemukan");
        }
    }
}
