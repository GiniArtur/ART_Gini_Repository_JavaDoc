
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        System.out.println(Calculator.OPERATIONS_COUNT);
        System.out.println(calculator.divide(5,10));

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}