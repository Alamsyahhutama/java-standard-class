package programmer.alamsyah.hutama.classess;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int [] numbers = {
                0,1,3,2,4,6,5,7,9,8,10,11
        };

        Arrays.sort(numbers);
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 7));
        System.out.println(Arrays.binarySearch(numbers, 3));

        int [] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        int [] result2 = Arrays.copyOfRange(numbers, 5, 10);
        System.out.println(Arrays.toString(result2));

    }
}
