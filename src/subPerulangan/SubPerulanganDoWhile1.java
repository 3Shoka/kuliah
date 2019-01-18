package subPerulangan;

/**
 *
 * @author ashoka
 * Created time 8:15:04 AM 
 * Date Nov 16, 2018
 */
class SubPerulanganDoWhile1 {

    public static void main(String[] args) {
        int i, j;
        i = 1;
        do {
            j = 1;
            do {
                System.out.println(i + "," + j);
                j++;
            }
            while (j <= 5);
            i++;
        }
        while (i <= 10);
    }
}