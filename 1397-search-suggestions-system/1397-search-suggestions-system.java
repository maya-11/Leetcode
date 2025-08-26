import java.util.*;

class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products); // Step 1: sort lexicographically
        List<List<String>> result = new ArrayList<>();
        int n = products.length;

        String prefix = "";
        int left = 0, right = n - 1;

        // Step 2: For each character typed in searchWord
        for (char c : searchWord.toCharArray()) {
            prefix += c;

            // Narrow search range using binary search
            while (left <= right && !products[left].startsWith(prefix)) left++;
            while (left <= right && !products[right].startsWith(prefix)) right--;

            // Collect up to 3 suggestions
            List<String> suggestions = new ArrayList<>();
            for (int i = left; i < Math.min(left + 3, right + 1); i++) {
                suggestions.add(products[i]);
            }
            result.add(suggestions);
        }
        return result;
    }
}
