package strukturSeleksi;

/**
 *
 * @author ashoka
 * Created time 6:44:14 PM 
 * Date Oct 5, 2018
 */
public class SeleksiHuruf {
    public static void main(String[] args) {
        char ch = 'j';
        if(ch =='a' || ch == 'A' || 
            ch == 'i' || ch == 'I' ||
            ch == 'u' || ch == 'U' ||
            ch == 'e' || ch == 'E' ||
            ch == 'o' || ch == 'O') {
            System.out.println(ch + " adalah huruf vokal.");
        } else {
            System.out.println(ch + " adalah huruf konsonan.");
        }
    }
}
