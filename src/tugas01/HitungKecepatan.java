package tugas01;

/**
 *
 * @author ashoka
 * Created time 7:51:51 PM 
 * Date Sep 29, 2018
 * 
 * Tugas01 Soal No. 1
 * buat program untuk menghitung kecepatan
 * kecepatan dihitung dengan rumus
 *      kecepatan = jarak/waktu
 */
public class HitungKecepatan {
    public static void main(String[] args) {
        double kecepatan, jarak, waktu;
        jarak = 100; // kilometer
        waktu = 4; // jam
        kecepatan = jarak/waktu;
        System.out.println("==========================================");
        System.out.println("         Program Hitung Kecepatan         ");
        System.out.println("==========================================");
        System.out.println("Jarak                             "+jarak+" km");
        System.out.println("Waktu                              "+waktu+" jam");
        System.out.println("==========================================");
        System.out.println("Kecepatan                      "+kecepatan+" km/jam");
        System.out.println("==========================================");
    }
}
