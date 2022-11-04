package main;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,5,8,7,4,1,6,3,2,1,8,5,7,4);
		
		numbers.forEach(System.out::println);
		System.out.println();
		numbers.stream().distinct().sorted().forEach(System.out::println);
		System.out.println();
		numbers.stream().filter(e -> e%2 != 0).distinct().sorted().forEach(System.out::println);
		System.out.println();
		System.out.println(numbers.stream().reduce((acc, n) -> acc += n));
		System.out.println();
		numbers.forEach(e -> System.out.println(e*2));
		System.out.println();
		numbers.stream().filter(e -> e%2 != 0).distinct();
		System.out.println(numbers);
		System.out.println("--");
		numbers.stream().filter(e -> e%2 == 0).sorted();
		System.out.println(numbers);
		numbers.sort(Comparator.comparing(e -> e));
		System.out.println(numbers);
		System.out.println(numbers.get(numbers.size()-1));

	}

}
