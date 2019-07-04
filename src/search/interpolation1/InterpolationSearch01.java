package search.interpolation1;

/**
 * InterpolationSearch01
 */
public class InterpolationSearch01 {

    public static void main(String[] args) {
        int data [] = new int [9];
        data[0] = 3;
        data[1] = 9;
        data[2] = 11;
        data[3] = 12;
        data[4] = 15;
        data[5] = 17;
        data[6] = 23;
        data[7] = 31;
        data[8] = 35;
        int low, high, flag, cari, pos, n;
        flag = 0;
        cari = 37;
        n = 9;
        low = 0;
        high = n - 1;
        do {
            pos= Math.abs((cari-data[low]) / (data[high] - data[low]) * (high - low) + low);
            //pos = pos1;
            if (data[pos] == cari) {
                flag = 1;
                break;
            }
            if (data[pos] > cari) {
                high = pos - 1;
            } else if (data[pos] < cari) {
                low = pos + 1;
            }
        }
        while (cari >= data[low] && cari <= data[high]);
        if (flag == 0) {
            System.out.println("data tidak ada");
        } else {
            System.out.println("data ada");
        }
    }
}