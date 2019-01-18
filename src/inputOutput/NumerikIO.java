package inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ashokani
 * Created time 7:20:30 PM
 * Date Dec 5, 2018
 */
public class NumerikIO {
    public static void main(String[] args) throws IOException {
        int d1, d2, jml;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan data 1: ");
        d1 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan data 2: ");
        d2 = Integer.parseInt(br.readLine());
        
        jml = d1+d2;
        
        System.out.println("Hasil penjumlahan: "+jml);
    }
}
