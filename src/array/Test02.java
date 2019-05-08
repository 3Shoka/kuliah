package array;

import java.util.Scanner;

/**
 *
 * @author Ashokani
 * Created time 6:56:30 PM
 * Date Dec 12, 2018
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka[] = new int[5];
        
        for(int i=0;i<angka.length;i++){
            System.out.print("Masukkan angka ke-"+ (i+1) +" : ");
            angka[i] = sc.nextInt();
        }
        sc.close();
        
        for(int i=0;i<angka.length;i++){
            System.out.println("Angka ke "+(i+1)+": "+ angka[i]);
        }
    }
}
