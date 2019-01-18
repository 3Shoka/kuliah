package tugas03;

/**
 *
 * @author ashoka
 * Created time 9:22:03 AM 
 * Date Oct 14, 2018
 * 
 * soal no 2
 * buat program menampilkan bilangan 0 2 4
 * 
 */
public class BilanganWhile02 {
    public static void main(String[] args) {
        int i = 0;
        while(i<5) {
            if(i%2==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
