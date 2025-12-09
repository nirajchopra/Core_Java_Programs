package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IdentifyByStream {
	public static void main(String args[]){
		String str = "welcome to code decode and code decode welcome to";
		List<String> list = Arrays.asList(str.split(" "));
		
		list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Function<String, String> fn = Function.identity();
		System.out.println(fn.apply("hi"));
	}
}
