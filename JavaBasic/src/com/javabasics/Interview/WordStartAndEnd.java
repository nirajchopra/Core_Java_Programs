package Interview;

import java.util.Arrays;
import java.util.List;

public class WordStartAndEnd {
	public static void main(String args[]) {

		List<String> l1 = Arrays.asList("abc", "mnm", "xlx", "xyz", "fkf", "qwe");

		l1.stream().filter(x -> x.length() > 0 && x.endsWith(String.valueOf(x.charAt(0)))).forEach(System.out::println);
	}
}
