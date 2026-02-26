```markdown
# Java DSA Complete Notes

## Table of Contents
- [Introduction to Programming Language](#introduction-to-programming-language)
- [Types of Programming Languages](#types-of-programming-languages)
- [Java Introduction](#java-introduction)
- [Java Basics](#java-basics)
- [Control Flow](#control-flow)
- [Functions & Methods](#functions--methods)
- [Arrays & ArrayList](#arrays--arraylist)
- [Searching Algorithms](#searching-algorithms)
- [Sorting Algorithms](#sorting-algorithms)
- [Strings & StringBuilder](#strings--stringbuilder)
- [Pattern Questions](#pattern-questions)
- [Recursion Fundamentals](#recursion-fundamentals)
- [Advanced Recursion Topics](#advanced-recursion-topics)
- [Merge Sort & Quick Sort](#merge-sort--quick-sort)
- [Solving Linear Recurrences](#solving-linear-recurrences)

---

## Introduction to Programming Language

### How Computers Work
- Computers work at a very minute level
- Computer only understands 0's and 1's (Binary language)

### What is Programming Language?
```
Human (Speak)                    Human (Write Code)          Computer
↓                                ↓                           ↓
Language                         Programming Language        (Converted into 0's and 1's)
(Hindi / English / Spanish)      (Java / Python)             
↓                                ↓                           
Human (Listen)                   Computer
```

---

## Types of Programming Languages

### 1. Procedural Programming
- Series of well-structured steps and procedures to compose a program
- Contains a systematic order of statements, functions and commands to complete a task
- **Focus is on how to perform the task**

### 2. Functional Programming
- Writing a program only in pure functions
- Never modify variables, only create new ones as output
- Used when we have to perform lots of different operations on the same set of data
- Used in Machine Learning

### 3. Object Oriented Programming (OOP)
- Revolves around objects
- **Code + Data = Object**
- Developed to make it easier to develop, debug, reuse and maintain

```
Class
↓
Object
(Code + Data)
```

### Static vs Dynamic Language

| Feature | Static Language | Dynamic Language |
|---------|----------------|------------------|
| Type Checking | Compile time | Runtime |
| Error Detection | Compile time | Runtime |
| Datatype Declaration | Required | Not required |
| Example | `int a = 10;` | `a = 10` |
| Control | More control | Less control |
| Flexibility | Less flexible | More flexible |

### Memory Management

#### Stack Memory vs Heap Memory

| Stack Memory | Heap Memory |
|--------------|-------------|
| Stores reference variables | Stores objects |
| Fixed size | Dynamic size |
| Fast access | Slower access |
| Example: `[a]` | Example: `[10]` |

**Reference Example:**
```java
// Both a and b point to the same object
a = 10;
b = a;
// a -----------------------> 10
// b -----------------------> 10

// If a changes, b also changes
a = 50;
// 10 (object with no reference) → removed by garbage collector
// a --------------------> 50
```

---

## Java Introduction

### How Java Code Executes

```
Java Code Execution Flow:
.java file (Human readable)
    ↓
Compiler
    ↓
.class file (Byte Code)
    ↓
JVM (Interpreter - line by line)
    ↓
Machine Code (0's & 1's)
```

**Key Features:**
- Byte code can run on any OS
- Byte code does not run directly on system
- **Java is Platform Independent**
- JVM is platform dependent (built for every OS)

### JDK vs JRE vs JVM vs JIT

| Component | Description |
|-----------|-------------|
| **JDK** (Java Development Kit) | Provides environment to develop and run Java program. Contains development tools (javac, jar, javadoc, etc.) |
| **JRE** (Java Runtime Environment) | Provides environment to only run the program |
| **JVM** (Java Virtual Machine) | Executes byte code. Platform dependent |
| **JIT** (Just In Time) | Java Interpreter inside JVM. Compiles frequently used methods to machine code for faster execution |

**JDK Contains:**
- Development tools
- User interface toolkits
- Integration libraries
- Base libraries
- `javac` (Java compiler)
- `jar` (archiver)
- `javadoc` (documentation generator)
- Interpreter
- Loader etc.

### Java Development & Runtime Environment

```
Compile Time:
.java file → javac (Java Compiler) → .class file (Byte Code)

Runtime:
.class file → Class Loader → Byte Code Verifier → JVM
    ↓
JIT + Interpreter → Runtime System → Hardware
```

**Inside JVM:**
- **Class Loader**: Loads .class file, generates binary data, creates object in heap
- **Byte Code Verifier**: Verifies class file
- **Java Interpreter**: Line by line execution
- **JIT**: Compiles repeated methods to machine code (faster execution)
- **Garbage Collector**: Removes unused objects from heap memory

---

## Java Basics

### First Java Program

```java
// File Name: Demo.java
// Class Name: Demo (same as file name, first character capital is good practice)

