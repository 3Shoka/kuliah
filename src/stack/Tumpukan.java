package stack;

class Tumpukan {

    private int maxStack;
    private long tumpukan[];
    private int top;

    public Tumpukan (int s) {
        maxStack = s;
        tumpukan = new long[maxStack];
        top = -1;
    }

    public void push(long j) {
        tumpukan[++top]=j;
    }

    public long pop() {
        return tumpukan[top--];
    }

    public long peek() {
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
}

class ApliStack {

    public static void main(String[] args) {
        Tumpukan stack = new Tumpukan(10);
        stack.push(40);
        stack.cetak();
        stack.push(50);
        stack.cetak();
        stack.push(60);
        stack.cetak();
        stack.push(70);
        stack.cetak();
        System.out.println();
        System.out.println("Hasil Stack");
        while (!stack.isEmpty()) {
            long nilai = stack.pop();
            System.out.print(nilai);
            System.out.print(" ");
        }
    }
}