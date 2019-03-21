package arrayrefresh;

public class Array01 {

    public static void main(String[] args) {
//        int nilai[] = {20, 10, 50, 40};
        
        int nilai[] = new int[4];
        nilai[1] = 10;
        nilai[3] = 40;
        nilai[0] = 20;
        nilai[2] = 50;
        
//        System.out.println("Nilai Ke-2= "+ nilai[1]);
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai Ke-"+ (i+1) +"= "+ nilai[i]);
        }
    }
}
