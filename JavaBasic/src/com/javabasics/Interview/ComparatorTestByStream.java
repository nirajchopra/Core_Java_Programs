package Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//how to sort a list of Employee objects using Java Streams and Comparator chaining.
public class ComparatorTestByStream {
	public static void main(String args[]) {

		Employee e1 = new Employee(22, "ram", 26, 2500.00);
		Employee e2 = new Employee(13, "ram", 27, 2800.00);
		Employee e3 = new Employee(14, "ram", 28, 2900.00);
		Employee e4 = new Employee(15, "ram", 29, 2900.00);

		List<Employee> list = Arrays.asList(e1, e2, e3, e4);

		Comparator<Employee> byName = (x, y) -> x.getName().compareTo(y.getName());
		Comparator<Employee> byId = (r, t) -> Integer.compare(r.getId(), t.getId());
		list.stream().sorted(byName.thenComparing(byId)).forEach(System.out::println);

	}
}
