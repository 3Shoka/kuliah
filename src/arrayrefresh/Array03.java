package arrayrefresh;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        
        double total = 0;
        double rata = 0;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Berapa nilai yang akan diinput = ");
        n = in.nextInt();
        int nilai[] = new int[n];
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai= ");
            nilai[i] = in.nextInt();
        }
        in.close();
        System.out.println("=================================");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai Ke-" + (i + 1) + "= " + nilai[i]);
            total += nilai[i];
        }
        rata = total/nilai.length;
        System.out.println("=================================");
        System.out.println("Total Nilai = "+total);
        System.out.println("Rata-rata = "+ rata);

    }
}