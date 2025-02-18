class Solution(object):
    def canPlaceFlowers(self, flowerbed, n):
        """
        :type flowerbed: List[int]
        :type n: int
        :rtype: bool
        """
        if n == 0:
            return True  # If no flowers need to be planted, always return True

        length = len(flowerbed)
        
        for i in range(length):
            if flowerbed[i] == 0:  # Check if the spot is empty
                left_empty = (i == 0 or flowerbed[i - 1] == 0)  # Left boundary or empty
                right_empty = (i == length - 1 or flowerbed[i + 1] == 0)  # Right boundary or empty
                
                if left_empty and right_empty:
                    flowerbed[i] = 1  # Plant a flower
                    n -= 1
                    if n == 0:
                        return True  # If we placed all needed flowers, return early
        
        return n <= 0  # If we placed all required flowers, return True, else False
