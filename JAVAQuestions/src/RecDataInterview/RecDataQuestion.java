package RecDataInterview;

import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class RecDataQuestion {
}

/*
 * Given two sorted arrays, return a new array containing only the common
 * elements between them. Example 1: Input : num1 = [1,2,4,5,6], num2 =
 * [2,3,5,7] Output : [2,5] Example 2: Input : num1 = [1,1,2,3], num2 = [1,3,5]
 * Output : [1,3]
 */
class CommonElements {
	public static List<Integer> findCommon(int[] num1, int[] num2) {
		int i = 0, j = 0;
		List<Integer> result = new ArrayList<>();
		while (i < num1.length && j < num2.length) {
			if (num1[i] == num2[j]) {
				result.add(num1[i]);
				i++;
				j++;
			} else if (num1[i] < num2[j]) {
				i++;
			} else {
				j++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] num1 = { 1, 2, 4, 5, 6 };
		int[] num2 = { 2, 3, 5, 7 };

		System.out.println(findCommon(num1, num2));
	}
}

// Write a program to find the third highest number in a list using Java 8
// Stream.
class ThirdHighestNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 40, 20, 50, 30, 50);

		Integer thirdHighest = list.stream().distinct() // remove duplicates
				.sorted((a, b) -> b - a) // sort in descending order
				.skip(2) // skip first two highest
				.findFirst() // get the third one
				.orElse(null); // handle empty cases

		System.out.println("Third Highest Number: " + thirdHighest);
	}
}

/*
 * Given an integer array, move all zero to the end while maintaining the
 * relative order of non-zero elements. Example : Input : [0,1,0,3,12] Output :
 * [1,3,12,0,0]
 */
class MoveAllZerosInEnd {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 3, 12 };
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[index] = arr[i];
				index++;
			}
		}
		while (index < arr.length) {
			arr[index] = 0;
			index++;
		}
		System.out.println(Arrays.toString(arr));
	}
}

/*
 * Given a string, find the first non-repeating character. Return its index, or
 * -1 if none exists. Example : Input : "swiss" Output : 1 Explanation : The
 * first non-repeating character is 'w'
 */
class NonRepeatingCharacter {
	public static int findNonRepeatingIndex(String s) {
		int[] freq = new int[256]; // Frequency array for all ASCII character
		for (char c : s.toCharArray()) {
			freq[c]++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (freq[s.charAt(i)] == 1) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String input = "swiss";
		int index = findNonRepeatingIndex(input);
		System.out.println("Index : " + index);
	}
}

/*
 * Given an array of Integers, remove all duplicates and return the array sorted
 * in ascending order using Java 8 Streams. Example : Input : [4,3,2,4,1,2,3]
 * Output : [1,2,3,4]
 */
class RemoveAllDuplicate {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 3, 2, 4, 1, 2, 3);
		List<Integer> result = list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(result);
	}
}

/*
 * Write a Java to check if two strings are rotations of each other. Example :
 * Input : str1 = "ABCD", str2 = "CDAB" Output : true
 */
class Rotation {
	public static boolean areRotations(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		String combined = str1 + str1;
		return combined.contains(str2);
	}

	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "CDAB";
		boolean result = areRotations(str1, str2);
		System.out.println("Rotation : " + result);
	}
}

/*
 * Write a Java Program to reverse the order of words in a given sentence
 * without reversing the characters of each word. Example : Input :
 * "Java is fun" Output : "fun is Java"
 */
class SentenceWithoutReversingTheCharacter {
	public static void main(String[] args) {
		String sentence = "Java is fun";
		String[] words = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]).append(" ");
		}
		System.out.println(sb.toString().trim());
	}
}

/*
 * Write a Java Program to print the following pattern: 1 121 12321 1234321
 * 123454321 1234321 12321 121 1
 */
class Pattern {
	public static void main(String[] args) {
		int n = 5; // middle row for the peak

		// Upper half including middle
		for (int i = 1; i <= n; i++) {
			// print spaces
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			// Print increasing numbers
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			// Print decreasing numbers
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		// Lower half
		for (int i = n - 1; i >= 1; i--) {
			// print spaces
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			// print increasing numbers
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			// print decreasing numbers
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}

/*
 * Write a program to detect a loop in a linked list. If there is a cycle,
 * return true; otherwise, return false.
 */
class DetectALoopInALinkedList {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static boolean hasLoop(Node head) {
		if (head == null)
			return false;
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return true;
			}
		}
		return false;
	}

	public static void main(String args[]) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);

