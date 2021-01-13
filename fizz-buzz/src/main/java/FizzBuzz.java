public class FizzBuzz {
    public static String execute(int i) {

        if (i % 3 != 0) {
            return String.valueOf(i);
        }

        return "Fizz";
    }
}
