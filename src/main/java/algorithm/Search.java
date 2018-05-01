package algorithm;

public class Search {

    private Search() {
    }

    public static RESULT linearSearch(int[] arr, int val) {
        for (int i : arr) {
            if (i == val) return RESULT.FOUND;

        }
        return RESULT.NOT_FOUND;
    }

    public static RESULT binarySearch(int[] arr, int val) {
        /*if (val < arr[0] || val > arr[arr.length - 1]) {
            return RESULT.NOT_FOUND;
        }*/

        return bSearch(arr, val, 0, arr.length - 1);
    }

    private static RESULT bSearch(int[] arr, int val, int startIndex, int endIndex) {

        if (startIndex == endIndex) {
            if (arr[startIndex] == val) return RESULT.FOUND;
            else return RESULT.NOT_FOUND;
        }

        int midIndex = startIndex + (endIndex - startIndex) / 2;

        if (val == arr[midIndex]) {
            return RESULT.FOUND;
        }

        if (val < arr[midIndex])
            return bSearch(arr, val, startIndex, midIndex - 1);
        else
            return bSearch(arr, val, midIndex + 1, endIndex);

    }

    public enum RESULT {FOUND, NOT_FOUND}

}