		head.next.next.next.next = head.next;
		System.out.println("Detect a Loop in a LinkedList : " + hasLoop(head));
	}
}

/*
 * You are given a list of Student objects with fields: id, name, department,
 * and marks. Using Java 8 Streams, answers the following: 1. Find the students
 * with the Highest marks per Department. 2. Calculate the average marks per
 * department.
 */
class Students {
	private int id;
	private String name;
	private String department;
	private double marks;

	Students(int id, String name, String department, double marks) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getMarks() {
		return marks;
	}

	public String toString() {
		return name + "( " + marks + " )";
	}

	public static void main(String[] args) {
		List<Students> list = Arrays.asList(new Students(1, "Niraj", "CS", 80), new Students(2, "Ram", "BBA", 90),
				new Students(3, "Priyanshu", "IT", 88), new Students(4, "Shyam", "CS", 79),
				new Students(4, "Ravi", "Mechanical", 80));

		// 1. Highest marks per department
		Map<String, Optional<Students>> highestMarksPerDept = list.stream().collect(Collectors
				.groupingBy(Students::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Students::getMarks))));

		System.out.println("Highest marks per department:");
		highestMarksPerDept.forEach((dept, student) -> System.out.println(dept + " -> " + student.get()));

		// 2. Average marks per department
		Map<String, Double> avgMarksPerDept = list.stream().collect(
				Collectors.groupingBy(Students::getDepartment, Collectors.averagingDouble(Students::getMarks)));

		System.out.println("\nAverage marks per department:");
		avgMarksPerDept.forEach((dept, avg) -> System.out.println(dept + " -> " + avg));
	}
}

/*
 * Remove duplicate character from String?
 */
class RemoveDuplicateFromString {
	public static void main(String[] args) {
		String str = "programming";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (result.indexOf(ch) == -1) {
				result += ch;
			}
		}

		System.out.println(result);
	}
}

/*
 * Remove duplicate character from String Using Java 8 Streams?
 */
class RemoveDuplicateFromStringUsingStream {
	public static void main(String[] args) {
		String str = "programming";

		String result = str.chars().mapToObj(c -> (char) c).distinct().map(String::valueOf)
				.collect(java.util.stream.Collectors.joining());

		System.out.println(result);
	}
}

/*
 * Binary String Problem : print all binary string of size n without consecutive
 * ones
 */
class BinaryStrings {

	public static void printBinary(int n, int last, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		// Always allowed to add 0
		printBinary(n - 1, 0, ans + "0");

		// Add 1 only if last was not 1
		if (last == 0) {
			printBinary(n - 1, 1, ans + "1");
		}
	}

	public static void main(String[] args) {
		int n = 3; // length of binary string
		printBinary(n, 0, "");
	}
}

/*
 * CONTAINER WITH MOST WATER(Most Important Question): For Given n lines on
 * x-axis, use 2 lines to form a container such that it hold maximum water.
 * height = [1,8,6,2,5,4,8,3,7]
 */
class ContainerWithMostWaterUsingArrayList {
	// Simple Container With Most Water Using ArrayList
	public static int storeWater(ArrayList<Integer> height) {
		int maxWater = 0;
		// Brute force --> time Complexity is (O(n^2))
		for (int i = 0; i < height.size(); i++) {
			for (int j = i + 1; j < height.size(); j++) {
				int ht = Math.min(height.get(i), height.get(j));
				int width = j - 1;
				int currWater = ht * width;
				maxWater = Math.max(maxWater, currWater);
			}
		}
		return maxWater;
	}

	// 2 Pointer Approach
	public static int storeWaterTwoPointer(ArrayList<Integer> height) {
		int maxWater = 0;
		int lp = 0;
		int rp = height.size() - 1;

		while (lp < rp) {
			// Calculate water area
			int ht = Math.min(height.get(lp), height.get(rp));
			int width = rp - lp;
			int currWater = ht * width;
			maxWater = Math.max(maxWater, currWater);

			// update ptr
			if (height.get(lp) < height.get(rp)) {
				lp++;
			} else {
				rp--;
			}
		}
		return maxWater;
	}

