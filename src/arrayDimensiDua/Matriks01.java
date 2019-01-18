package arrayDimensiDua;

import java.util.Arrays;

/**
 *
 * @author Ashokani
 * Created time 6:44:15 PM
 * Date Dec 19, 2018
 */
public class Matriks01 {
    public static void main(String[] args) {
        int matriks[][];
        matriks = new int[2][3];
        
        matriks[1][0] = 40;
        matriks[1][2] = 50;
        matriks[0][0] = 10;
        matriks[0][1] = 30;
        matriks[0][2] = 70;
        matriks[1][1] = 60;
        System.out.println("Elemen Matrix nya");
        System.out.println(Arrays.deepToString(matriks));
        
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriks[i][j] +" ");
            }
            System.out.println();
        }
    }
}
