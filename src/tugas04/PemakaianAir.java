package tugas04;

/**
 *
 * @author Ashokani
 * Created time 7:15:51 PM
 * Date Nov 23, 2018
 * 
 * Buat program hitung biaya pemakaian air
 * Total Biaya = Biaya Dasar + Biaya Pemakaian
 * biaya pemakaian dihitung berdasarkan pemakaian per meter kubik
 * jika pemakaian kurang dari 50 m3 maka biaya per m3 = 5000
 * selain itu maka biaya pemakaian per m3 = 10.000
 * 
 * biaya dasar dihitung berdasarkan jenis pelanggan:
 * Jenis pelanggan Rumah tangga = 100.000
 *                 Sosial = 200.000
 *                 Industri = 300.000
 * 
 * program dapat menampilkan 
 * Nama Pelanggan
 * Jumlah Pemakaian air
 * Jenis Pelanggan
 * Biaya Dasar
 * Biaya Pemakaian 
 * Total Biaya
 * 
 */
public class PemakaianAir {
    public static void main(String[] args) {
        String namaPelanggan, jenisPelanggan;
        int jumlahPemakaian, biayaDasar, biayaPakai, totalBiaya;
        
        namaPelanggan = "Tukiman";
        jenisPelanggan = "Industri";
        jumlahPemakaian = 140;
        // hitung biaya pemakaian
        if(jumlahPemakaian < 50) {
            biayaPakai = jumlahPemakaian * 5000;
        } else {
            biayaPakai = jumlahPemakaian * 10000;
        }
        
        // tentukan biaya dasar
        switch (jenisPelanggan) {
            case "Rumah Tangga":
                biayaDasar = 100000;
                break;
            case "Sosial":
                biayaDasar = 200000;
                break;
            case "Industri":
                biayaDasar = 300000;
                break;
            default:
                System.out.println("==============================================");
                System.out.println("Jenis Pelanggan tidak terdaftar");
                biayaPakai = 0;
                biayaDasar = 0;
                break;
        }
        
        totalBiaya = biayaDasar + biayaPakai;
        System.out.println("==============================================");
        System.out.println("Nama Pelanggan               : "+namaPelanggan);
        System.out.println("Jumlah Pemakaian Air         : "+jumlahPemakaian+" m³");
        System.out.println("Jenis Pelanggan              : "+jenisPelanggan);
        System.out.println("Biaya Dasar                  : Rp "+ String.format("%,d", biayaDasar));
        System.out.println("Biaya Pemakaian              : Rp "+ String.format("%,d", biayaPakai));
        System.out.println("==============================================");
        System.out.println("Total Biaya                  : Rp "+ String.format("%,d", +totalBiaya));
        System.out.println("==============================================");
    }
}
