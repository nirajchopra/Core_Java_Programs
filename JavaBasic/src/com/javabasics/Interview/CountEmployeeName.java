package Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*This code is counting how many employees have each name using two methods:
1. Java Streams
2. Normal loop (manual counting)
*/
public class CountEmployeeName {
    public static void main(String args[]){
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(3, "Niraj", 23, 35000.0));
        empList.add(new Employee(4, "Niraj", 22, 34000.0));
        empList.add(new Employee(1, "Ram", 23, 30000.0));
        empList.add(new Employee(5, "Ram", 20, 20000.0));
        empList.add(new Employee(2, "Priyanshu", 22, 25000.0));

        // Count Employee names using streams
        Map<String, Long> nameCount = empList.stream()
            .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        System.out.println(nameCount);

        // Count using loops
        Map<String, Integer> map = new HashMap<>();
        for(Employee e : empList){
            map.put(e.getName(), map.getOrDefault(e.getName(), 0) + 1);
        }
        System.out.println(map);
    }
}
