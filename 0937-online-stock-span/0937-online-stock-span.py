class StockSpanner(object):

    def __init__(self):
        self.stack = []  # stores pairs of (price, span)

    def next(self, price):
        """
        :type price: int
        :rtype: int
        """
        span = 1
        # While previous prices are less than or equal to current
        while self.stack and self.stack[-1][0] <= price:
            span += self.stack.pop()[1]
        
        self.stack.append((price, span))
        return span
