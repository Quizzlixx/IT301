/**
 * This class will store a 64 bit long to represent 50 lockers being opened and closed as 1 - 50 students enter the
 * building. Each bit represents a locker that will be set or unset.
 *
 * @author Kerrie Low
 * @version 1.0
 */
public class BitArray {

    private long data = 0b0000000000000000000000000000000000000000000000000000000000000000L;  // index 0 - 50

    /**
     * This method returns true if the bit at the given index is 1, otherwise if the bit is 0 it returns false.
     *
     * @param index integer in the range 1 - 50
     * @return true if bit is 1, else false
     */
    public boolean get(int index) {
        if (index > 0 && index < 51) {
            long mask = getMask(index);

            long result = mask & data;

            return result != 0;
        }

        return false;
    }

    /**
     * Assigns the bit at the given index 1 if the value is true, 0 if the value is false.
     *
     * @param index integer in the range 0 - 50
     * @param value boolean, true to set, false to unset
     */
    public void set(int index, boolean value) {
        long mask = getMask(index);

        if (value) { // set to 1
            data = data | mask;
        } else {
            mask = ~mask;
            data = data & mask;
        }
    }

    private long getMask(int index) {
        // create a mask
        long mask = 0b0000000000000000000000000000000000000000000000000000000000000010L;

        // shift the mask left index times
        mask = mask << index;

        return mask;
    }
}
