package tugas03;

/**
 *
 * @author ashoka
 * Created time 9:22:12 AM 
 * Date Oct 14, 2018
 * 
 * soal no 3
 * buat program menampilkan bilangan 0 0 2 0 4 0 6 0 8 0 10
 * 
 */
public class BilanganFor03 {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++) {
            if(i%2==0) {
                System.out.print(i +" ");
            } else {
                System.out.print(i-i +" ");
            }
        }
    }
}
