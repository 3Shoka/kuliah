package uts1;

/**
 *
 * @author ashoka
 * Created time 6:55:30 PM 
 * Date Nov 16, 2018
 * 
 * buat program menggunakan looping while
 * menampilkan 0 1 0 3 0 5 0 7 0 9 3 3 3 3 3
 */
public class While01 {
    public static void main(String[] args) {
        int i=0;
        while(i<15) {
            if(i%2==1 && i<=9){
                System.out.print(i+" ");
            } else if(i>9){
                System.out.print("3 ");
            } else {
                System.out.print("0 ");
            }
            i++;
        }
    }
}
