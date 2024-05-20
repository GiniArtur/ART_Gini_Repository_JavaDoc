/**
 * Calculates simple operations
 * @author Giniyatullin Artur
 */
public class Calculator {
    /**
     * Total count of operations, that this Calculator can perform
     */
    public static final int OPERATIONS_COUNT = 4;

    /**
     * Performs division one number by another
     *
     * @return Division result
     * @throws ArithmeticException if an attempt is made to divide by zero
     * @param a First value
     * @param b Second value
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is impossible");

        }
        return a / b;

    }
}