/**
 * This class will test the BitArray class.
 *
 * @author Kerrie Low
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        BitArray array = new BitArray();
/*
        // turn on a few bits
        array.set(1, true);
        array.set(2, true);
        array.set(4, true);
        array.set(8, true);
        array.set(16, true);

        // verify the bits we turned on as well as bits we never turned on
        System.out.println("1: " + array.get(1));   // true
        System.out.println("2: " + array.get(2));   // true
        System.out.println("4: " + array.get(4));   // true
        System.out.println("8: " + array.get(8));   // true
        System.out.println("16: " + array.get(16)); // true
        System.out.println("32: " + array.get(32)); // false
        System.out.println();

        // turn off a few bits
        array.set(2, false);
        array.set(8, false);

        // verify bits are off
        System.out.println("2: " + array.get(2));   // false
        System.out.println("8: " + array.get(8));   // false
*/

        for (int i = 1; i < 51; i++) {
            for (int j = 0; j < 50; j = j+i) {
                array.set(j, !array.get(j));
            }
        }

        // CLOSED commented out for brevity
        for (int i = 1; i < 51; i++) {
            if(array.get(i)){
                System.out.println(i + ": open");
            }
//            else {
//                System.out.println(i + ": closed");
//            }
        }
    }
}
