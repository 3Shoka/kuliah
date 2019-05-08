package search.binary1;

/**
 * BinarySearch01
 */
public class BinarySearch01 {

    public static void main(String[] args) {
        int data[] = {70, 45, 50, 55, 35, 60, 40};
        int r, m, l=0, n=data.length;
        int cari = 60;
        r = n-1;
        int ktm = 0;
        while (l<=r && ktm == 0) {
            m = (l+r)/2;
            if(data[m]==cari){
                ktm=1;
                System.out.println("ketemu, index ke "+m);
            } else if(cari<data[m]){
                r=m-1;
            } else {
                l = m+1;
            }
        }
        if(ktm==1){
            System.out.println("Data ditemukan");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}