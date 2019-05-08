package search.sequential.sentinel;

import java.util.Scanner;

/**
 * SequentialSentinel02
 */
public class SequentialSentinel02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cacah, data[], cari;

        System.out.print("Masukkan cacah data yang akan diinput: ");
        cacah = sc.nextInt();
        data = new int[cacah+1];

        for (int i = 0; i < data.length-1; i++) {
            System.out.print("Masukkan data ke "+i+" :");
            data[i]=sc.nextInt();
        }

        System.out.print("Data yang akan dicari: ");
        cari = sc.nextInt();
        sc.close();
        
        data[cacah] = cari;

        int i = 0;
        while (data[i] != cari) {
            System.out.println(data[i] +" bukan data yang dicari");
            i++;
        }

        if (i < data.length-1) {
            System.out.println(cari +" ditemukan");
            System.out.println("DATA ADA");
        } else {
            System.out.println("DATA TIDAK ADA");
        }
    }
}