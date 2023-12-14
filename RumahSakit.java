package me.raihanpratama.belajarjava;

import java.util.Random;
import java.util.Scanner;

public class RumahSakit {

    public static void main(String[] args) {
        int jumlahPasien;
        String namaPasien, kodeKamar;
        int lamaInap;
        double biayaPerHari;

        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah pasien: ");
        jumlahPasien = input.nextInt();

        String[][] dataPasien = new String[jumlahPasien][5];

        for (int i = 0; i < jumlahPasien; i++) {
            System.out.println("Data pasien ke-" + (i + 1));
            System.out.print("Nama pasien: ");
            namaPasien = input.next();
            System.out.print("Kode kamar: ");
            kodeKamar = input.next();
            System.out.print("Lama inap: ");
            lamaInap = input.nextInt();

            dataPasien[i][0] = randomId();
            dataPasien[i][1] = namaPasien;
            dataPasien[i][2] = kodeKamar;
            dataPasien[i][3] = Integer.toString(lamaInap);

            biayaPerHari = switch (dataPasien[i][2]) {
                case "1" -> 100000;
                case "2" -> 250000;
                default -> 500000;
            };

            dataPasien[i][4] = Integer.toString((int) (biayaPerHari * lamaInap));
        }

        System.out.println("RS. TUVWXYZ");
        System.out.println("| ID Pas | Nama Pasien | Kode Kamar | Lama Inap | Total Biaya |");
        for (int i = 0; i < jumlahPasien; i++) {
            System.out.printf("| %-10s | %-15s | %-10s | %-10s | %-15s |\n",
                    dataPasien[i][0], dataPasien[i][1], dataPasien[i][2], dataPasien[i][3], dataPasien[i][4]);
        }
    }

    public static String randomId() {
        int leftLimit = 48;
        int rightLimit = 122;
        int targetStringLength = 4;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
