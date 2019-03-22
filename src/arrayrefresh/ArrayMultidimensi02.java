package arrayrefresh;

import java.util.Scanner;

/**
 * ArrayMultidimensi02
 * program array multidimensi menggunakan scanner
 */
public class ArrayMultidimensi02 {

    public static void main(String[] args) {
        int baris, kolom;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        kolom = sc.nextInt();
        int matrik[][] = new int[baris][kolom];
        System.out.println();
        
        // proses input nilai matrik
        for (int i = 0; i < matrik.length; i++) {
            for (int j = 0; j < matrik[i].length; j++) {
                System.out.print("Masukkan nilai matriks baris ke "+i+", kolom ke "+j+": ");
                matrik[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
        
        // output nilai matrik
        for (int i = 0; i < matrik.length; i++) {
            for (int j = 0; j < matrik[i].length; j++) {
                System.out.print(matrik[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}