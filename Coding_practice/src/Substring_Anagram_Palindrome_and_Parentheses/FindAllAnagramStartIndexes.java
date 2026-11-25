package Substring_Anagram_Palindrome_and_Parentheses;

import java.util.*;

public class FindAllAnagramStartIndexes {

	public static void main(String[] args) {

		String s = "cbaebabacd";
		String p = "abc";

		System.out.println(findAnagrams(s, p));
	}

	public static List<Integer> findAnagrams(String s, String p) {

		List<Integer> result = new ArrayList<>();

		int n = s.length();
		int m = p.length();

		if (m > n) {
			return result;
		}

		int[] pFreq = new int[26];
		int[] windowFreq = new int[26];

		// Count frequency of p
		for (int i = 0; i < m; i++) {
			pFreq[p.charAt(i) - 'a']++;
		}

		// Create first window
		for (int i = 0; i < m; i++) {
			windowFreq[s.charAt(i) - 'a']++;
		}

		// Check first window
		if (Arrays.equals(pFreq, windowFreq)) {
			result.add(0);
		}

		// Slide the window
		for (int i = m; i < n; i++) {

			// Remove outgoing character
			windowFreq[s.charAt(i - m) - 'a']--;

			// Add incoming character
			windowFreq[s.charAt(i) - 'a']++;

			// Compare frequencies
			if (Arrays.equals(pFreq, windowFreq)) {
				result.add(i - m + 1);
			}
		}

		return result;
	}
}