public class Demo {
    public static void main(String args[]) {
        System.out.println(args[0]);
    }
}
```

**Important Notes:**
- `public`: Used so that we can access the class from anywhere
- `void`: Specifies that a method should not return any value
- `String[] args`: Array of sequence of characters (Strings) passed to the main function
- Class name and file name should be same (if class is public)
- To change output location while compiling: `javac -d <path> Demo.java`

**Output Methods:**
- `System.out.println()`: Prints output with new line
- `System.out.print()`: Prints output without new line

### Primitive Data Types

| Type | Example | Size | Notes |
|------|---------|------|-------|
| `int` | `int rollNo = 64;` | 4 bytes | Default for integers |
| `char` | `char letter = 'R';` | 2 bytes | Single quotes |
| `float` | `float marks = 98.67f;` | 4 bytes | Must use 'f' suffix |
| `double` | `double largeDecimal = 456789.2345;` | 8 bytes | Default for decimals |
| `long` | `long largeInteger = 12345678910L;` | 8 bytes | Must use 'L' suffix |
| `boolean` | `boolean check = true;` | 1 bit | true/false |

**Wrapper Classes:**
- Provide additional functionalities
- Converts primitive datatype to object
- Example: `Integer` for `int`

### Comments
```java
// Single line comment
/* Multi-line comment */
```

### Literals & Identifiers
```java
int a = 10;
// a → identifier (name of variable)
// 10 → literal (syntactic representation of data)
```

**Numeric Literals:**
```java
int a = 234_000_000; // Value: 234000000 (underscores ignored)
float f = 564.12345678f; // Rounds off: 564.12345 (floating point error)
```

---

## Control Flow

### If-Else Syntax
```java
if (condition) {
    // block of code
} else {
    // block of code
}
```

### Loops

#### For Loop
```java
for (statement1; statement2; statement3) {
    // code block
}
```

#### While Loop
```java
while (condition) {
    // code block
}
```

#### Do-While Loop
```java
do {
    // code block
} while (condition);
```

### Switch Statement

#### Traditional Switch
```java
switch (expression) {
    case one:
        // code block
        break;
    case two:
        // code block
        break;
    default:
        // code block
}
```
**Rules:**
- `default` executes when none of the cases match
- If `default` is not at end, put `break` after it
- If `break` is not used, execution continues with next case
- Duplicate cases are not allowed

#### New Switch Syntax (Java 14+)
```java
switch (expression) {
    case one -> // do this
    case two -> // do this
    case three -> // do this
}
```

#### Nested Switch Case
```java
switch (expression) {
    case one:
        // code block
        break;
    case two:
        switch (expression) {
            case one:
                // code block
                break;
            default:
                // code block
        }
        break;
    default:
        // code block
}
```

**String Comparison:**
- `x.equals("word")`: Checks value only
- `x == "word"`: Checks reference

---

## Functions & Methods

### Method Structure
```java
public class Main {
    // Method without return value
    static void myMethod() {
        // code
    }
    
    // Method with return value
    access-modifier return-type methodName(parameters) {
        // code
        return statement;
    }
}
```

**Key Concepts:**
- **Return Type**: Must be compatible with returned value
- **Parameters**: Can be primitive or object references
- **Method Overloading**: Same name, different parameters (decided at compile time)

### Pass By Value

#### Primitive Datatypes (Pass by Value)
```java
// Example 1: Primitive types
main() {
    a = 10;
    b = 20;
    swap(a, b); // Values are copied, original remains unchanged
}

swap(num1, num2) {
    temp = num1;
    num1 = num2;
    num2 = temp;
}
```

#### Objects & References (Pass by Reference Value)
```java
// Example 2: Arrays/Objects
main() {
    arr = [1, 2, 3, 4, 5];
    nums → arr;
    nums[0] = 99; // Original array gets changed
    // arr → [99, 2, 3, 4, 5]
}
```

**Important Points:**
1. **Primitive Datatypes**: Just pass value (int, short, char, byte, etc.)
2. **Object & Reference**: Passing value of reference variable

### Scopes

#### Function Scope
- Variables declared inside a method cannot be accessed outside the method

#### Block Scope
```java
public static void main(String[] args) {
    int a = 10;
    int b = 20;
    {
        int c = 20;
        a = 100; // Can update outside variables
    }
    a = 50;
    // c = 10; // Error: cannot access inside block variable
}
```

#### Loop Scope
- Variables declared inside loop have loop scope only

#### Shadowing
- Using variables with same name in overlapping scopes
- Lower-level scope variable overrides higher-level scope variable

```java
public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x = 50;
        System.out.println(x); // 50 (shadowed)
    }
}
```

### Variable Arguments (Varargs)
```java
// Method that takes variable number of arguments
static void fun(int... a) {
    // a is treated as array of type int[]
}
```

---

## Arrays & ArrayList

### Why Arrays?
- Store collection of same datatype elements
- Alternative to declaring 5000 individual variables

### Array Syntax
```java
// Declaration and initialization
int[] rollnos = new int[5];
int[] rollnos = {51, 82, 13, 15, 16};

// String array
String[] arr = new String[4]; // Default: null values
```

### Internal Working
```java
int[] rollnos; // declaration (reference created in stack)
rollnos = new int[5]; // initialization (object created in heap)
```
- **Declaration**: Compile Time
- **Initialization**: Run Time (Dynamic Memory Allocation)

### Array Properties
- **Index starts from 0**
- **Mutable**: Can change elements
- **Fixed size**: Once created, size cannot be changed
- **Default Values**: 
  - `int[]`: `[0, 0, 0, 0, 0]`
  - `String[]`: `[null, null, null, null]`

### 2D Array
```java
// Representation
int[][] arr = new int[rows][columns];
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Access
arr[0] = [1, 2, 3];
arr[0][2] = 3; // Access element
```
- **Row size**: Mandatory
- **Column size**: Optional (Jagged array possible)

### ArrayList
```java
import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();
// Uses wrapper classes (Integer, String, etc.)
// Does not support primitive types directly
```

**Internal Working:**
1. Internally size is fixed
2. When ArrayList gets filled:
   - New array of bigger size is created
   - Old elements are copied
   - Old array is deleted

**Comparison:**
| Feature | Array | ArrayList |
|---------|-------|-----------|
| Speed | Faster | Slower |
| Size | Fixed | Dynamic |
| Primitives | Supported | Not supported (use wrappers) |
| Mutability | Mutable | Mutable |

---

## Searching Algorithms

### Linear Search

**Algorithm:**
- Compare target with each element sequentially
- Works on unsorted arrays

**Example:**
```java
arr = [18, 12, 19, 77, 29, 50]
target = 77
// Compare: 18≠77, 12≠77, 19≠77, 77==77 → Found at index 3
```

**Time Complexity:**
- **Best Case**: O(1) - Element at first index
- **Worst Case**: O(n) - Element at last or not present

### Binary Search

**Precondition:**
- Works only on **sorted arrays** (ascending or descending)

**Algorithm:**
```java
arr = [2, 4, 6, 9, 11, 12, 14, 20, 36, 48]
target = 36

