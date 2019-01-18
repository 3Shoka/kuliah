package tugasMatriks;

/**
 *
 * Buat program menjumlahkan 2 buah matriks
 * di buat oleh: 
 * Ashokani 18.01.55.2032
 * Kevin nim
 * Kelvin nim
 */
public class PenjumlahanMatriks {
    public static void main(String[] args) {
        int matriks1[][] = {{1,2},{3,4}};
        int matriks2[][] = {{5,6},{7,8}};
        int hasil[][] = new int[2][2];
        
//        cetak matriks 1
        System.out.println("Matriks 1");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(matriks1[i][j] +"  ");
            }
            System.out.println();
        }
        System.out.println();
        
//        cetak matriks 2
        System.out.println("Matriks 2");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(matriks2[i][j] +"  ");
            }
            System.out.println();
        }
        
//        proses penjumlahan matriks di masukkan ke var hasil
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                hasil[i][j] = matriks1[i][j]+matriks2[i][j];
            }
        }
        System.out.println();
        
//        tampilkan proses penjumlahan
        System.out.println("Penjumlahan Matriks 1 dan 2");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(matriks1[i][j] +" + "+matriks2[i][j]+" = "+hasil[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println();
//        cetak matriks hasil penjumlahan
        System.out.println("Hasil");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(hasil[i][j] +"  ");
            }
            System.out.println();
        }
    }

}
