package com.stock;

public class Stock {
	
	public static int calculateMaxProfit(int[] prices) {
		int maxProfit = Integer.MIN_VALUE;
		int minPrice;
		
		if(prices == null || prices.length < 2)
			return 0;
		
		minPrice = prices[0];
				
		for (int i = 1; i < prices.length; i++) {
			minPrice = Math.min(minPrice, prices[i]);
			
			if(prices[i] - minPrice > maxProfit)
				maxProfit = prices[i] - minPrice;
		}
		
		return maxProfit > 0 ? maxProfit : 0;
	}
	
}
