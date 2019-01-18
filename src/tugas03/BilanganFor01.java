package tugas03;

/**
 *
 * @author ashoka
 * Created time 9:21:50 AM 
 * Date Oct 14, 2018
 * 
 * soal no. 1
 * buat program menampilkan bilangan genap dari 1-20
 * 
 */
public class BilanganFor01 {
    public static void main(String[] args) {
        for(int i = 1;i<=20;i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }
    }
}
