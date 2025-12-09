package com.rays.collection.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {

	public static void main(String[] args) {

		//   Employee objects ki list banayi (name + salary)
		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee("Lucky", 50000));
		employees.add(new Employee("Himanshu", 20000));
		employees.add(new Employee("Dau", 40000));
		employees.add(new Employee("Niraj", 80000));
		employees.add(new Employee("Pradhyman", 30000));

		//   Stream use karke 2nd highest salary find kar rahe hain
		double secondHighestSalary = employees.stream()

				//   Har employee object se sirf salary le rahe hain
				.map(e -> e.getSalary())

				//   Duplicate salaries ko hata rahe hain (just in case)
				.distinct()

				//   Salary ko descending order me sort kar rahe hain (highest to lowest)
				.sorted(Comparator.reverseOrder())

				//   Top (1st) salary skip kar rahe hain, to 2nd highest aa jaye
				.skip(1)

				//   2nd highest salary le rahe hain — agar nahi mili to 0.0 return
				.findFirst()
				.orElse(0.0);

		//   Final result print kar rahe hain
		System.out.println("Second Highest Salary: " + secondHighestSalary);
	}
}