start = 0, end = 9
mid = (0+9)/2 = 4 → arr[4]=11
36 > 11 → search right

start = 5, end = 9
mid = (5+9)/2 = 7 → arr[7]=20
36 > 20 → search right

start = 8, end = 9
mid = (8+9)/2 = 8 → arr[8]=36
Found!
```

**Time Complexity:**
- **Best Case**: O(1) - Element at middle
- **Worst Case**: O(log n) - Maximum comparisons

#### Order Agnostic Binary Search
- Works for both ascending and descending arrays
- Check order: `if (arr[start] > arr[end]) → descending`

**Logic:**
```java
if (ascending) {
    target > middle → search right
    target < middle → search left
} else { // descending
    target > middle → search left
    target < middle → search right
}
```

# Advanced Binary Search Problems

This document explains several advanced problems that can be solved efficiently using the Binary Search algorithm. The concepts are based on the provided handwritten notes.

## Table of Contents
1.  [Ceiling of a Number](#1-ceiling-of-a-number)
2.  [Floor of a Number](#2-floor-of-a-number)
3.  [Next Greatest Letter (LeetCode)](#3-next-greatest-letter)
4.  [Find First and Last Position of Element](#4-find-first-and-last-position-of-element)
5.  [Find in Infinite Sorted Array](#5-find-in-infinite-sorted-array)
6.  [Peak Index in a Mountain Array](#6-peak-index-in-a-mountain-array)
7.  [Search in a Mountain Array](#7-search-in-a-mountain-array)
8.  [Search in Rotated Sorted Array](#8-search-in-rotated-sorted-array)
9.  [Split Array Largest Sum (LeetCode)](#9-split-array-largest-sum)

---

### 1. Ceiling of a Number

#### Problem Statement
Given a sorted array `arr` and a target value, find the "ceiling" of the target.
**Ceiling**: The smallest element in the array that is greater than or equal to the target (`>= target`). If no such element exists, return -1.

**Example:**
`arr = [2, 3, 5, 9, 14, 16, 18]`
- `target = 14` → `ceiling = 14`
- `target = 15` → `ceiling = 16`
- `target = 4` → `ceiling = 5`
- `target = 9` → `ceiling = 9`

#### Logic (Binary Search)
We use a standard binary search, but with a twist in how we handle the result.

1.  **Initialize**: `start = 0`, `end = arr.length - 1`.
2.  **Loop**: `while (start <= end)`
    *   Find `mid = start + (end - start) / 2`.
    *   If `target < arr[mid]`: The `mid` element could be our answer, but we look for a smaller one on the left. So, `end = mid - 1`.
    *   If `target > arr[mid]`: The `mid` element is too small. We must look on the right. `start = mid + 1`.
    *   If `target == arr[mid]`: We've found the exact element, which is the ceiling. Return `arr[mid]`.
3.  **Loop Termination**: The loop breaks when `start > end`. At this point, the `start` pointer will be at the index of the smallest number that is greater than the target. This is our ceiling.

**Why does `start` hold the answer when the loop breaks?**
When the loop terminates, `start` is the first index where `arr[start]` is greater than `target`. All elements before it were smaller, which caused `start` to advance. The element `arr[end]` is the last element smaller than `target`. Therefore, `arr[start]` is the smallest element that is greater than the target.

```java
// Java Code
int findCeiling(int[] arr, int target) {
    if (target > arr[arr.length - 1]) {
        return -1; // Target is greater than the greatest element
    }
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (target < arr[mid]) {
            end = mid - 1;
        } else if (target > arr[mid]) {
            start = mid + 1;
        } else {
            return arr[mid]; // Found exact match
        }
    }
    // Loop ended, start is the ceiling
    return arr[start];
}
```

---

### 2. Floor of a Number

#### Problem Statement
Given a sorted array `arr` and a target value, find the "floor" of the target.
**Floor**: The greatest element in the array that is smaller than or equal to the target (`<= target`).

**Example:**
`arr = [2, 3, 5, 9, 14, 16, 18]`
- `target = 15` → `floor = 14`

#### Logic
This is the inverse of the ceiling problem.

1.  **Loop**: `while (start <= end)`
2.  **Loop Termination**: When the loop breaks (`start > end`), the `end` pointer will be at the index of the greatest number that is smaller than the target.

**Why does `end` hold the answer?**
When the loop ends, `end` points to the last element that was confirmed to be less than or equal to the target (or potentially a candidate). The `start` pointer has moved past it, indicating the search space for larger numbers. Therefore, `arr[end]` is the floor.

```java
// Java Code
int findFloor(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (target < arr[mid]) {
            end = mid - 1;
        } else if (target > arr[mid]) {
            start = mid + 1;
        } else {
            return arr[mid]; // Found exact match
        }
    }
    // Loop ended, end is the floor
    return arr[end];
}
```

---

### 3. Next Greatest Letter

#### Problem Statement
Given an array of characters `letters` that is sorted in non-decreasing order, and a character `target`, find the smallest character in the array that is strictly larger than `target`.
**Note:** The letters wrap around. For example, if `target = 'z'` and `letters = ['a', 'b']`, the answer is `'a'`.

#### Logic
This is identical to the "Ceiling of a Number" problem, with a small modification for the wrap-around condition.

1.  Perform a binary search as in the ceiling problem.
2.  When the loop terminates, `start` will point to the index of the next greatest letter.
3.  If `start` becomes equal to `letters.length`, it means the target is greater than or equal to all letters in the array. Due to the wrap-around rule, the answer is the first letter of the array.
4.  This wrap-around can be handled elegantly using the modulo operator: `return letters[start % letters.length]`.

```java
// Java Code
char nextGreatestLetter(char[] letters, char target) {
    int start = 0;
    int end = letters.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (target < letters[mid]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
    return letters[start % letters.length];
}
```

---

### 4. Find First and Last Position of Element

#### Problem Statement
Given an array of integers `nums` sorted in ascending order, find the starting and ending position of a given `target` value. If the target is not found, return `[-1, -1]`.

**Example:**
`nums = [5, 7, 7, 7, 7, 8, 8, 10]`, `target = 7` → `[1, 4]`

#### Logic
We need to run binary search twice.
1.  **First Search (for First Position):**
    - Run a binary search.
    - If `nums[mid] == target`, it's a *potential* answer. We store it and continue searching on the **left** side to find an even earlier occurrence (`end = mid - 1`).
2.  **Second Search (for Last Position):**
    - Run another binary search.
    - If `nums[mid] == target`, it's a *potential* answer. We store it and continue searching on the **right** side to find a later occurrence (`start = mid + 1`).

```java
// Java Code
public int[] searchRange(int[] nums, int target) {
    int[] ans = {-1, -1};
    ans[0] = findPosition(nums, target, true); // Find first
    if (ans[0] != -1) {
        ans[1] = findPosition(nums, target, false); // Find last
    }
    return ans;
}

// Helper function to find either first or last position
int findPosition(int[] nums, int target, boolean findFirst) {
    int ans = -1;
    int start = 0;
    int end = nums.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (target < nums[mid]) {
            end = mid - 1;
        } else if (target > nums[mid]) {
            start = mid + 1;
        } else {
            // Potential answer found
            ans = mid;
            if (findFirst) {
                end = mid - 1; // Look left for first position
            } else {
                start = mid + 1; // Look right for last position
            }
        }
    }
    return ans;
}
```

---

### 5. Find in Infinite Sorted Array

#### Problem Statement
You are given a sorted array of unknown size. You only have an interface `ArrayReader` with a `get(k)` method that returns the element at index `k`. Find if a `target` exists in the array.

#### Logic
Since we can't use `arr.length`, we can't set our `end` pointer. The strategy is to find appropriate bounds first and then apply binary search.

1.  **Find Bounds (Exponential Backoff):**
    - Start with a small search space, e.g., `start = 0`, `end = 1`.
    - While the `target` is greater than the element at `end`, we expand our search space exponentially.
    - The new `start` becomes the old `end + 1`.
    - The new `end` becomes `old_end + (size_of_current_box * 2)`.
2.  **Apply Binary Search:**
    - Once we find a range where `target <= reader.get(end)`, we have our `start` and `end` bounds.
    - Now, we can perform a regular binary search within this range.

```java
// Java Code
int searchInfinite(ArrayReader reader, int target) {
    // 1. Find the bounds for the search
    int start = 0;
    int end = 1;
    while (reader.get(end) < target) {
        int newStart = end + 1;
        // Double the box size: end = previous_end + size_of_box * 2
        end = end + (end - start + 1) * 2;
        start = newStart;
    }

    // 2. Perform binary search within the found bounds
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (target < reader.get(mid)) {
            end = mid - 1;
        } else if (target > reader.get(mid)) {
            start = mid + 1;
        } else {
            return mid;
        }
    }
    return -1;
}
```

---

### 6. Peak Index in a Mountain Array

#### Problem Statement
A mountain array (or bitonic array) is an array that strictly increases and then strictly decreases. Find the index of the peak element.

**Example:** `[1, 2, 3, 5, 7, 6, 3, 2]` → Peak is `7` at index `4`.

#### Logic
We can find the peak using a modified binary search.

1.  **Initialize**: `start = 0`, `end = arr.length - 1`.
2.  **Loop**: `while (start < end)` (Note the strict inequality)
    *   Find `mid`.
    *   If `arr[mid] > arr[mid + 1]`: We are in the decreasing part of the array. The peak could be `mid` or to its left. We shrink our search space to the left: `end = mid`.
    *   If `arr[mid] < arr[mid + 1]`: We are in the increasing part. The peak must be to the right of `mid`. `start = mid + 1`.
3.  **Loop Termination**: The loop breaks when `start == end`. At this point, both pointers will converge on the peak element. We can return `start` or `end`.

```java
// Java Code
int peakIndexInMountainArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] > arr[mid + 1]) {
            // We are in the decreasing part, peak is to the left or is mid
            end = mid;
        } else {
            // We are in the increasing part, peak is to the right
            start = mid + 1;
        }
    }
    // start and end are equal, pointing to the peak
    return start;
}
```

### 7. Search in a Mountain Array

#### Problem Statement
Given a mountain array, find if a `target` element exists in it.

#### Logic
This is a two-step process:
1.  **Find the Peak:** Use the algorithm from the previous problem to find the index of the peak element.
2.  **Search on Both Sides:**
    - Perform a regular binary search for the `target` in the ascending part of the array (from index `0` to `peak_index`).
    - If not found, perform an order-agnostic binary search for the `target` in the descending part of the array (from index `peak_index + 1` to `arr.length - 1`).

---

### 8. Search in Rotated Sorted Array

#### Problem Statement
An array sorted in ascending order has been rotated at some unknown pivot. Given a `target` value, find its index, or return -1.

**Example:** `[4, 5, 6, 7, 0, 1, 2]` (rotated from `[0,1,2,4,5,6,7]`)

#### Logic
The key is to first find the pivot (the point of rotation, which is the largest element).

1.  **Find the Pivot:**
    - The pivot is the only element where `arr[pivot] > arr[pivot + 1]`.
    - We can find this using a modified binary search. In the search:
        - If `arr[mid] > arr[mid + 1]`, `mid` is the pivot.
        - If `arr[mid] < arr[mid - 1]`, `mid - 1` is the pivot.
        - If `arr[start] >= arr[mid]`, the pivot must be on the left (`end = mid - 1`).
        - If `arr[start] < arr[mid]`, we are in a sorted part, so the pivot is on the right (`start = mid + 1`).
2.  **Search in Correct Subarray:**
    - Once the pivot is found, the array is effectively split into two sorted subarrays.
    - If `target >= arr[0]` (the first element), search in the first sorted subarray (from `0` to `pivot`).
    - Otherwise, search in the second sorted subarray (from `pivot + 1` to `end`).

**Note on duplicates:** If the array contains duplicates, finding the pivot can become O(N) in the worst case because if `arr[start] == arr[mid] == arr[end]`, we have to skip duplicates by incrementing `start` and decrementing `end`.

---

### 9. Split Array Largest Sum

#### Problem Statement
Given an array `nums` which consists of non-negative integers, and an integer `m`, you can split the array into `m` non-empty continuous subarrays. Write an algorithm to minimize the largest sum among these `m` subarrays.

#### Logic (Binary Search on the Answer)
This is a very clever application of binary search. Instead of searching for an index, we search for the answer itself.

1.  **Define the Search Space for the Answer:**
    - What is the minimum possible value for the "largest sum"? It's the largest single element in the array. (This happens when we split the array into `m = nums.length` pieces). `start = max(nums)`.
    - What is the maximum possible value? The sum of all elements in the array. (This happens when `m = 1`). `end = sum(nums)`.
    - Our answer must lie between `start` and `end`.

2.  **Binary Search on the Sum:**
    - `mid = start + (end - start) / 2`. Let's assume `mid` is our potential answer for the minimized largest sum.
    - Now, we must check if it's *possible* to split the array into `m` pieces such that the sum of each piece does not exceed `mid`.
    - To check this, iterate through the array, accumulating a `currentSum`.
    - If `currentSum + num > mid`, it means we have to end the current piece and start a new one. Increment a `pieces` counter and reset `currentSum = num`.
    - After iterating, we have the total number of `pieces` required to satisfy the `mid` sum.

3.  **Adjust the Search Space:**
    - If `pieces <= m`: It means `mid` is a valid (or too large) potential answer. We can do better by trying to find a smaller sum. So, `end = mid`.
    - If `pieces > m`: It means `mid` is too small. We couldn't fit the numbers into `m` pieces without exceeding `mid`. We need to increase our allowed sum. `start = mid + 1`.

4.  **Result:** The loop continues until `start == end`, which will be our final, minimized largest sum.

**Walkthrough:** `nums = [7, 2, 5, 10, 8]`, `m = 2`
1.  `start = 10` (max element), `end = 32` (total sum).
2.  `mid = (10+32)/2 = 21`. Can we split into 2 pieces with max sum 21?
    - Piece 1: `[7, 2, 5]` (sum=14).
    - Piece 2: `[10, 8]` (sum=18).
    - Yes, we made 2 pieces. Since `pieces(2) <= m(2)`, this is a possible answer. Let's try for a smaller one. `end = mid = 21`.
3.  `start = 10`, `end = 21`. `mid = 15`. Can we split with max sum 15?
    - Piece 1: `[7, 2, 5]` (sum=14).
    - Piece 2: `[10]` (sum=10).
    - Piece 3: `[8]` (sum=8).
    - We needed 3 pieces. `pieces(3) > m(2)`. So, 15 is too small. We must allow a larger sum. `start = mid + 1 = 16`.
4.  `start = 16`, `end = 21`. `mid = 18`. Can we split with max sum 18?
    - Piece 1: `[7, 2, 5]` (sum=14).
    - Piece 2: `[10, 8]` (sum=18).
    - Yes, 2 pieces. `pieces(2) <= m(2)`. Possible answer. `end = mid = 18`.
5.  ... The loop continues until `start` and `end` both converge on `18`.

**Final Answer: 18**

### Cyclic Sort

**When to use:**
- Numbers in range 1 to N
- Place every number at its correct index (index = value - 1)

**Algorithm:**
```java
arr = [3, 5, 2, 1, 4]
// Correct position: value at index (value-1)

