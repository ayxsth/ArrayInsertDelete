package arrayinsertdelete;

import java.util.Arrays;

/**
 *
 * @author ayxst
 */
public class MyArray {

    static int[] numArray = new int[]{1, 2, 3, 4, 5};
    static int[] copiedNumArray;

    static void insert(int newNum, int index) {
        copiedNumArray = Arrays.copyOf(numArray, numArray.length + 1);
        if (index <= copiedNumArray.length-1) {
            for (int i = copiedNumArray.length - 1; i > index - 1; i--) {
                copiedNumArray[i] = copiedNumArray[i - 1];
            }
            copiedNumArray[index - 1] = newNum;
            numArray = Arrays.copyOf(copiedNumArray, copiedNumArray.length);
        } else {
            throw new ArrayIndexOutOfBoundsException("No such index!");
        }

    }

    static void delete(int index) {
        copiedNumArray = Arrays.copyOf(numArray, numArray.length);
        if (index <= copiedNumArray.length-1) {
            for (int i = index - 1; i < copiedNumArray.length - 1; i++) {
                copiedNumArray[i] = copiedNumArray[i + 1];
            }
            numArray = Arrays.copyOf(copiedNumArray, copiedNumArray.length - 1);
        } else {
            throw new ArrayIndexOutOfBoundsException("No such index!");

        }
    }

    static void print() {
        System.out.println("Array items: ");
        for (int arr : numArray) {
            System.out.print(arr + "\t");
        }
        System.out.println();
    }
}
