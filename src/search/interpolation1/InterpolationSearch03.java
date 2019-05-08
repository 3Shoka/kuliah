package search.interpolation1;

public class InterpolationSearch03 {
    public static void main(String args[]){
        int data[] = {1, 3, 4, 5, 7};
        int cari = 8;
        boolean flag = false;
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
}