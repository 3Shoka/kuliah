package subPerulangan;

/**
 *
 * @author Ashokani
 * Created time 7:31:43 PM
 * Date Nov 30, 2018
 */
public class SubPerulanganWhile2 {
    public static void main(String[] args) {
        int i, j;
        i=1;
        while(i<=5) {
            j=1;
            while(j<=i){
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
