package inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ashokani
 * Created time 7:23:11 PM
 * Date Dec 7, 2018
 * 
 * buat program menggunakan IO
 * menghitung nilai akhir dan kelulusan mahasiswa
 * dengan ketentuan nilai akhir dihitung dg rumus
 *      nilaiAkhir = 10% kehadiran + 20% tugas + 35% uts + 35% uas
 * Jika nilai akhir lebih dari 65 maka keterangan "LULUS" 
 * jika tidak (selain itu) maka keterangan "TIDAK LULUS"
 * 
 */
public class NilaiAkhirIO {
    public static void main(String[] args) throws IOException {
        String nim, nama;
        double kehadiran, tugas, uts, uas, nilaiAkhir;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Masukkan NIM     : ");
        nim = br.readLine();
        System.out.print("Masukkan Nama    : ");
        nama = br.readLine();
        System.out.print("Nilai Kehadiran  : ");
        kehadiran = Double.parseDouble(br.readLine());
        System.out.print("Nilai Tugas      : ");
        tugas = Double.parseDouble(br.readLine());
        System.out.print("Nilai UTS        : ");
        uts = Double.parseDouble(br.readLine());
        System.out.print("Nilai UAS        : ");
        uas = Double.parseDouble(br.readLine());
           
        
        nilaiAkhir = (kehadiran * 10 / 100) + (tugas * 20 / 100) + (uts * 35 / 100) + (uas * 35 / 100);

        System.out.println("=================================");
        System.out.println("Program Kelulusan Mahasiswa");
        System.out.println("=================================");
        System.out.println("NIM              : " + nim);
        System.out.println("Nama             : " + nama);
        System.out.println("Nilai Kehadiran  : " + kehadiran);
        System.out.println("Nilai Tugas      : " + tugas);
        System.out.println("Nilai UTS        : " + uts);
        System.out.println("Nilai UAS        : " + uas);
        System.out.println("Nilai Akhir      : " + nilaiAkhir);
        System.out.println("=================================");
        if (nilaiAkhir > 65) {
            System.out.println("Keterangan       : LULUS");
        } else {
            System.out.println("Keterangan       : TIDAK LULUS");
        }
        System.out.println("=================================");
    }
}
