package strukturUrut;

/**
 *
 * @author ashoka
 * Created time 6:25:02 PM 
 * Date Sep 28, 2018
 * 
 * buat program untuk menghitung sisi miring segitiga siku-siku
 * 
 */
public class Segitiga {
    public static void main(String[] args) {
        double sisiA, sisiB, sisiC;
        sisiA = 6;
        sisiB = 8;
        
        sisiC = Math.sqrt((Math.pow(sisiA, 2) + Math.pow(sisiB, 2)));
        
        System.out.println("Sisi A = "+sisiA);
        System.out.println("Sisi A^2 = "+ Math.pow(sisiA, 2));
        System.out.println("Sisi B = "+sisiB);
        System.out.println("Sisi B^2 = "+ Math.pow(sisiB, 2));
        System.out.println("SisiA^2 + SisiB^2 = "+ (Math.pow(sisiA, 2) + Math.pow(sisiB, 2)));
        System.out.println("Sisi C = "+sisiC);
    }
}
