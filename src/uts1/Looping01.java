package uts1;

/**
 *
 * @author Ashokani
 * Created time 7:02:48 PM
 * Date Nov 28, 2018
 * 
 * menampilkan output: 1 3 5 6 8 10 12 14
 */
public class Looping01 {
    public static void main(String[] args) {
        for(int i = 1;i<15;i++) {
            if(i<=5 && i%2==1){
                System.out.print(i +" ");
            } else if(i>5 && i%2==0) {
                System.out.print(i +" ");
            }
        }
    }
}