i=0: arr[0]=3 → correct index=2 → swap with arr[2]
[2, 5, 3, 1, 4]

i=0: arr[0]=2 → correct index=1 → swap with arr[1]
[5, 2, 3, 1, 4]

i=0: arr[0]=5 → correct index=4 → swap with arr[4]
[4, 2, 3, 1, 5]

i=0: arr[0]=4 → correct index=3 → swap with arr[3]
[1, 2, 3, 4, 5]

i=1: arr[1]=2 → correct index=1 → no swap, i++
// Array sorted!
```

**Time Complexity:** O(n) - Each element swapped at most once
**Applications:** Find missing number, duplicate number, 1 to N problems

---

## Sorting Algorithms

### Bubble Sort

**Concept:**
- Repeatedly swap adjacent elements if in wrong order
- Largest element moves to end in each pass
- Also called **Sinking Sort** or **Exchange Sort**

**Example:**
```java
Array: 3, 1, 5, 4, 2

Pass 1: 1, 3, 4, 2, 5 (5 fixed)
Pass 2: 1, 3, 2, 4, 5 (4 fixed)
Pass 3: 1, 2, 3, 4, 5 (3 fixed)
Sorted!
```

**Time Complexity:**
- **Best Case**: O(n) - Already sorted (only one pass)
- **Worst Case**: O(n²) - Reverse sorted
- **Space Complexity**: O(1) - In-place sorting
- **Stable**: Yes (preserves relative order)

### Insertion Sort

**Concept:**
- Partially sort array
- Left side always sorted
- Insert current element at correct position on left

**Example:**
```java
Array: 5, 3, 4, 1, 2

