package arrayrefresh;

/**
 * ArrayMultidimensi
 * looping array multidimendi 
 */
public class ArrayMultidimensi01 {

    public static void main(String[] args) {
        int matrik[][] = {{10,40,70,20}, {30,80,50,60},{40,10,20,90}};

        // System.out.print(matrik[1][1]);

        for (int i = 0; i < matrik.length; i++) {
            for (int j = 0; j < matrik[i].length; j++) {
                System.out.print(matrik[i][j]+" ");
            }
            System.out.println();
        }
    }

}