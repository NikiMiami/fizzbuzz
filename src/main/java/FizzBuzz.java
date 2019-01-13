//https://rosettacode.org/wiki/FizzBuzz#Java

public class FizzBuzz {
    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 100; i++) {
            System.out.println(fizzbuzz(i));
        }
    }

    static String fizzbuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return ("Fizz");
        } else if (i % 5 == 0) {
            return ("Buzz");
        } else {
            return Integer.toString(i);
        }
    }
}