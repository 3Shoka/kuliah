package arrayDimensiDua;

import java.util.Scanner;

/**
 *
 * @author ashoka
 * Created 7:16:35 PM
 * Date Jan 4, 2019
 * 
 */
public class Matriks04 {
    public static void main(String[] args) {
        int matrik[][] = new int[2][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrik.length; i++) {
            for (int j = 0; j < matrik[i].length; j++) {
                System.out.print("Masukkan nilai matriks: ");
                matrik[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
        
        for (int i = 0; i < matrik.length; i++) {
            for (int j = 0; j < matrik[i].length; j++) {
                System.out.print(matrik[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
