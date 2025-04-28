class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;
        
        // Merge letters alternately
        while (i < word1.length() && j < word2.length()) {
            merged.append(word1.charAt(i++));
            merged.append(word2.charAt(j++));
        }
        
        // Append the rest of the longer string
        while (i < word1.length()) {
            merged.append(word1.charAt(i++));
        }
        
        while (j < word2.length()) {
            merged.append(word2.charAt(j++));
        }
        
        return merged.toString();
    }
}
