package strukturUrut;

/**
 *
 * @author ashoka
 * Created time 6:45:20 PM 
 * Date Sep 28, 2018
 * 
 * buat program untuk mengkonversi dari yard, kaki, inchi, ke meter
 * dengan ketentuan:
 *      1 inchi = 25.4 mm = 0.0254 m
 *      1 kaki = 30.48 cm = 0.3048 m
 *      1 yard = 0.9144 m
 */
public class KonversiMeter {
    public static void main(String[] args) {
        double inchi, kaki, yard, Imeter, Kmeter, Ymeter;
        
//        inchi = 1;
//        kaki = 1;
//        yard = 1;
        inchi = kaki = yard = 10;

        Imeter = inchi * 0.0254;
        Kmeter = kaki * 0.3048;
        Ymeter = yard * 0.9144;
        
        System.out.println(inchi+" inchi = "+Imeter+" m");
        System.out.println(kaki+" kaki= "+Kmeter+" m");
        System.out.println(yard+" yard = "+Ymeter+" m");
    }
}
