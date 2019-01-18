package array;

import java.util.Arrays;

/**
 *
 * @author ashoka
 * Created 8:17:18 AM
 * Date Jan 9, 2019
 * 
 */
public class ArrayCopy {
    public static void main(String[] args) {
        int A[] = {50, 10, 60, 40, 60, 80, 30, 20, 90, 70};
        int B[] = new int[10];
        System.arraycopy(A, 0, B, 3, 4);
        
        for(int i=0;i<B.length;i++){
            System.out.print(B[i]+" ");
        }
    }
}
