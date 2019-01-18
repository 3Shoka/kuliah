package tugas03;

/**
 *
 * @author ashoka
 * Created time 9:22:12 AM 
 * Date Oct 14, 2018
 * 
 * soal no 2
 * buat program menampilkan bilangan 0 2 0 4 0 6 0 8 0 10
 * 
 */
public class BilanganForTest {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++) {
            if(i%2==0) {
                System.out.println(i);
            } else {
                System.out.println(i-i);
            }
        }
    }
}
