class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min_price = math.inf
        max_profit = 0

        for price in prices:
            if price < min_price:
                min_price = price
            
            curr_profit = price - min_price
            if curr_profit > max_profit:
                max_profit = curr_profit
        
        return max_profit
            