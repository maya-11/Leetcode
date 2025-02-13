class Solution(object):
    def findRestaurant(self, list1, list2):
        """
        :type list1: List[str]
        :type list2: List[str]
        :rtype: List[str]
        """
        index_map = {v: i for i, v in enumerate(list1)}  # Create a map of list1: restaurant -> index
        min_sum = float('inf')  # Start with a large number for the minimum index sum
        result = []

        for j, restaurant in enumerate(list2):
            if restaurant in index_map:  # Check if the restaurant is also in list1
                index_sum = j + index_map[restaurant]  # Calculate the index sum
                if index_sum < min_sum:  # New minimum index sum found
                    min_sum = index_sum
                    result = [restaurant]  # Update result with the new minimum
                elif index_sum == min_sum:  # Same minimum index sum, add to result
                    result.append(restaurant)

        return result
