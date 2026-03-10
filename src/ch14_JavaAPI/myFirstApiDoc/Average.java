package ch14_JavaAPI.myFirstApiDoc;

/*
Average sınıfının API dokümantasyonu JavaDoc ile yapın.
 */

/**
 * <p>A utility class that calculates the arithmetic average of number arrays.
 * Provides overloaded {@code calculateAverage} methods for both
 * {@code int} and {@code double} arrays.</p>
 *
 * @author  isbilirali
 * @version 1.0
 * @since   2026
 */
public class Average {

    /**
     * <p>Calculates the arithmetic average of an {@code int} array.
     * Sums all elements and divides by the count. The result is always
     * returned as {@code double}.</p>
     *
     * @param numbers The {@code int} array whose average is to be calculated.
     * @return The arithmetic average of the array ({@code double}).
     * @throws ArithmeticException Division by zero when array is empty.
     */
    public double calculateAverage(int[] numbers) {
        double sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum / numbers.length;
    }

    /**
     * <p>Calculates the arithmetic average of a {@code double} array.
     * This overloaded version is used for floating-point number arrays
     * and preserves floating-point precision throughout the calculation.</p>
     *
     * @param numbers The {@code double} array whose average is to be calculated.
     * @return The arithmetic average of the array ({@code double}).
     */
    public double calculateAverage(double[] numbers) {
        double sum = 0;
        for (double n : numbers) {
            sum += n;
        }
        return sum / numbers.length;
    }
}
