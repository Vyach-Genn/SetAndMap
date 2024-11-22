import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();

        // Task 1
        List<Integer> numsOdd = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 3, 11, 12, 15, 13));
        service.printOddNumbers((ArrayList<Integer>) numsOdd);

        // Task 2
        List<Integer> numsEven = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 16, 12));
        service.printEvenNumbers((ArrayList<Integer>) numsEven);

        // Task 3
        List<String> words = new ArrayList<>(List.of("Он", "Она", "Они", "Я", "Ты", "Оно",
                                                               "Ты", "Она", "Оно", "Он", "Я", "Они"));
        service.printWords((ArrayList<String>) words);

        // Task 4
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        service.printWordDuplicates((ArrayList<String>) strings);
    }
}