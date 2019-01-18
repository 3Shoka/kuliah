package uas1;

import java.util.Scanner;

public class Uas1 {
    public static void main(String[] args) {
        Scanner sc;
        int jmlMhs = 0, jmlNilai;
        String nim, nama;
        double nilai, cacah[], total, rata;
        sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mahasiswa: ");
        jmlMhs = sc.nextInt();

        for (int i = 1; i <= jmlMhs; i++) {
            
            sc = new Scanner(System.in);
            total = 0;
            System.out.println("Mahasiswa ke-" + i);
            System.out.print("Masukkan NIM: ");
            nim = sc.nextLine();
            System.out.print("Masukkan Nama: ");
            nama = sc.nextLine();
            System.out.print("Jumlah nilai yang diinput: ");
            jmlNilai = sc.nextInt();
            cacah = new double[jmlNilai];
            for (int j = 0; j < jmlNilai; j++) {
                System.out.print("Masukkan nilai ke-" + (j+1) + " :");
                cacah[j] = sc.nextDouble();
                total += cacah[j];
            }
            System.out.println("Total nilai: " + total);
            System.out.println("Rata-rata nilai: " + (total / jmlNilai));
        }
    }
}
