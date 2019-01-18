package subPerulangan;

/**
 *
 * @author ashoka
 * Created time 8:15:04 AM 
 * Date Nov 16, 2018
 */
class SubPerulanganWhile {

    public static void main(String[] args) {
        int i, j;
        i = 1;
        while (i <= 10) {
            j = 1;
            while (j <= 5) {
                System.out.println(i + "," + j);
                j++;
            }
            i++;
        }
    }
}