Pass 1: [3, 5] 4, 1, 2 (3<5, swap)
Pass 2: [3, 4, 5] 1, 2 (4<5, swap)
Pass 3: [1, 3, 4, 5] 2 (1<3<4<5, swap all)
Pass 4: [1, 2, 3, 4, 5] (2 inserted)
Sorted!
```

**Time Complexity:**
- **Best Case**: O(n) - Already sorted
- **Worst Case**: O(n²) - Reverse sorted
- **Adaptive**: Yes (fewer steps if partially sorted)
- **Stable**: Yes

### Selection Sort

**Concept:**
- Select maximum element and place at correct position (right side)
- Or select minimum and place at left side

**Example (Max to right):**
```java
Array: 4, 5, 1, 2, 3

Pass 1: Max=5 → swap with last → 4, 3, 1, 2, 5
Pass 2: Max=4 → swap with second last → 2, 3, 1, 4, 5
Pass 3: Max=3 → swap → 2, 1, 3, 4, 5
Pass 4: Max=2 → swap → 1, 2, 3, 4, 5
Sorted!
```

**Time Complexity:**
- **Best/Worst Case**: O(n²) - Always same comparisons
- **Space Complexity**: O(1) - In-place
- **Stable**: No
- **Swaps**: Minimum number of swaps

---

## Strings & StringBuilder

### Memory Concept

**Stack Memory:**
- Reference variables stored
- Example: `String name = "Niraj";` → `name` in stack

**Heap Memory:**
- Objects stored
- String pool inside heap for memory efficiency

### String Pool
- Separate memory area inside heap
- **Why?** To save memory (duplicate strings not created)
```java
String a = "Niraj";
String b = "Niraj";
// Both point to same object in string pool
```

### Immutability
- Strings are **immutable** (cannot be changed after creation)
- New object created if value changes
```java
String name = "Niraj";
name = "Karan"; // New object "Karan" created, "Niraj" remains
```

**Why Immutable?**
- Security
- Memory efficiency
- Multiple references can point to same object safely

### String Comparison
```java
String a = "Kunal";
String b = "Kunal";
String c = new String("Kunal");

