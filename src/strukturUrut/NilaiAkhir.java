package strukturUrut;

/**
 *
 * @author ashoka
 * Created time 7:21:14 PM 
 * Date Sep 28, 2018
 * 
 * buat program untuk menghitung nilai akhir mahasiswa
 * nilai akhir dihitung dengan rumus 
 *      nilaiAkhir = 10% kehadiran + 20% tugas + 35% uts + 35% uas
 * program dapat menampilkan :
 *      nim, nama, kehadiran, tugas, uts, uas, nilai akhir
 * 
 * Jika nilai akhir lebih dari 65 maka keterangan "LULUS" 
 * jika tidak (selain itu) maka keterangan "TIDAK LULUS"
 * 
 */
public class NilaiAkhir {
    public static void main(String[] args) {
        String nim, nama;
        double kehadiran, tugas, uts, uas, nilaiAkhir;
        
        nim = "18.01.55.2032";
        nama = "Ashokani";
        
        kehadiran = 20;
        tugas = 40;
        uts = 10;
        uas = 40;
        nilaiAkhir = (kehadiran*10/100) + (tugas*20/100) + (uts*35/100) + (uas*35/100);
        
        System.out.println("NIM = "+nim);
        System.out.println("Nama = "+nama);
        System.out.println("Nilai Kehadiran = "+kehadiran);
        System.out.println("Nilai Tugas= "+tugas);
        System.out.println("Nilai UTS= "+uts);
        System.out.println("Nilai UAS = "+uas);
        System.out.println("Nilai Akhir = "+nilaiAkhir);
        
        if(nilaiAkhir > 65) {
            System.out.println("LULUS");
        } else {
            System.out.println("TIDAK LULUS");
        }
    }
}
