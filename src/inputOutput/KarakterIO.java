package inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ashokani
 * Created time 6:51:01 PM
 * Date Dec 5, 2018
 */
public class KarakterIO {
    public static void main(String[] args) throws IOException {
        char huruf;
        
        InputStreamReader a = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(a);
        
        System.out.print("Masukkan huruf = ");
        huruf = (char) br.read();
        
        System.out.println("Karakter yang diinput = "+huruf);
    }
}
