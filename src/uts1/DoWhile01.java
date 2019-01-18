package uts1;

/**
 *
 * @author ashoka
 * Created time 6:44:32 PM 
 * Date Nov 16, 2018
 * 
 * buat program menggunakan looping do while
 * menampilkan 3 3 3 3 3 0 7 0 9 0 11 0 13 0 15
 */
public class DoWhile01 {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i < 6) {
                System.out.print("3 ");
            } else {
                if (i % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print(i + " ");
                }
            }
            i++;
        } while (i <= 15);
    }
}
