package Before_data_Structures;

import java.util.Arrays;
public class QuizOneAboutException {
        public static void main(String[] args) {
            // Example with Integer arrays
            Integer[] intArray1 = {1, 2, 3, 4, 5};
            Integer[] intArray2 = {1, 2, 3, 4, 5};
            Integer[] intArray3 = {1, 2, 3, 4, 6};

            try {
                System.out.println("Before_data_Structures.Arrays are equal: " + compareArrays(intArray1, intArray2));
                // Uncomment the line below to see the exception being thrown
                // System.out.println("Before_data_Structures.Arrays are equal: " + compareArrays(intArray1, intArray3));
            } catch (IllegalArgumentException e) {
                System.out.println("Exception: " + e.getMessage());
            }

            // Example with String arrays
            String[] strArray1 = {"apple", "banana", "orange"};
            String[] strArray2 = {"apple", "banana", "orange"};
            String[] strArray3 = {"apple", "banana", "grape"};

            try {
                System.out.println("Before_data_Structures.Arrays are equal: " + compareArrays(strArray1, strArray3));

            } catch (IllegalArgumentException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.getClass() != array2.getClass()) {
            throw new IllegalArgumentException("Before_data_Structures.Arrays are of different types");
        }

        return Arrays.equals(array1, array2);
    }
    }

