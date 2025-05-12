class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Check if str1 + str2 equals str2 + str1
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        
        // Get the GCD of the lengths
        int gcdLength = gcd(str1.length(), str2.length());
        
        // The result is the prefix of str1 with length gcdLength
        return str1.substring(0, gcdLength);
    }
    
    // Helper method to compute GCD of two integers
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
