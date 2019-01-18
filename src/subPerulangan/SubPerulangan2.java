package subPerulangan;

/**
 *
 * @author Ashokani
 * Created time 6:42:10 PM
 * Date Nov 30, 2018
 */
public class SubPerulangan2 {
    public static void main(String[] args) {
        int i, j;
        i = 1;
        do {
            j=1;
            do{
                System.out.print(" "+j);
                j++;
            }
            while(j<=i);
            System.out.println();
            i++;
        }
        while(i<=5);
    }
}
