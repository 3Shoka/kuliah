package sorting.exchange;

/**
 * ExchangeSort01
 * program sorting array descending dengan exchange sort
 */
public class ExchangeSort01 {

    public static void main(String[] args) {
        int data[] = {5,6,8,1,3,25,10};

        System.out.println("Data sebelum sorting");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }

        // proses sorting exchange 
        System.out.println();
        for (int i = 0; i < data.length-1; i++) {
            System.out.println();
            System.err.println("Proses "+(i+1));
            for (int j = i+1; j < data.length; j++) {
                if (data[i] < data[j]) {
                    // proses pertukaran data
                    int tmp;
                    tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
                for (int t = 0; t < data.length; t++) {
                    System.out.print(data[t]+" ");
                }
                System.err.println();
            }
        }
        System.out.println();
        System.err.println("Setelah sorting");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
    }
}