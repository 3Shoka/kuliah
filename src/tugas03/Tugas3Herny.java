package tugas03;

/**
 *
 * @author ashoka
 * Created time 12:57:15 PM 
 * Date Nov 7, 2018
 */
public class Tugas3Herny {
//    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            } else if (i == 0) {
//                System.out.print("0 ");
//            } else {
//                System.out.print("0 ");
//            }
//        }
//    }
    
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else if (i == 0 || i % 2 == 1) {
                System.out.print("0 ");
            }
        }
    }
}