a == b;      // true (same reference)
a == c;      // false (different reference)
a.equals(b); // true (same value)
a.equals(c); // true (same value)
```

### String Methods
```java
String s = "Hello World";

s.charAt(0);      // 'H'
s.length();       // 11
s.toLowerCase();  // "hello world"
s.indexOf('l');   // 2
s.lastIndexOf('l'); // 9
s.strip();        // Removes whitespace
s.split(" ");     // ["Hello", "World"]
```

### StringBuilder
- **Mutable** version of String
- **Faster** than String (no new object creation)
- Reference remains same on modification

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World"); // Mutable, no new object
```

**When to use:**
- Frequent string modifications
- Concatenation in loops
- Performance-critical code

---

## Pattern Questions

### Approach
1. **Rows = Outer loop iterations**
2. **Columns = Inner loop iterations**
3. **Find relationship between row and column**

### Pattern 1: Simple Star
```
*
* *
* * *
* * * *
```
**Logic:** `columns = row number`

### Pattern 2: Reverse Star
```
* * * *
* * *
* *
*
```
**Logic:** `columns = N - row + 1`

### Pattern 3: Diamond
```
    *
   * *
  * * *
 * * * *
  * * *
   * *
    *
```
**Logic:**
```java
if (row <= N) columns = row;
else columns = 2*N - row - 1;
```

### Pattern 4: Number Pattern
```
1
1 2
1 2 3
1 2 3 4
```
**Logic:** Print column number

### Pattern 5: Distance Method (Square Matrix)
```java
Size = 2*N + 1
Value = min(distance from left, right, top, bottom)
```

---

## Recursion Fundamentals

### What is Recursion?
- Function calling itself
- Breaks big problems into smaller problems
- Uses stack memory for each call

### Base Condition (CRITICAL)
- Condition where recursion stops
- Prevents infinite calls
- Without it: **STACK OVERFLOW ERROR**

**Why Recursion?**
- Solves complex problems simply
- Clean code
- Can convert to iteration and vice-versa

### Call Stack Visualization
```
main()
  ↓
print(1)
  ↓
print(2)
  ↓
print(3)
  ↓
print(4)
  ↓
print(5)
```
**LIFO (Last In First Out)** principle

### Fibonacci Recursion
```java
// Recurrence Relation: fib(n) = fib(n-1) + fib(n-2)
// Base: fib(0)=0, fib(1)=1

fib(4)
├── fib(3)
│   ├── fib(2)
│   │   ├── fib(1) → 1
│   │   └── fib(0) → 0
│   └── fib(1) → 1
└── fib(2)
    ├── fib(1) → 1
    └── fib(0) → 0
```
**Problem:** Repeated calculations → Inefficient

### How to Approach Recursion Problems
1. Identify smaller sub-problems
2. Write recurrence relation
3. Define base condition
4. Draw recursion tree
5. Trace stack flow
6. Observe return values

**Golden Rule:** DO NOT OVERTHINK

---

## Recursion with Arrays

### Q1: Check if Array is Sorted
```java
boolean checkSorted(int[] arr, int i) {
    if (i == arr.length - 1) return true; // Base
    
    if (arr[i] > arr[i+1]) return false;
    return checkSorted(arr, i+1);
}
```

### Q2: Linear Search (Recursive)
```java
int search(int[] arr, int target, int i) {
    if (i == arr.length) return -1; // Not found
    
    if (arr[i] == target) return i;
    return search(arr, target, i+1);
}
```

### Q3: Find ALL Indexes of Target
```java
// Pure recursion (no shared list)
List<Integer> findAll(int[] arr, int target, int i) {
    if (i == arr.length) return new ArrayList<>(); // Base
    
    List<Integer> ans = new ArrayList<>();
    if (arr[i] == target) ans.add(i);
    
    List<Integer> rest = findAll(arr, target, i+1);
    ans.addAll(rest);
    return ans;
}
```

