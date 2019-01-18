package uts1;

/**
 *
 * @author ashoka
 * Created time 7:13:23 PM 
 * Date Nov 16, 2018
 * 
 * buat program menggunakan looping do while
 * menampilkan 3 3 3 3 3 0 6 0 8 0 10 0 12 0 14
 */
public class DoWhile02 {
    public static void main(String[] args) {
        int i=0;
        do {
            if(i<5){
                System.out.print("3 ");
            } else{
                if(i%2==0){
                    System.out.print(i+" ");
                } else{
                    System.out.print("0 ");
                }
            }
            i++;
        } while(i<15);
    }
}
