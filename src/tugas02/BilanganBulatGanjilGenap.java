package tugas02;

/**
 *
 * @author ashoka
 * Created time 7:11:51 PM 
 * Date Oct 3, 2018
 * 
 * soal 1
 * buat program 
 * menentukan bilangan bulat ganjil atau genap
 * 
 */

public class BilanganBulatGanjilGenap {
    public static void main(String[] args) {
        int bilangan;
        bilangan = 21;
        
        if(bilangan % 2==0) {
            System.out.println(bilangan + " adalah Bilangan Bulat Genap");
        } else {
            System.out.println(bilangan + " adalah Bilangan Bulat Ganjil");
        }
    }

}
