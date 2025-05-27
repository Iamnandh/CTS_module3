import java.util.*;

class LambdaSort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana", "Apple", "Mango");
        Collections.sort(list, (a, b) -> a.compareToIgnoreCase(b));
        System.out.println("Sorted list: " + list);
    }
}