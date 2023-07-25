import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] arr = IntStream.rangeClosed(1, n).toArray();
        int[] oddNumbers = IntStream.of(arr)
                .filter(i -> i % 2 != 0)
                .toArray();
        System.out.println(Arrays.toString(oddNumbers));
    }
}
