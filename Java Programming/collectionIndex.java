import java.util.*;

public class collectionIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.print("Enter the size of the list: ");
        int size = input.nextInt();
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers.add(input.nextInt());
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Number Frequency:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
