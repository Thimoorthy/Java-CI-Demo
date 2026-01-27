public class CalculatorTest {

    public static void main(String[] args) {

        int result = Calculator.add(2, 3);

        if (result == 5) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
            System.exit(1); // important for Jenkins
        }

    }
}
