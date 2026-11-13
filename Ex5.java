package lab05;
import java.math.BigInteger;
public class Ex5 {
    static int factorialLoopInt(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }
    static int factorialRecursiveInt(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursiveInt(n - 1);
    }
    static long factorialLoopLong(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }
    static BigInteger factorialBig(int n) {
        if (n <= 1) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(factorialBig(n - 1));
    }
    public static void main(String[] args) {
        int[] inputs = {3, 6, 10, 50};
        System.out.printf("%-4s | %-12s | %-12s | %-22s | %s%n",
                "n", "loop (int)", "recur (int)", "loop (long)", "exact (BigInteger)");
        System.out.println("-".repeat(110));
        for (int n : inputs) {
            System.out.printf("%-4d | %-12d | %-12d | %-22d | %s%n",
                    n,
                    factorialLoopInt(n),
                    factorialRecursiveInt(n),
                    factorialLoopLong(n),
                    factorialBig(n));
        }
    }
}
