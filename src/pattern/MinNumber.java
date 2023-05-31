package pattern;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr = { 12, 20, 19, 90, 82, 78, 65, 21 };

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
