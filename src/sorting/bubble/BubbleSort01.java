package sorting.bubble;

/**
 * BubbleSort01
 * program sorting data ascending secara bubble
 */
public class BubbleSort01 {
    public static void main(String[] args) {
        int data[] = {5,6,8,1,3,25,10};
        // cetak data sebelum di sorting
        System.out.println("data sebelum di sorting");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
        // sorting bubble
        for (int i = 0; i < data.length; i++) {
            System.out.println("proses "+(i+1));
            for (int j = 0; j < data.length-1; j++) {
                if (data[j] > data[j+1]) {
                    // jika benar, ditukar
                    int tmp;
                    tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
                // cetak data sorting sementara
                // System.out.println("sementara "+data.length);
                for (int t = 0; t < data.length; t++) {
                    System.out.print(data[t]+" ");
                }
                System.out.println();
            }
        }
        
        // cetak data setelah di sorting
        System.out.println("data setelah sorting");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }

    }
    
}