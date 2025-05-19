public class Solution {
    public int compress(char[] chars) {
        int write = 0;  // Write index
        int i = 0;      // Read index

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count consecutive characters
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // Write the count if more than 1
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}
