package methods_program;

/*
 * create a non static method calcute profit
 * the method will take cost orice and seling price as input and itreturn the profit
 * create main method call the mathod directly from print statement to print the profit
 */
public class BookStore 
{
	public double calcluteProfit(int selling_Price,double cost_Price)
	{
		double profit = selling_Price-cost_Price;
		return profit;
	}
	public static void main(Strings[] args)
	{
		BookStore bs = new BookStore();
		System.out.println(bs.calculteprofit(250.5,300));
	}
}
