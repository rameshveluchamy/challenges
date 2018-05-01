package algorithm;

public class Recursion {

    private Recursion() {
    }

    public static int calculateSuperDigit(int i) {
        return superAdd(String.valueOf(i));
    }

    private static int superAdd(String s) {

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum + Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        if (String.valueOf(sum).length() > 1) {
            superAdd(String.valueOf(sum));
        }

        System.out.println(sum);
        return sum;
    }
}
