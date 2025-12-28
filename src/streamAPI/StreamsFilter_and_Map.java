package streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilter_and_Map {

	public static void main(String[] args) {
		List<Integer> input = List.of(1,2,3,4,5,6,7,8,9,10);
		// print even numbers
		List<Integer> outputEvenNumbersList = input.stream().filter(a->a%2==0).collect(Collectors.toList());
		System.out.println(outputEvenNumbersList);
		System.out.println("--------------------------------------------------");
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// print cudbe of the numbers
		System.out.println(numbers);
		List<Integer> output = numbers.stream().map(x -> x * x * x).collect(Collectors.toList());
		System.out.println(output);

	}

}
