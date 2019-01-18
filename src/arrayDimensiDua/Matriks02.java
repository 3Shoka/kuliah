package arrayDimensiDua;

import java.util.Arrays;

/**
 *
 * @author ashoka
 * Created 6:40:19 PM
 * Date Jan 4, 2019
 * 
 */
public class Matriks02 {
    public static void main(String[] args) {
//        int matrik[][]= new int[2][3];
//        matrik[0][0] = 40;
//        matrik[0][1] = 50;
//        matrik[0][2] = 60;
//        matrik[1][0] = 70;
//        matrik[1][1] = 80;
//        matrik[1][2] = 90;

        int matrik[][] = {{40, 50, 60},{70, 80, 90, 100}};
        
        System.out.println(Arrays.deepToString(matrik));
     
        for (int i = 0; i < matrik.length; i++) {
            for (int j = 0; j < matrik[i].length; j++) {
                System.out.print(" "+matrik[i][j]);                
            }
            System.out.println("");
        }
    }
}
