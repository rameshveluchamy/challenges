package algorithm;

import java.util.Arrays;

public class BubbleSort {

    private BubbleSort() {
    }

    public static int[] bubbleSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(a));
        }

        return a;
    }

}
