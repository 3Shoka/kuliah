package uts1;

/**
 *
 * @author Ashokani
 * Created time 6:56:07 PM
 * Date Nov 28, 2018
 */
public class HitungNilaiX {
    public static void main(String[] args) {
        int A, B, X;
        
        A = 31;
        
        if(A >= 15) {
            B = 3*A;
        } else {
            B = 5+A;
        }
        
        X = A+B-5;
        System.out.println(X );
    }
}
