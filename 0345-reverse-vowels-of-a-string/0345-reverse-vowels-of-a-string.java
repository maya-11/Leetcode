class Solution {
    public String reverseVowels(String s) {
        // Convert the string to a char array to modify it
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        // Set of vowels
        String vowels = "aeiouAEIOU";

        while (left < right) {
            // Move left pointer until it finds a vowel
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            // Move right pointer until it finds a vowel
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }

            // Swap the vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move pointers inward
            left++;
            right--;
        }

        // Convert char array back to string
        return new String(chars);
    }
}
