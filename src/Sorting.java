
import java.util.Scanner;

public class Sorting {

    Scanner in = new Scanner(System.in);
    private int cacah;
    private int data[];
    
    public void inputCacah(){
        System.out.print("Masukkan cacah data yang akan diinput: ");
        cacah = in.nextInt();
    }
    
    public void inputData(){
        data = new int[cacah];
        for (int i = 0; i < cacah; i++) {
            System.out.print("Masukkan data ke "+i+" : ");
            data[i] = in.nextInt();
        }
    }
    
    public void cetakData(){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
    }

    public void bubbleSort(){
        System.out.println();
        System.out.println("Proses bubble sort: ");
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
    }
    
    public void exchangeSort(){
        System.out.println();
        System.out.println("Proses exchange sort:");
        for (int i = 0; i < data.length-1; i++) {
            System.out.println();
            System.out.println("Proses "+(i+1));
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
                System.out.println();
            }
        }
    }

    public void insertionSort(){
        System.out.println();
        System.out.println("Proses insertion sort: ");
        // proses insertion sort
        for (int i = 1; i < data.length; i++) {
            int tmp = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > tmp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = tmp;

            System.out.println("data sementara: " + i);
            cetakData();
            System.out.println();
        }
    }

    public void selectionSort() {
        System.out.println();
        System.out.println("Proses selection sort: ");
        int i, j, tmp;
        for (i = 0; i < data.length-1; i++) {
            tmp = i;

            for (j = i+1; j < data.length; j++) {
                if (data[j] < data[tmp])
                    tmp = j;
            }
         
            if (tmp != i) {
                tmp = data[i];
                data[i] = data[j-1];
                data[j-1] = tmp;
            }

            System.out.print("Hasil langkah ke " +(i+1)+" : ");
            cetakData();
            System.out.println();
        }
    }
    
}

class Sort{
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        
        sorting.inputCacah();
        
        sorting.inputData();
        
        System.out.println("Data sebelum sorting");
        sorting.cetakData();
        
        sorting.bubbleSort();
        // sorting.exchangeSort();
        // sorting.insertionSort();
        // sorting.selectionSort();
        
        System.out.println("Data setelah sorting");
        sorting.cetakData();
        System.out.println();
    }
}
