package Interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class IODuplicate {
	public static void main(String[] args) {
		//find the duplicate elements in given integers list in java using stream functions.
		
		List<Integer> list = Arrays.asList(10,28,14,10,14,25,76,19,28);
		Set<Integer> set = new HashSet<Integer>();
		list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()).forEach(x -> System.out.println(x));
	}
}
