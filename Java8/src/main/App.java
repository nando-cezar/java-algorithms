package main;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,5,8,7,4,1,6,3,2,1,8,5,7,4);
		
		numbers.forEach(System.out::println);
		System.out.println();
		numbers.stream().distinct().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		System.out.println();
		numbers.stream().distinct().filter(e -> e%2 == 1).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println();
		System.out.println(numbers.stream().skip(3).reduce((acc, n) -> acc += n));
		System.out.println(numbers.stream().skip(3).mapToInt(x -> x).sum());
		System.out.println();
		numbers.forEach(e -> System.out.println(e*2));
		System.out.println();
		System.out.println(numbers.stream().distinct().collect(Collectors.groupingBy(c -> c%2 == 0)).values());
		System.out.println();
		System.out.println(numbers.stream().max(Comparator.naturalOrder()).orElseThrow());
		System.out.println();
		numbers.stream().limit(3).forEach(System.out::println);
		System.out.println();
		System.out.println(numbers.stream().mapToInt(x -> x).average().getAsDouble());
		System.out.println();
		LocalDate now = LocalDate.now();
		numbers.stream().distinct().sorted(Comparator.naturalOrder()).forEach(x -> System.out.println(now.plusDays(x)));

	}

}
