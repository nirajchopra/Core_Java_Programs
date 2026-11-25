package Substring_Anagram_Palindrome_and_Parentheses;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        String str = "babad";

        System.out.println(longestPalindrome(str));
    }

    public static String longestPalindrome(String s) {

        String longest = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {

                String sub = s.substring(i, j + 1);

                if (isPalindrome(sub)) {

                    if (sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
        }

        return longest;
    }

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}