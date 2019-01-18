package tugas01;

/**
 *
 * @author ashoka
 * Created time 8:02:30 PM 
 * Date Sep 29, 2018
 * 
 * Tugas01 Soal No. 2
 * buat program untuk menghitung penjualan
 * dengan output nota penjualan 
 * 
 */
public class hitungPenjualan {
    public static void main(String[] args) {
        String kodePelanggan, namaPelanggan, kodeBarang, namaBarang;
        int jumlahBeli, hargaBarang, totalBayar;
        
        kodePelanggan = "P001";
        namaPelanggan = "Ashokani";
        kodeBarang = "B001";
        namaBarang = "Buku Tulis";
        jumlahBeli = 45;
        hargaBarang = 15000;
        totalBayar = hargaBarang*jumlahBeli;
        
        System.out.println("=======================================================");
        System.out.println("                   Struk Penjualan                    ");
        System.out.println("=======================================================");
        System.out.println("Kode Pelanggan                               "+kodePelanggan);
        System.out.println("Nama Pelanggan                               "+namaPelanggan);
        System.out.println("Kode Barang                                  "+kodeBarang);
        System.out.println("Nama Barang                                  "+namaBarang);
        System.out.println("Jumlah Beli                                  "+jumlahBeli);
        System.out.println("Harga Barang                              Rp "+String.format("%,d", hargaBarang));
        System.out.println("=======================================================");
        System.out.println("Total Bayar                               Rp " +String.format("%,d", totalBayar));
        System.out.println("=======================================================");
    }
}
