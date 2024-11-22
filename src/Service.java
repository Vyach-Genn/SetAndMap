import java.util.*;

public class Service {

    public void printOddNumbers(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public void printEvenNumbers(ArrayList<Integer> numbers) {
        Set<Integer> evenNumbers = new TreeSet<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        for (Integer eveNnumber : evenNumbers) {
            System.out.print(eveNnumber + " ");
        }
        System.out.println();
    }

    public void printWords(ArrayList<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    public void printWordDuplicates(ArrayList<String> words) {
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String word : words) {
            wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
        }
        for (int count : wordsCount.values()) {
            System.out.println(" Количество слов: " + count);
        }
    }
}
