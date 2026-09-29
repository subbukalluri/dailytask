/**
 * Array Practice 3: Count how many times each value appears in an array.
 */
public class FrequencyCount {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 4, 7, 2, 4, 9, 7};
        boolean[] counted = new boolean[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (counted[i]) {
                continue; // this value was already counted
            }

            int count = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    counted[j] = true;
                }
            }
            System.out.println(numbers[i] + " appears " + count + " time(s)");
        }
    }
}
