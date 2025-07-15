class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Edge case: empty input
        if (strs == null || strs.length == 0) return "";

        int m = 0;
        String result = "";

        while (true) {
            // Check if index m is within the first string
            if (m >= strs[0].length()) return result;

            // Get the character from the first string at index m
            char c = strs[0].charAt(m);

            // Compare this character with the same position in all other strings
            for (int i = 1; i < strs.length; i++) {
                // If we go out of bounds or characters don't match, return result
                if (m >= strs[i].length() || strs[i].charAt(m) != c) {
                    return result;
                }
            }

            // All strings have the same character at index m → add to result
            result += c;
            m++; // Move to next character position
        }
    }

    // You can include a main method to test it
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] input1 = {"flower", "flow", "flight"};
        String[] input2 = {"dog", "racecar", "car"};

        System.out.println("Output 1: " + solution.longestCommonPrefix(input1)); // "fl"
        System.out.println("Output 2: " + solution.longestCommonPrefix(input2)); // ""
    }
}
