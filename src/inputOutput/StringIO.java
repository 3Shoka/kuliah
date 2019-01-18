package inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ashokani
 * Created time 7:07:00 PM
 * Date Dec 5, 2018
 */
public class StringIO {
    public static void main(String[] args) throws IOException {
        String nim, nama, prodi, alamat;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("========= INPUT =========");
        System.out.print("Masukkan nama   : ");
        nama = br.readLine();
        System.out.print("Masukkan NIM    : ");
        nim = br.readLine();
        System.out.print("Masukkan Prodi  : ");
        prodi = br.readLine();
        System.out.print("Masukkan Alamat : ");
        alamat = br.readLine();
        
        System.out.println("========= OUTPUT =========");
        System.out.println("Nama            : "+nama);
        System.out.println("NIM             : "+nim);
        System.out.println("Program Studi   : "+prodi);
        System.out.println("Alamat          : "+alamat);
        System.out.println("===========================");
    }
}
