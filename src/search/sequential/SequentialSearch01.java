package search.sequential;

/**
 * SequentialSearch01
 */
public class SequentialSearch01 {

    public static void main(String[] args) {
        int data[] = {8, 10, 6, -2, 11, 7, 1, 10};
        int cari = 6;
        boolean flag = false;
    
        for (int i = 0; i < data.length; i++) {
            if(data[i]==cari){
                flag = true;
            } 
        }
    
        if(flag) {
            System.out.println("DATA ADA");
        } else {
            System.out.println("DATA TIDAK ADA");
        }
    }
}