class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // If concatenating in both orders results in different strings, there is no common divisor
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        
        // Otherwise, the GCD string has the length equal to the GCD of str1.length() and str2.length()
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }
    
    // Helper function to compute GCD of two numbers
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
