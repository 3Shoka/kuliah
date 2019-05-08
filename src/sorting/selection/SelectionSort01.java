package sorting.selection;

/**
 * SelectionSort01
 */
class SelectionSort01 {

    private long[] data;
    private int jumItem;
    
    public SelectionSort01(int max) {
        data = new long[max];
        jumItem = 0;
    }

    public void tambah(long nilai){
        data[jumItem] = nilai;
        jumItem++;
    }

    public void cetak(){
        for (int j = 0; j < jumItem; j++) {
            System.out.print(data[j]+" ");
            // System.out.println(" ");
        }
    }

    public void selectionSort() {
        int i, j, pos;
        for (i = 0; i < jumItem-1; i++) {
            pos = i;

            for (j = i+1; j < jumItem; j++) {
                if (data[j] < data[pos])
                    pos = j;
            }
         
            if (pos != i)
                tukar(pos, i);
            
            System.out.print("Hasil langkah ke " +(i+1)+" : ");
            cetak();
            System.out.println();
        }
    }

    private void tukar(int a, int b) {
        long tmp = data[a];
        data[a] = data[b];
        data[b] = tmp;
    }
}

/**
 * ApliSelectionSort
 */
class ApliSelectionSort {

    public static void main(String[] args) {
        int ukuran = 100;

        SelectionSort01 data;
        data = new SelectionSort01(ukuran);

        data.tambah(32);
        data.tambah(75);
        data.tambah(69);
        data.tambah(58);
        data.tambah(21);
        data.tambah(40);

        System.out.print("Data awal: ");
        data.cetak();
        
        System.out.println();
        data.selectionSort();
        System.out.print("Data akhir: ");
        data.cetak();
        System.out.println();

    }
}
