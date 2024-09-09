public class Multiples {
    public static void main(String[] args) {
        int counter_so_far = 0;
        int i = 1;
        while (i < 1000) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 || divisibleBy5) {

                counter_so_far = counter_so_far + 1;

            }
            i = i + 1;
        }
    System.out.println(counter_so_far);
    }
}
