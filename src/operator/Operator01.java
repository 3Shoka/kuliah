package operator;

/**
 *
 * @author ashoka
 * Created time 7:31:54 PM 
 * Date Sep 21, 2018
 */
public class Operator01 {
    public static void main(String[] args) {
        int a, b, c, d, e;
        
        // operator 
        a = 10;
        b = a*5;
        c = b-10;
        d = a+c;
        e = b%3;
        
        System.out.println("Nilai variable a = "+ ++a);
        System.out.println("Nilai variable b = "+b);
        System.out.println("Nilai variable c = "+c);
        System.out.println("Nilai variable d = "+d);
        System.out.println("Nilai variable e = "+e);
        
        // increment 
        a++;
        System.out.println("Nilai variable a setelah increment = "+a);
        
        // decrement 
        a--;
        System.out.println("Nilai variable a setelah decrement = "+a);
    }
}
