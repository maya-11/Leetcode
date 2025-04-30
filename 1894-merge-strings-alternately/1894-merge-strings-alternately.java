class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;
        int len1 = word1.length(), len2 = word2.length();

        while (i < len1 && j < len2) {
            merged.append(word1.charAt(i++));
            merged.append(word2.charAt(j++));
        }

        // Append the rest of the characters if any
        while (i < len1) {
            merged.append(word1.charAt(i++));
        }

        while (j < len2) {
            merged.append(word2.charAt(j++));
        }

        return merged.toString();
    }
}
