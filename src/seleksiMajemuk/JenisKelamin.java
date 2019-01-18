package seleksiMajemuk;

/**
 *
 * @author ashoka
 * Created time 6:47:37 PM 
 * Date Oct 10, 2018
 * 
 * Struktur Seleksi Majemuk
 * 
 */
public class JenisKelamin {
    public static void main(String[] args) {
        char kode;
        
        kode = 'a';
        
        if(kode=='W' || kode =='w') {
            System.out.println("Jenis Kelamin Wanita");
        } else if(kode=='L' || kode =='l') {
            System.out.println("Jenis Kelamin Laki-laki");
        } else {
            System.out.println("Kode Salah");
        }
    }
}
