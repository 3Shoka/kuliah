package sorting.bubble;

/**
 * BubbleSort01
 * program sorting data ascending secara bubble
 */
public class BubbleSort01 {
    public static void main(String[] args) {
        int data[] = {8,2,7,5};

        // cetak data sebelum di sorting
        System.out.println("data sebelum di sorting");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }

        // sorting bubble
        for (int i = 1; i < data.length; i++) {
            for (int j = data.length-1; j >= 1; j--) {
                if (data[j] < data[j-1]) {
                    // jika benar, ditukar
                    int tmp;
                    tmp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = tmp;
                }
            }
            System.out.println();
            // cetak data sorting sementara
            System.out.println("data sorting sementara");
            for (int t = 0; t < data.length; t++) {
                System.out.print(data[t]+" ");
            }

        }
        System.out.println();

        // cetak data setelah di sorting
        System.out.println("data setelah sorting");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }

    }
    
}