	public static void main(String[] args) {
		ArrayList<Integer> height = new ArrayList<>();
		// height = [1,8,6,2,5,4,8,3,7,8]
		height.add(1);
		height.add(8);
		height.add(6);
		height.add(2);
		height.add(5);
		height.add(4);
		height.add(8);
		height.add(3);
		height.add(7);
		height.add(8);

		System.out.println("Container with most water is : " + storeWater(height));
		System.out.println("Container with most water Using 2 pointer Approach : " + storeWaterTwoPointer(height));
	}
}

/*
 * Multi-dimensional ArrayList
 * list1 = 1 2 3 4 5
 * list2 = 2 4 6 8 10
 * list3 = 3 6 9 12 15
 */
class MultiDimensionalArrayList {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			list1.add(i * 1);// 1 2 3 4 5
			list2.add(i * 2);// 2 4 6 8 10
			list3.add(i * 3);// 3 6 9 12 15
		}
		mainList.add(list1);
		mainList.add(list2);
		mainList.add(list3);

		System.out.println("MainList is : " + mainList);

		// Nested Loop
		for (int i = 0; i < mainList.size(); i++) {
			ArrayList<Integer> currList = mainList.get(i);
			for (int j = 0; j < currList.size(); j++) {
				System.out.print(currList.get(j) + " ");
			}
			System.out.println();
		}
	}
}

/*
 * Pair Sum-1
 * Find if any pair in sorted ArrayList has a target sum.
 * list = [1,2,3,4,5,6], target=5
 */
class PairSum1 {
	public static boolean printPairSum1(ArrayList<Integer> list, int target) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) + list.get(j) == target) {
					return true;
				}
			}
		}
		return false;
	}

	// 2 Pointer Approach
	public static boolean printPairSum1Using2Pointer(ArrayList<Integer> list, int numb, int target) {
		int lp = 0;
		int rp = list.size() - 1;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if ((lp - numb) + (rp + numb) == target) {
					return true;
				} else if ((lp - numb) + (rp - numb) < target) {
					lp++;
				} else {
					rp--;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		int target = 5;// true
		// target = 50;//false
		System.out.println("Pair Sum - 1 is : " + printPairSum1(list, target));
		System.out.println("printPairSum1Using2Pointer : " + printPairSum1(list, target));
	}
}

/*
 * Write a query to find employees whose salary is greater than the average
 * salary of their department. Answer : SELECT e.* FROM Employees e WHERE
 * e.salary > ( SELECT AVG(salary) FROM Employees WHERE department =
 * e.department );
 * 
 * ✅ Explanation in Simple Words
 * 
 * For each employee, we check what is the average salary in their department.
 * 
 * If the employee’s salary is greater than that department's avg salary, we
 * return that employee.
 * 
 * ✅ Example Table id name dept salary 1 Ram IT 50000 2 Raju IT 70000 3 Neha HR
 * 40000 4 Ravi HR 60000
 * 
 * Average salary:
 * 
 * IT dept avg = (50000 + 70000) / 2 = 60000
 * 
 * HR dept avg = (40000 + 60000) / 2 = 50000
 * 
 * ✅ Output id name dept salary 2 Raju IT 70000 4 Ravi HR 60000
 * 
 * These employees earn more than the avg salary of their respective department.
 */

/*
 * Write a query to find department that have more than 3 employees and the
 * total salary of those department. SELECT department, COUNT(*) AS
 * employee_count, SUM(salary) AS total_salary FROM Employees GROUP BY
 * department HAVING COUNT(*) > 3;
 * 
 * 
 * Meaning in simple words
 * 
 * You are doing two things:
 * 
 * Group employees by department
 * 
 * Count employees in each department
 * 
 * Only show departments where employee count > 3
 * 
 * Also show the total salary for that department
 * 
 * Output example department employee_count total_salary IT 5 2,50,000 Finance 4
 * 3,20,000
 * 
 * This tells us which departments have more than 3 employees, and how much
 * salary those departments pay in total.
 * 
 */
