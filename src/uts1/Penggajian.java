package uts1;

/*
 * soal nomor 2
 * lembar soal no. 19
 * Hitung Penggajian
 * 
 */

public class Penggajian {
    public static void main(String[] args) {
        // menentukan variabel dan tipe data
        int gol, kehadiran, gapok, tunjangan, total;
        String nik, nama;
        
        // inisialisasi variabel
        nik = "18.01.55.2032";
        nama = "Ashokani";
        gol = 2;
        kehadiran = 10;
        
        
        // proses 
        gapok = 0;
        tunjangan = kehadiran * 10000;
        
        switch (gol) {
            case 1:
                gapok = 500000;
                break;
            case 2:
                gapok = 750000;
                break;
            case 3:
                gapok = 1000000;
                break;
            default:
                System.out.println("============================================");
                System.out.println("Golongan harus antara 1-3");
                System.out.println("Input Golongan, untuk menentukan Gaji Pokok");
                break;
        }
        
        total = gapok + tunjangan;
        
        // cetak hasil
        System.out.println("============================================");
        System.out.println("NIK                     : "+nik);
        System.out.println("Nama Karyawan           : "+nama);
        System.out.println("Golongan                : "+gol);
        System.out.println("Jumlah Kehadiran        : "+kehadiran);
        System.out.println("Tunjangan Transport     : Rp "+ String.format("%,d", tunjangan));
        System.out.println("Gaji Pokok              : Rp "+ String.format("%,d", gapok));
        System.out.println("============================================");
        System.out.println("Total Gaji              : Rp "+ String.format("%,d", total));
        System.out.println("============================================");
    }
}
