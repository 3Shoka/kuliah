package seleksiMajemuk;

/**
 *
 * @author ashoka
 * Created time 7:08:25 PM 
 * Date Oct 10, 2018
 * 
 * menghitung akar persamaan kuadrat
 * dengan rumus D = B^2 - 4 *A * C
 * 
 * jika D < 0 maka didapat akar imajiner
 * jika D = 0 maka x1 = x2 yang didapat dari x1 = x2 >= -B / (2 * A)
 * jika D > 0 maka ada dua akar, yaitu 
 *  x1 = -B + akar(D/2*A) dan
 *  x2 = -B - akar(D/2*A)
 * 
 * start
 * deklarasi variabel A, B, C, D, X, X1, X2
 * input B = 10, A = 5, C = 3
 * proses D = B^2 - 4 *A * C
 * desision D < 0
 * cetak akar imajiner
 * desision D = 0
 * proses x = -B / (2 * A)
 * cetak x
 * else 
 * proses x1 = -B + akar(D/2*A)
 * proses x2 = -B - akar(D/2*A)
 * end
 * 
 */
public class HitungAkarPersamaan {
    public static void main(String[] args) {
        double A, B, C, D, X, X1, X2;
        A = 1;
        B = 3;
        C = 2;
        D = Math.pow(B, 2) - 4 * A * C;
        System.out.println("Nilai D = "+D);
        if(D < 0) {
            System.out.println("Akar Imajiner");
        } else if(D == 0) {
            X = -B / (2 * A);
            System.out.println("Nilai X = "+ X);
        } else {
            X1 = -B + Math.sqrt(D/2*A);
            X2 = -B - Math.sqrt(D/2*A);
            
            System.out.println("Nilai X1 = "+X1);
            System.out.println("Nilai X2 = "+X2);
        }
    }
}
