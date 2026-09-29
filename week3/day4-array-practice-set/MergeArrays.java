/**
 * Array Practice 2: Merge two arrays into one.
 */
public class MergeArrays {
    public static void main(String[] args) {
        int[] first = {1, 3, 5, 7};
        int[] second = {2, 4, 6, 8, 10};

        int[] merged = new int[first.length + second.length];

        int index = 0;
        for (int value : first) {
            merged[index++] = value;
        }
        for (int value : second) {
            merged[index++] = value;
        }

        System.out.print("Merged array: ");
        for (int value : merged) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
