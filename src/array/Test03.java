package array;

import java.util.Scanner;

/**
 *
 * @author Ashokani
 * Created time 7:19:53 PM
 * Date Dec 12, 2018
 */
public class Test03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int angka[] = new int[5];
        int angkaCopy[] = new int[5];
        int i;
        
        for(i=0;i<angka.length;i++){
            System.out.print("Masukkan angka ke-"+ i +" : ");
            angka[i] = sc.nextInt();
        }
        sc.close();
        
        for(i=0;i<angka.length;i++){
            System.out.println("Angka ke "+i+": "+ angka[i]);
        }
        
        System.out.println("Copy array index ke 2 sebanyak 2 index");
        System.arraycopy(angka, 3, angkaCopy, 0, 2);
        
        for(i=0;i<angkaCopy.length;i++){
            System.out.println("Angka ke "+(i+1)+": "+ angkaCopy[i]);
        }
    }
}
