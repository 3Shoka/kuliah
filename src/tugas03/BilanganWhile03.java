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
public class BilanganWhile03 {
    public static void main(String[] args) {
        int i = 0;
        while(i<=10) {
            if(i%2==0) {
                System.out.println(i);
                if(i==10){
                    break;
                }
                System.out.println(i-i);
            }
            i++;
        }
    }
}
