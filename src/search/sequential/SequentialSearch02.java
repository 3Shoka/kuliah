package search.sequential;

import java.util.Scanner;

/**
 * SequentialSearch02
 */
public class SequentialSearch02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int cacah;
        int data[];
        int cari;
        boolean flag = false;
    
        System.out.print("Masukkan cacah data yang akan diinput: ");
        cacah = in.nextInt();

        data = new int[cacah];
        for (int i = 0; i < cacah; i++) {
            System.out.print("Masukkan data ke "+i+" : ");
            data[i] = in.nextInt();
        }

        System.out.print("Masukkan data yang akan dicari: ");
        cari = in.nextInt();
        in.close();

        for (int i = 0; i < data.length; i++) {
            if(data[i]==cari){
                flag = true;
                System.out.println("Data "+data[i]+ " data yang dicari");
            } else {
                System.out.println("Data "+data[i]+ " bukan data yang dicari");
            }
        }
    
        if(flag) {
            System.out.println("DATA ADA");
        } else {
            System.out.println("DATA TIDAK ADA");
        }
    }
}