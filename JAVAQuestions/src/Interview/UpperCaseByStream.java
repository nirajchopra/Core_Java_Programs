package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseByStream {
	public static void main(String args[]) {
		List<String> countries = Arrays.asList("India", "USA", "Canada", "Japan");

		String str = countries.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(str);
	}
}
