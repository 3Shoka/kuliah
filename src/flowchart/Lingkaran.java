package flowchart;

/**
 *
 * @author ashoka
 * Created time 7:03:41 PM 
 * Date Sep 26, 2018
 */
public class Lingkaran {
    public static void main(String[] args) {
        double phi, r, K, L;
        phi = 3.14;
        r = 10;
        K = 2 * (phi * r);
        L = phi * r * r;
        
        System.out.println("Keliling: "+ K);
        System.out.println("Luas: "+ L);
    }
}
