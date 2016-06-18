package utils;

/**
 * Created by gorobec on 18.06.16.
 */
public class ArrayUtils {
    public static int[] createArray(int size){
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * 1_000_000_000);
        }
        return array;
    }
}
