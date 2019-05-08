package search.sequential.sentinel;

/**
 * SequentialSentinel01
 */
public class SequentialSentinel01 {

    public static void main(String[] args) {
        int data[] = new int[7];
        data[0] = 3;
        data[1] = 12;
        data[2] = 9;
        data[3] = -4;
        data[4] = 21;
        data[5] = 6;
        int cari = 10;
        data[6] = cari;
        int i; 

        i = 0;
        while (data[i] != cari) {
            i++;
        }

        if (i < 6) {
            System.out.println("DATA ADA");
        } else {
            System.out.println("DATA TIDAK ADA");
        }
    }
}