package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfArrayUsingStream {
	public static void main(String args[]) {

		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		Integer sum = numbers.stream().reduce(0, Integer::sum);
		List<Integer> list1 = numbers.stream().map(x -> x + sum).collect(Collectors.toList());

		System.out.println(list1);
	}
}
