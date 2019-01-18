package tugas02;

/**
 *
 * @author ashoka
 * Created time 7:21:14 PM 
 * Date Sep 28, 2018
 * 
 * soal 3
 * buat program untuk menentukan kelulusan mahasiswa
 * kelulusan ditentukan dari nilai akhir, dihitung dengan rumus 
 *      nilaiAkhir = 10% kehadiran + 20% tugas + 35% uts + 35% uas
 * 
 * Jika nilai akhir lebih besar 65 maka keterangan "LULUS" 
 * selain itu maka keterangan "TIDAK LULUS"
 * 
 * program dapat menampilkan :
 *      nim, nama, nilai akhir dan keterangan kelulusan
 * 
 */
public class Kelulusan {
    public static void main(String[] args) {
        String nim, nama;
        double kehadiran, tugas, uts, uas, nilaiAkhir;
        
        nim = "18.01.55.2032";
        nama = "Ashokani";
        
        kehadiran = 90;
        tugas = 80;
        uts = 95;
        uas = 85;
        nilaiAkhir = (kehadiran*10/100) + (tugas*20/100) + (uts*35/100) + (uas*35/100);
        
        System.out.println("===================================================");
        System.out.println("Program Kelulusan Mahasiswa");
        System.out.println("===================================================");
        System.out.println("NIM                               : "+nim);
        System.out.println("Nama                              : "+nama);
        System.out.println("Nilai Akhir                       : "+nilaiAkhir);
        System.out.println("===================================================");
        if(nilaiAkhir > 65) {
            System.out.println("Keterangan                        : LULUS");
        } else {
            System.out.println("Keterangan                        : TIDAK LULUS");
        }
        System.out.println("===================================================");
    }
}
