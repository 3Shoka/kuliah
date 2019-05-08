package tugas05;

import java.util.Scanner;

/**
 *
 * @author Ashokani
 * Created time 8:16:52 AM
 * Date Dec 19, 2018
 * 
 * Buat program untuk menghitung nilai rata-rata mahasiswa 
 * menggunakan IO. 
 * dari 3 nilai yang diinputkan user.
 * Nilai yang diinput menggunakan looping
 */
public class RataRataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        double nilai[] = new double[3], total = 0, rata;
        
        System.out.print("Nama Mahasiswa      : ");
        nama = sc.nextLine();
        System.out.print("NIM Mahasiswa       : ");
        nim = sc.nextLine();
        for(int i=0;i<nilai.length;i++){
            System.out.print("Masukkan nilai ke-"+ (i+1) +" : ");
            nilai[i] = sc.nextDouble();
            total += nilai[i];
        }
        sc.close();
        rata = total/nilai.length;

        System.out.println("NIM                 : "+nim);
        System.out.println("Nama                : "+nama);
        System.out.println("Total nilai         : "+total);
        System.out.println("Rata-rata nilai     : "+ String.format("%.2f", rata));

    }
}
