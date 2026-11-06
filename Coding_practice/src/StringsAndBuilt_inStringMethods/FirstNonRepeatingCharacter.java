package StringsAndBuilt_inStringMethods;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "loveleetcode";

        int[] freq = new int[26];

        // Step 1: Count frequency
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            freq[ch - 'a']++;
        }

        // Step 2: Find first non-repeating character
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (freq[ch - 'a'] == 1) {

                System.out.println("First Non-Repeating Character: " + ch);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character");
        }
    }
}