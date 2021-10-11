package com.stock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StockTest {

	@Test
	public void nullInputTest() {
		assertEquals(Stock.calculateMaxProfit(null), 0, "There is no profit with a null input!");
	}
	
	@Test
	public void lessThan2PricesTest() {
		int[] prices = {8};
		assertEquals(Stock.calculateMaxProfit(prices), 0, "There is no profit with input with less than 2 prices!");
	}
	
	@Test
	public void withoutProfitJust2PricesTest() {
		int[] prices = {2,1};
		assertEquals(Stock.calculateMaxProfit(prices), 0, "There is no profit!");
	}
	
	@Test
	public void minimumPriceFirstElementTest() {
		int[] prices = {1,2};
		assertEquals(Stock.calculateMaxProfit(prices), 1, "The profit is wrong!");
	}
	
	@Test
	public void samePricesTest() {
		int[] prices = {1,1,1,1,1,1};
		assertEquals(Stock.calculateMaxProfit(prices), 0, "There is no profit with same prices!");
	}
	
	@Test
	public void withoutProfitTest() {
		int[] prices = {8,7,6,5,4,3};
		assertEquals(Stock.calculateMaxProfit(prices), 0, "There is no profit!");
	}
	
	@Test
	public void profitTest() {
		int[] prices = {8,1,2,4,6,3};
		assertEquals(Stock.calculateMaxProfit(prices), 5, "The profit is wrong!");
	}
}
