class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        """
        :type candies: List[int]
        :type extraCandies: int
        :rtype: List[bool]
        """
        max_candies = max(candies)  # Find the maximum candies any kid currently has
        return [candy + extraCandies >= max_candies for candy in candies]  # Check condition for each kid

# Example usage:
solution = Solution()  # Create an instance of the Solution class
candies = [2, 3, 5, 1, 3]
extraCandies = 3
print(solution.kidsWithCandies(candies, extraCandies))  # Output: [True, True, True, False, True]
