# The maximum profit selling stock using dynamic programming
** The stock has a price each day, what's the max profit is it possible to gain buying and selling the stock? **  
** It shows a solution with O(n) as time complexity.   It is implemented in Java**

You have an array in which the i'th element is the price of a stock on day 'i'. What is the maximum profit you can gain doing at most 1 transaction (buy once and sell once)?  
Note that you cannot sell a stock before you buy one.

** Example: **
array = [8 , 1 , 2 , 4 , 6 , 3]   
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;0 &nbsp;  1 &nbsp;  2 &nbsp;  3 &nbsp;  4 &nbsp;  5

The maximum profit is 5. If you buy on day 1 = 1 and sell on day 4 = 6.

A possible approach the would come to mind is to calculate for all elements combination and keep the highest profit.

** Pseudo Code: **

var highestProfit: 0;  
For i = 0 to array.length   
&nbsp;&nbsp;j = i + 1;  
&nbsp;&nbsp;For j to array.length  
&nbsp;&nbsp;&nbsp;&nbsp;highestProfit = max(highestProfit, array[j] - array[i]);

** We will get a time complexity like O(n ^ 2). **

** How to get a solution with O(n) as time complexity? **  
It is possible to use Dynamic Programming, identifying the logic that is possible to reuse. Let's take a look:

Some possibilities:  
1. Buy on day 0=8 and sell on day 2=2 getting a loss of 6 units. 
2. Buy on day 1=1 and sell on day 3=4 getting a profit of 3 units. 
3. Buy on day 4=6 and sell on day 5=3 getting a loss of 3 units.
4. Buy on day 1=1 and sell on day 4=6 getting a profit of 5 units.

** Important observations:**  
 - It going to have a profit just if the buying price is lower than the selling price, in array words, the "i" element must be greater than the previous "i". Like in possibilities 2 and 4. 
 - The maximum profit is related to buy with the minimum price and sell it someday. In array words, it means that the profit related to "i" is the profit between "i" and the minimum price before i. Like in the possibility 4.

**  Pseudo Code: ** 

var maxProfit = N/A; ** //Start with the minimum possible value**  
var minPrice = array[0];

For i = 1 to array.length  
&nbsp;&nbsp; minPrice = min(minPrice, array[i]); ** //Keep the minimum price until i**  
&nbsp;&nbsp; if(prices[i] - minPrice > maxProfit)  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; maxProfit = prices[i] - minPrice;
