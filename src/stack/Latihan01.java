package stack;

import java.util.Scanner;

class Latihan01 {

    private int maxStack;
    private char tumpukan[];
    private int top;

    public Latihan01 (int s) {
        maxStack = s;
        tumpukan = new char[maxStack];
        top = -1;
    }

    public void push(char j) {
        tumpukan[++top]=j;
    }

    public char pop() {
        return tumpukan[top--];
    }

    public char peek() {
        return tumpukan[top];
    }

    public boolean isEmpty() {
        return (top==-1);
    }

    public boolean isFull() {
        return (top==maxStack-1);
    }

    public void cetak() {
        int i = top;
        while (i>=0) {
            System.out.print(tumpukan[i]);
            System.out.print(" ");
            i--;
        }
        System.out.println(" ");
    }
    
    public static String balikKata(String str) {
        char[] charArr = str.toCharArray();
        int size = charArr.length;
        Latihan01 stack = new Latihan01(size);

        int i;
        for (i = 0; i < size; ++i) {
            stack.push(charArr[i]);
        }

        for (i = 0; i < size; ++i) {
            charArr[i] = stack.pop();
        }

        return String.valueOf(charArr);
    }
}

class BalikKata {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kalimat;
        // == -> => ===
        System.out.print("Masukkan kalimat: ");
        kalimat = in.nextLine();
        in.close();
        String kataBalik = Latihan01.balikKata(kalimat);
        
        System.out.println("==========================================");
        System.out.println("Kalimat dibalik, jadi: ");
        System.out.println(kataBalik);
        System.out.println("==========================================");
        System.out.println("Dibalik lagi, jadi");
        String balikLagi = Latihan01.balikKata(kataBalik);
        System.out.println(balikLagi);
        System.out.println("==========================================");
    }
}