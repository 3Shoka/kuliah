package sorting.insertion;

import java.util.Scanner;

public class InsertionSort02 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Berapa cacah data yang akan diinput = ");
        int n = in.nextInt();
        int data[] = new int[n];
        
        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan data ke "+i+" = ");
            data[i] = in.nextInt();
        }
        
        in.close();
        System.out.println();
        System.out.println("Data sebelum sorting");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
        
        // proses sorting selection
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
        
        System.out.println();
        System.out.println("Setelah sorting");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        
    }
}