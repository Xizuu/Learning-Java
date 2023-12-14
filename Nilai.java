package me.raihanpratama.belajarjava;

import java.util.Scanner;

public class Nilai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        while (!scanner.hasNext()) {
            System.out.print("Harap masukkan nama: ");
            scanner.next();
        }
        String nama = scanner.next();
        System.out.print("Masukkan nilai UTS: ");
        while (!scanner.hasNextFloat()) {
            System.out.print("Harap masukkan nilai UTS: ");
            scanner.nextFloat();
        }
        float uts = scanner.nextFloat();
        System.out.print("Masukkan nilai UAS: ");
        while (!scanner.hasNextFloat()) {
            System.out.print("Harap masukkan nilai UAS: ");
            scanner.next();
        }
        float uas = scanner.nextFloat();

        float rata = (uts + uas) / 2;

        System.out.println("Nama: " + nama);
        System.out.println("Nilai UTS: " + uts);
        System.out.println("Nilai UAS: " + uas);

        if (rata >= 91 && rata <= 100) {
            System.out.println("Nilai rata-rata: " + rata);
            System.out.println("Nilai akhir: A");
        }else if (rata >= 60 && rata <= 90) {
            System.out.println("Nilai rata-rata: " + rata);
            System.out.println("Nilai akhir: B");
        }else{
            System.out.println("Nilai rata-rata: " + rata);
            System.out.println("Nilai akhir: E");
        }
    }
}
