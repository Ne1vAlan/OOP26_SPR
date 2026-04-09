package Lab_3.Problem5;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {

        Chocolate[] chocolates = {
            new Chocolate("Twix", 50),
            new Chocolate("Snickers", 70),
            new Chocolate("Mars", 60)
        };

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(chocolates));

        // Bubble sort
        Sort.bubbleSort(chocolates);

        System.out.println("After Bubble Sort:");
        System.out.println(Arrays.toString(chocolates));

        // Merge sort
        Sort.mergeSort(chocolates);

        System.out.println("After Merge Sort:");
        System.out.println(Arrays.toString(chocolates));
    }
}