package arrayrefresh;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {

        int nilai[] = new int[4];
        Scanner in = new Scanner(System.in);
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai= ");
            nilai[i] = in.nextInt();
        }
        in.close();
        System.out.println("=================================");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai Ke-" + (i + 1) + "= " + nilai[i]);
        }
        System.out.println("=================================");

    }
}
