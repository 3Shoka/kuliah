package sorting.insertion;

/**
 * InsertionSort01
 */
public class InsertionSort01 {

    public static void main(String[] args) {
        int[] data = {22, 10, 15, 3, 8, 2};
        int tmp;
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
        for (int i = 1; i < data.length; i++) {
            tmp = data[i];
            int j = i-1;

            while(j>=0 && data[j] > tmp){
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = tmp;

            System.out.println("data sementara: "+i);
            for (int h = 0; h < data.length; h++) {
                System.out.print(data[h]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        
    }
}