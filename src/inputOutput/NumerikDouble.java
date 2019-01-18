package inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ashokani
 * Created time 7:12:03 PM
 * Date Dec 7, 2018
 */
public class NumerikDouble {
    public static void main(String[] args) throws IOException {
        double d1, d2, jml;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Masukkan data 1: ");
        d1 = Double.parseDouble(br.readLine());
        
        System.out.print("Masukkan data 2: ");
        d2 = Double.parseDouble(br.readLine());
        
        jml = d1+d2;
        System.out.println("Hasil penjumlahan: "+jml);
    }
}
