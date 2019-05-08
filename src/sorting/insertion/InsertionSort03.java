package sorting.insertion;

import java.util.Scanner;


class Insertion {

    private int[] data;
    private int cacah;
    Scanner in = new Scanner(System.in);

    public void inputCacah() {
        //proses input nilai cacah
        System.out.print("Berapa cacah data yang akan diinput = ");
        cacah = in.nextInt();
        data = new int[cacah];
    }

    public void inputData() {
        // proses input data
        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan data ke "+i+" = ");
            data[i] = in.nextInt();
        }

    }

    public void cetakData() {
        // tampilkan data
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
    }

    public void prosesInsertionSort() {
        // proses insertion sort
        int tmp;
        for (int i = 1; i < data.length; i++) {
            tmp = data[i];
            int j = i-1;

            while(j>=0 && data[j] > tmp){
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = tmp;

            System.out.println("data sementara: "+i);
            for (int h = 0; h < data.length; h++) {
                System.out.print(data[h]+" ");
            }
            System.out.println();
        }

    }

}


public class InsertionSort03 {
    
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.print("Berapa cacah data yang akan diinput = ");
        // int n = in.nextInt();
        // int data[] = new int[n];

        Insertion insert = new Insertion();

        insert.inputCacah();
        
        // for (int i = 0; i < data.length; i++) {
        //     System.out.print("Masukkan data ke "+i+" = ");
        //     data[i] = in.nextInt();
        // }

        insert.inputData();
        
        // System.out.println();
        // System.out.println("Data sebelum sorting");
        // for (int i = 0; i < data.length; i++) {
        //     System.out.print(data[i]+" ");
        // }
        // System.out.println();
        
        System.out.println("data sebelum sorting");
        insert.cetakData();
        System.out.println();

        // proses sorting selection
        // int tmp;
        // for (int i = 1; i < data.length; i++) {
        //     tmp = data[i];
        //     int j = i-1;

        //     while(j>=0 && data[j] > tmp){
        //         data[j+1] = data[j];
        //         j--;
        //     }
        //     data[j+1] = tmp;

        //     System.out.println("data sementara: "+i);
        //     for (int h = 0; h < data.length; h++) {
        //         System.out.print(data[h]+" ");
        //     }
        //     System.out.println();
        // }
        
        System.out.println();
        System.out.println("Setelah sorting");
        insert.cetakData();
        System.out.println();
        
    }
}