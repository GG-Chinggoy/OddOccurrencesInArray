import java.util.HashMap;
import java.util.Map;

/**
 * Find value that occurs in odd number of elements.
 */
public class Main {
    public static void main(String[] args) {
        int[] intArray = {9,3,9,3,9,7,9};
        int[] intArray1 = {9,3,9,3,9,7,9,9};

        System.out.println("Unpaired Value is " + oddOccurencesInArray(intArray));
        allUnPairedInArray(intArray1);
    }

    private static int oddOccurencesInArray(int[] intArray) {
        int unpairedValue = 0;

        for (int i : intArray) {
            unpairedValue ^= i;
        }

        return unpairedValue;
    }

    private static void allUnPairedInArray(int[] intArray) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : intArray) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Integer i : map.keySet()) {
            if(map.get(i) % 2 != 0) {
                System.out.println("Unpaired no : " + i);
            }
        }
    }
}