**Key Learning:**
- Always move index forward
- Base condition is VERY IMPORTANT
- Each call has its own local variables

---

## Recursion – Easy Problems

### Q1: Print Numbers (N to 1)
```java
void printNto1(int n) {
    if (n == 0) return; // Base
    
    System.out.print(n + " ");
    printNto1(n - 1); // Work BEFORE call
}
// Output: 5 4 3 2 1
```

### Q2: Print Numbers (1 to N)
```java
void print1toN(int n) {
    if (n == 0) return; // Base
    
    print1toN(n - 1); // Work AFTER call
    System.out.print(n + " ");
}
// Output: 1 2 3 4 5
```

### Q3: Factorial
```java
int factorial(int n) {
    if (n == 1) return 1; // Base
    
    return n * factorial(n - 1);
}
// 5! = 5 × 4 × 3 × 2 × 1 = 120
```

### Q4: Sum of Digits
```java
int sumDigits(int n) {
    if (n == 0) return 0; // Base
    
    return (n % 10) + sumDigits(n / 10);
}
// 1342 → 2 + 4 + 3 + 1 = 10
```

### Q5: Reverse a Number
```java
int reverse(int n, int ans) {
    if (n == 0) return ans; // Base
    
    int rem = n % 10;
    ans = ans * 10 + rem;
    return reverse(n / 10, ans);
}
// 1824 → 4281
```

### Q6: Count Zeros
```java
int countZero(int n, int count) {
    if (n == 0) return count == 0 ? 1 : count; // Special case
    
    if (n % 10 == 0) 
        return countZero(n / 10, count + 1);
    else 
        return countZero(n / 10, count);
}
```

---

## Recursion – Numbers & Dice

### Q1: Letter Combinations (Phone Keypad)
```java
// Mapping: 1→abc, 2→def, 3→ghi, etc.

void letterCombinations(String digits, String ans) {
    if (digits.isEmpty()) {
        System.out.println(ans);
        return;
    }
    
    String mapping = getMapping(digits.charAt(0));
    for (char ch : mapping.toCharArray()) {
        letterCombinations(digits.substring(1), ans + ch);
    }
}
// Input: "12" → Output: ad, ae, af, bd, be, bf, cd, ce, cf
```

### Q2: Dice Throw Problem
```java
void dice(int target, String path) {
    if (target == 0) {
        System.out.println(path);
        return;
    }
    
    for (int i = 1; i <= 6; i++) {
        if (i <= target) {
            dice(target - i, path + i);
        }
    }
}
// Target=3 → 111, 12, 21, 3
```

---

## Recursion – Patterns

### Pattern 1: Solid Rectangle
```java
void pattern(int r, int c) {
    if (r == 0) return;
    
    if (c < r) {
        System.out.print("* ");
        pattern(r, c + 1);
    } else {
        System.out.println();
        pattern(r - 1, 0);
    }
}
```

### Pattern 2: Triangle
```java
void pattern(int r, int c) {
    if (r == 0) return;
    
    if (c < r) {
        System.out.print("* ");
        pattern(r, c + 1);
    } else {
        System.out.println();
        pattern(r - 1, 0);
    }
}
```

### Pattern 3: Reverse Triangle
```java
void pattern(int r, int c, int n) {
    if (r == 0) return;
    
    if (c < n - r + 1) {
        System.out.print("* ");
        pattern(r, c + 1, n);
    } else {
        System.out.println();
        pattern(r - 1, 0, n);
    }
}
```

---

## Recursion – Permutations

### Permutation Logic
- **Order matters**
- Total permutations = n!
- Insert character at all positions

```java
void permute(String processed, String unprocessed) {
    if (unprocessed.isEmpty()) {
        System.out.println(processed);
        return;
    }
    
    char ch = unprocessed.charAt(0);
    for (int i = 0; i <= processed.length(); i++) {
        String newProcessed = processed.substring(0, i) 
                            + ch 
                            + processed.substring(i);
        permute(newProcessed, unprocessed.substring(1));
    }
}
// Input: "abc" → abc, bac, cab, bca, acb, cba
```

---

## Recursion – Subsets & Strings

### Remove Character (Recursive)
```java
// Method 1: With answer parameter
String removeChar(String ans, String str) {
    if (str.isEmpty()) return ans;
    
    char ch = str.charAt(0);
    if (ch == 'a') 
        return removeChar(ans, str.substring(1));
    else 
        return removeChar(ans + ch, str.substring(1));
}

// Method 2: Without answer parameter (pure recursion)
String removeChar(String str) {
    if (str.isEmpty()) return "";
    
    char ch = str.charAt(0);
    if (ch == 'a') 
        return removeChar(str.substring(1));
    else 
        return ch + removeChar(str.substring(1));
}
```

### Subsets (Include/Exclude)
```java
void subsets(String processed, String unprocessed) {
    if (unprocessed.isEmpty()) {
        System.out.println(processed);
        return;
    }
    
    char ch = unprocessed.charAt(0);
    
    // Include
    subsets(processed + ch, unprocessed.substring(1));
    
    // Exclude
    subsets(processed, unprocessed.substring(1));
}
// Input: "abc" → "", "a", "b", "c", "ab", "ac", "bc", "abc"
```

**Handling Duplicates:**
- Sort array first
- When duplicate found, only add to newly created subsets

---

## Recursion – Space Complexity

### Key Concept
**Space Complexity = Height of Recursion Tree**

**Why?**
- Only one path from root to leaf exists in stack at any time
- Previous function waits for next to return
- Non-linked calls never in stack simultaneously

