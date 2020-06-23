package exercises.playground;

public class FizzBuzz {

    public static void main(String args[]) {
        int counter = 1;

        while (true) {
            if (counter % 2 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println("Buzz");
            }
            if (counter > 100) {
                break;
            }
            counter++;
        }
    }
}
