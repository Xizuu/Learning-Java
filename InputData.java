package me.raihanpratama.belajarjava;

import java.util.Scanner;

public class InputData {

    public static void main(String[] args) {
        String banyakData = null;
        int totalBilangan = 0;
        float rataRata;
        int bilanganTerkecil = Integer.MAX_VALUE;
        int bilanganTerbesar = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan banyak data: ");

        while (scanner.hasNextLine()) {
            banyakData = scanner.nextLine();
            if (!banyakData.isEmpty() && banyakData.matches("[0-9]{3,4}")) break;
            System.out.print("Input tidak diperbolehkan\nMasukkan banyak data: ");
        }
        banyakData = scanner.nextLine();

        for (int i = 0; i < Integer.parseInt(banyakData); i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Hanya dapat memasukkan angka\n"
                        + "Masukkan bilangan ke-" + (i + 1) + ": "
                );
                scanner.next();
            }
            int bilangan = scanner.nextInt();
            totalBilangan += bilangan;

            if (bilangan < bilanganTerkecil) {
                bilanganTerkecil = bilangan;
            }
            if (bilangan > bilanganTerbesar) {
                bilanganTerbesar = bilangan;
            }
        }

        rataRata = (float) totalBilangan / Integer.parseInt(banyakData);
        System.out.println("Banyak data: " + banyakData);
        System.out.println("Total bilangan: " + totalBilangan);
        System.out.println("Rata-rata bilangan: " + rataRata);
        System.out.println("Bilangan terkecil: " + bilanganTerkecil);
        System.out.println("Bilangan terbesar: " + bilanganTerbesar);
    }
}
