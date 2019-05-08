
import java.util.Scanner;

public class Searching {

    Scanner in = new Scanner(System.in);
    private int cacah;
    private int data[];

    private boolean flag;
    private int cari;
    
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
        System.out.println();
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
                for (int t = 0; t < data.length; t++) {
                    System.out.print(data[t]+" ");
                }
                System.out.println();
            }
        }
        cetakData();
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

            System.out.println("Proses sorting " + i);
            cetakData();
            System.out.println();
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

    public void inputPencarian() {
        System.out.print("Masukkan data yang akan dicari: ");
        cari = in.nextInt();
    }
   
    public void sequentialSearch(){
        System.out.println();
        System.out.println("Proses sequential search: ");
        
        for (int i = 0; i < data.length; i++) {
            if(data[i]==cari){
                flag = true;
                System.out.println("Data ditemukan, "+cari+ " data yang dicari");
            } else {
                System.out.println("Data "+data[i]+ " bukan data yang dicari");
            }
        }
    }
    
    public void sequentialSentinelSearch(){
        System.out.println();
        System.out.println("Proses sequential sentinel search: ");
        int tmpData[] = new int[cacah+1];
        System.arraycopy(data, 0, tmpData, 0, data.length);
        
        tmpData[cacah] = cari;
        
        System.out.println("Cetak data");
        for (int t = 0; t < data.length; t++) {
            System.out.print(data[t]+" ");
        }
        System.out.println();
        System.out.println("Cetak tmpData with sentinel");
        for (int t = 0; t < tmpData.length; t++) {
            System.out.print(tmpData[t]+" ");
        }
        System.out.println();

        int i = 0;
        do {
            if(tmpData[i]==cari){
                flag = true;
                System.out.println("Data ditemukan, "+cari+ " data yang dicari");
                break;
            } else {
                System.out.println("Data "+data[i]+ " bukan data yang dicari");
                i++;
            }

        } while(i < data.length);
    }
    
    public void binarySearch(){
        System.out.println();
        System.out.println("Proses binary search: ");
        int first = 0;
        int last = data.length-1;
        
            int mid = (first + last)/2;  
            while( first <= last ){  
                if ( data[mid] < cari ){
                    first = mid + 1;     
                } else if ( data[mid] == cari ){
                    flag = true;
                    System.out.println("Data ditemukan, "+ cari +" data yang dicari");
                    break;
                } else {
                    last = mid - 1;  
                }
                mid = (first + last)/2;  
            }
            if ( first > last ){  
                System.out.println("Data tidak ada");  
            }
    }

    public void interpolationSearch(){
        System.out.println();
        System.out.println("Proses sequential search: ");
        int first = 0;
        int last = data.length-1;
        int mid;
        while (data[first] <= cari && data[last] >= cari && first <= last) {

            if (data[last] == data[first]) {
                flag = true;
                System.out.println("Data ditemukan, "+ data[first] +" data yang dicari");
                break;
            } else {
                mid = first + ((cari - data[first]) * (last - first)) / (data[last] - data[first]);  
    
                if (data[mid] < cari) {
                    first = mid + 1;
                } else if (data[mid] > cari) {
                    last = mid - 1;
                } else {
                    flag = true;
                    System.out.println("Data ditemukan, "+ data[mid] +" data yang dicari");
                    break;
                }
            }
        
        }
        if (!flag) {
            System.out.println("Data tidak ada atau diluar range");
        }
    }

    public void hasil(){
        if(flag==true)
            System.out.println("Data ditemukan");
        else 
            System.out.println("Data tidak ditemukan");
    }
}

class Search{
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("      Program Sorting dan Searching      ");
        System.out.println("==========================================");
        Searching searching = new Searching();
        searching.inputCacah();
        searching.inputData();
        System.out.println("==========================================");
        System.out.println("Data sebelum sorting");
        searching.cetakData();
        System.out.println("==========================================");
        
        // searching.bubbleSort();
        searching.insertionSort();
        System.out.println("==========================================");
        searching.inputPencarian();
        System.out.println("==========================================");
        // searching.sequentialSearch();
        // searching.sequentialSentinelSearch();
        // searching.binarySearch();
        searching.interpolationSearch();
        
        System.out.println("==========================================");
        searching.hasil();
        System.out.println("==========================================");
    }
}
