package me.raihanpratama.belajarjava;

import java.util.Scanner;

public class InputString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hai, siapa namamu? ");
        String nama = scanner.nextLine();
        System.out.println("Kamu lahir tahun berapa?");
        int tahun = scanner.nextInt();

        int umur = 2023 - tahun;

        System.out.println("Hai " + nama + ", kamu lahir tahun " + tahun + " ya? Berarti umurmu " + umur + " tahun kan?");
//        System.out.println("Hai " + nama + ", Umurmu sekarang adalah " + umur + " tahun");
    }
}
