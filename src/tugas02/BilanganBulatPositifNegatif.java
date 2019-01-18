package tugas02;

/**
 *
 * @author ashoka
 * Created time 7:03:56 PM 
 * Date Oct 3, 2018
 * 
 * soal 2
 * buat program
 * untuk menentukan sebuah bilangan bulat negatif atau positif
 * 
 */
public class BilanganBulatPositifNegatif {
    public static void main(String[] args) {
        int bilangan;
        bilangan = -3;
        
        if(bilangan > 0 ){
            System.out.println("Angka "+bilangan+ " adalah Bilangan Bulat Positif");
        } else {
            System.out.println("Angka "+bilangan+ " adalah Bilangan Bulat Negatif");
        }
    }
}
