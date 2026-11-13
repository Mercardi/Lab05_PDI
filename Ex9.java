package lab05;
import java.util.Arrays;
import java.util.List;
public class Ex9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, -1, 3, -8, 20, -50);
        System.out.println("a) Cube of each number:");
        numbers.stream()
               .map(n -> n * n * n)
               .forEach(System.out::println);
        System.out.println("\nb) Positive numbers:");
        numbers.stream()
               .filter(n -> n > 0)
               .forEach(System.out::println);
        System.out.println("\nc) Sorted data:");
        numbers.stream()
               .sorted()
               .forEach(System.out::println);
        System.out.println("\nOriginal list is unchanged: " + numbers);
    }
}
