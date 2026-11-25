package Substring_Anagram_Palindrome_and_Parentheses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupsAnagrams {
	public static void main(String[] args) {
		String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println("Group Anagram : " + groupsAnagrams(str));
	}

	public static List<List<String>> groupsAnagrams(String[] str) {

		Map<String, List<String>> map = new HashMap<>();

		for (int i = 0; i < str.length; i++) {

			char[] ch = str[i].toCharArray();

			Arrays.sort(ch);

			String key = new String(ch);

			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}

			map.get(key).add(str[i]);
		}

		return new ArrayList<>(map.values());

	}

}