### Example: Fibonacci
```
fib(5)
├── fib(4)
│   ├── fib(3)
│   │   ├── fib(2)
│   │   │   ├── fib(1)
│   │   │   └── fib(0)
│   │   └── fib(1)
│   └── fib(2)
│       ├── fib(1)
│       └── fib(0)
└── fib(3)
    ├── fib(2)
    │   ├── fib(1)
    │   └── fib(0)
    └── fib(1)
```
- **Longest chain**: fib(5) → fib(4) → fib(3) → fib(2) → fib(1) → fib(0)
- **Height** = n
- **Space Complexity** = O(n)

**Important:** Time complexity may be O(2ⁿ) but space is O(n)

---

## Merge Sort & Quick Sort

### Merge Sort (Divide & Conquer)

**Steps:**
1. Divide array into 2 halves
2. Recursively sort both halves
3. Merge sorted halves

**Example:**
```java
Array: [8, 3, 4, 12, 5, 6]
Divide: [8,3,4] [12,5,6]
Divide: [8] [3,4] [12] [5,6]
Merge:  [3,4,8] [5,6,12]
Merge:  [3,4,5,6,8,12]
```

**Time Complexity:**
- **Best/Average/Worst**: O(n log n)
- **Recurrence**: T(n) = 2T(n/2) + n

**Space Complexity:**
- **O(n)** - Extra array for merging
- **Not in-place**

**Properties:**
- Stable sorting algorithm
- Consistent performance
- Used in external sorting

### Quick Sort (Divide & Conquer)

**Steps:**
1. Select pivot element
2. Partition: elements < pivot to left, > pivot to right
3. Recursively sort left and right

**Example:**
```java
Array: [5, 4, 3, 2, 1]
Pivot: 4
Partition: [3, 2, 1, 4, 5] (4 at correct position)
Recurse left: [3,2,1] and right: [5]
```

**Partition Logic:**
```java
while (s <= e) {
    while (arr[s] < pivot) s++;
    while (arr[e] > pivot) e--;
    if (s <= e) swap(arr[s], arr[e]);
}
```

**Time Complexity:**
- **Best/Average**: O(n log n)
- **Worst**: O(n²) - Pivot always smallest/largest
- **Space**: O(log n) - Recursion stack

**Properties:**
- Not stable
- In-place sorting
- Faster in practice than merge sort
- Cache friendly

**Pivot Selection:**
- Random element
- First/last element (corner)
- Middle element (preferred)

---

## Solving Linear Recurrences

### Homogeneous Linear Recurrence

**General Form:**
```
f(n) = a₁f(n-1) + a₂f(n-2) + ... + aₖf(n-k)
```

**Solution Method:**

**Step 1:** Assume solution `f(n) = αⁿ`
Substitute in recurrence:
```
αⁿ = a₁αⁿ⁻¹ + a₂αⁿ⁻² + ... + aₖαⁿ⁻ᵏ
```
Divide by αⁿ⁻ᵏ:
```
αᵏ - a₁αᵏ⁻¹ - a₂αᵏ⁻² - ... - aₖ = 0
```
This is **Characteristic Equation**

**Step 2:** Solve characteristic equation

**Step 3:** General solution
- **Distinct roots**: `f(n) = C₁α₁ⁿ + C₂α₂ⁿ + ...`
- **Repeated roots**: Multiply by n
  `f(n) = C₁αⁿ + C₂nαⁿ + C₃n²αⁿ + ...`

### Example: Fibonacci
```
f(n) = f(n-1) + f(n-2)
Characteristic: α² - α - 1 = 0
Roots: α = (1 ± √5)/2
Solution: f(n) = C₁α₁ⁿ + C₂α₂ⁿ
Base: f(0)=0, f(1)=1
Final: f(n) = 1/√5 [((1+√5)/2)ⁿ - ((1-√5)/2)ⁿ]
Time Complexity: O(1.618ⁿ)
```

### Non-Homogeneous Recurrence
**General Form:**
```
f(n) = a f(n-1) + g(n)
```

**Solution:**
1. Solve homogeneous part (g(n)=0)
2. Guess particular solution based on g(n)
3. Add both solutions

**Rules for Particular Solution:**
- If g(n) = aⁿ → guess C·aⁿ
- If g(n) is polynomial degree k → guess polynomial degree k
- If g(n) = exponential × polynomial → multiply both

---

## Summary Table: Sorting Algorithms

| Algorithm | Best Case | Worst Case | Space | Stable | In-Place |
|-----------|-----------|------------|-------|--------|----------|
| **Bubble Sort** | O(n) | O(n²) | O(1) | Yes | Yes |
| **Insertion Sort** | O(n) | O(n²) | O(1) | Yes | Yes |
| **Selection Sort** | O(n²) | O(n²) | O(1) | No | Yes |
| **Merge Sort** | O(n log n) | O(n log n) | O(n) | Yes | No |
| **Quick Sort** | O(n log n) | O(n²) | O(log n) | No | Yes |

---

## Summary Table: Searching Algorithms

| Algorithm | Best Case | Worst Case | Requires Sorted | Space |
|-----------|-----------|------------|-----------------|-------|
| **Linear Search** | O(1) | O(n) | No | O(1) |
| **Binary Search** | O(1) | O(log n) | Yes | O(1) |
| **Cyclic Sort** | O(n) | O(n) | No (1 to N) | O(1) |

---

## Key Takeaways

1. **Recursion**: Base condition is mandatory. Trust the process.
2. **Arrays**: Know stack vs heap storage. Reference variables vs objects.
3. **Strings**: Immutable. Use StringBuilder for frequent modifications.
4. **Sorting**: Choose based on stability, space, and time requirements.
5. **Searching**: Binary search only on sorted arrays.
6. **Patterns**: Outer loop = rows, Inner loop = columns.
7. **Space Complexity in Recursion**: Height of recursion tree, not number of calls.
8. **Divide & Conquer**: Recurrence relations describe behavior.
9. **Linear Recurrences**: Characteristic equation solves homogeneous cases.
10. **Java Memory**: Stack for references, Heap for objects, Garbage collection for cleanup.
```