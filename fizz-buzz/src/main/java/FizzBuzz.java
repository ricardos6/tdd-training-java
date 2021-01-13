public class FizzBuzz {
    public static String execute(int i) {

        if (isFizzBuzz(i)) {
            return "FizzBuzz";
        }

        if (isFizz(i)) {
            return "Fizz";
        }

        if (isBuzz(i)) {
            return "Buzz";
        }

        return String.valueOf(i);
    }

    private static boolean isFizzBuzz(int i) {
        return i % 15 == 0;
    }

    private static boolean isFizz(int i) {
        return i % 3 == 0;
    }

    private static boolean isBuzz(int i) {
        return i % 5 == 0;
    }
}
