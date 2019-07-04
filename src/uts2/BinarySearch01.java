package uts2;

import java.util.Scanner;

/**
 * 
 * program pencarian data dg algoritma Binary Search
 * ketentuan:
 *  - panjang array tergantung input user
 *  - deret data array diinput user
 *  - data yg dicari diinput user
 *  - sorting ascending dg algoritma Selection Sort
 * 
 * @author Ashokani
 */
public class BinarySearch01 {

    Scanner in = new Scanner(System.in);
    private int cacah;
    private int data[];
    private boolean flag;
    private int cari;

    public void inputCacah() {
        System.out.print("Masukkan cacah data yang akan diinput: ");
        cacah = in.nextInt();
    }

    public void inputData() {
        data = new int[cacah];
        for (int i = 0; i < cacah; i++) {
            System.out.print("Masukkan data ke " + i + " : ");
            data[i] = in.nextInt();
        }
    }

    public void cetakData() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public void selectionSort() {
        System.out.println();
        System.out.println("Proses selection sort: ");
        int i, j, pos;
        for (i = 0; i < data.length - 1; i++) {
            pos = i;
            for (j = i + 1; j < data.length; j++) {
                if (data[j] < data[pos]) {
                    pos = j;
                }
            }
            if (pos != i) {
                int temp = data[i];
                data[i] = data[pos];
                data[pos] = temp;
            }
            System.out.println("Hasil langkah ke " + (i + 1) + " : ");
            cetakData();
            System.out.println();
        }

    }

    public void inputPencarian() {
        System.out.print("Masukkan data yang akan dicari: ");
        cari = in.nextInt();
    }

    public void binarySearch() {
        System.out.println();
        System.out.println("Proses binary search: ");
        int first = 0;
        int last = data.length - 1;

        int mid = (first + last) / 2;
        while (first <= last) {
            if (data[mid] < cari) {
                first = mid + 1;
            } else if (data[mid] == cari) {
                flag = true;
                System.out.println("Data ditemukan, " + cari + " di index ke " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Data tidak ada");
        }
    }

    public void hasil() {
        if (flag == true) {
            System.out.println("Data ditemukan");
        } else {
            System.out.println("Data tidak ditemukan");
        }


    }
}

class Search {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("      Program Sorting dan Searching      ");
        System.out.println("==========================================");
        BinarySearch01 searching = new BinarySearch01();
        searching.inputCacah();
        searching.inputData();
        System.out.println("==========================================");
        System.out.println("Data sebelum sorting");
        searching.cetakData();
        System.out.println("==========================================");
        searching.selectionSort();
        System.out.println("==========================================");
        searching.inputPencarian();
        System.out.println("==========================================");
        searching.binarySearch();

        System.out.println("==========================================");
        searching.hasil();
        System.out.println("==========================================");
    }
}
