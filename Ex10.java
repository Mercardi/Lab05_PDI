package lab05;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Ex10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
            String line = br.readLine();                 
            while ((line = br.readLine()) != null) {
                if (!line.isBlank()) {
                    names.add(line.split(",")[0].trim()); 
                }
            }
        } catch (IOException e) {
            System.out.println("Could not read file: " + e.getMessage());
            return;
        }
        System.out.println("Names in A-Z order:");
        names.stream()
             .sorted(String.CASE_INSENSITIVE_ORDER)       
             .forEach(System.out::println);
    }
}
