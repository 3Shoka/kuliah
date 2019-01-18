package arrayDimensiDua;

import java.util.Arrays;

/**
 *
 * @author ashoka
 * Created 7:04:42 PM
 * Date Jan 4, 2019
 * 
 */
public class Matriks03 {
    public static void main(String[] args) {
        String makul[][] = {{"Pancasila", "Agama"},{"Logika", "Matematika"}};
        
        System.out.println(Arrays.deepToString(makul));
        for (int i = 0; i < makul.length; i++) {
            for (int j = 0; j < makul[i].length; j++) {
                System.out.print(makul[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
