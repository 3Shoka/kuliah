package search.interpolation1;
 
import java.util.Scanner;

public class InterpolationSearch02 {
    
    // fungsi sorting ascending data array dengan insertion sort
    public static void insertionSort(int data[]) {
        int tmp;
        for (int i = 1; i < data.length; i++) {
            tmp = data[i];
            int j = i-1;

            while(j>=0 && data[j] > tmp){
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = tmp;
        }

        // tampilkan hasil sorting
        System.out.println("Hasil sorting: ");
        for (int h = 0; h < data.length; h++) {
            System.out.print(data[h]+" ");
        }
        System.out.println();
    }
    
    // fungsi pencarian data, interpolation search
    public static int interpolationSearch(int[] dataArray, int cari) {
        int low = 0;
        int high = dataArray.length - 1;
        int mid;

        insertionSort(dataArray);

        while (dataArray[low] <= cari && dataArray[high] >= cari) {
            if (dataArray[high] - dataArray[low] == 0)
                return (low + high)/2;
            
             mid = low + ((cari - dataArray[low]) * (high - low)) / (dataArray[high] - dataArray[low]);  
 
             if (dataArray[mid] < cari)
                 low = mid + 1;
             else if (dataArray[mid] > cari)
                 high = mid - 1;
             else
                 return mid;
        }
        if (dataArray[low] == cari)
            return low;
        else
            return -1; 
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.println(); 
        System.out.println("Interpolation Search");
        int n, i;

        System.out.print("Masukkan cacah data yang akan diinput: ");
        n = scan.nextInt();

        int arr[] = new int[n];

        System.out.println("Masukkan "+ n +" elemen data array");
        for (i = 0; i < n; i++){
            System.out.print("Data ke "+i+" : ");
            arr[i] = scan.nextInt();
        }
        System.out.print("Elemen data yang akan dicari: ");
        int key = scan.nextInt();
 
        int result = interpolationSearch(arr, key);
 
        if (result == -1)
            System.out.println("Data "+key +" tidak ditemukan");
        else
            System.out.println("Data "+ key +" ditemukan diposisi ke "+ result);
 
    }    
}