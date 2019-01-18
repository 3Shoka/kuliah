package array;

/**
 *
 * @author Ashokani
 * Created time 6:43:20 PM
 * Date Dec 12, 2018
 */
public class Test01 {
    public static void main(String[] args) {
        int angka[] = new int[5];
        
        angka[2] = 40;
        angka[0] = 70;
        angka[3] = 80;
        angka[1] = 10;
        angka[4] = 50;
        
//        System.out.println("nilai mahasiswa = " + angka);
//        System.out.println("nilai mahasiswa = " + angka[3]);
        
        for(int i = 0; i < angka.length;i++){
            System.out.println("nilai mahasiswa: "+ angka[i]);
        }
    }
}
