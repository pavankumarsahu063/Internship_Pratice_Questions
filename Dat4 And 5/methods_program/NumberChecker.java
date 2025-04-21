package methods_program;

/*create a static method check with an intger arument
 * check wether given number is even or odd 
 * print the output in below format
 * for ex:input is 5 o/p 5 is odd number
 *        i/n 8 o/p:8 is even number
 *
 */
public class NumberChecker
{
	public static void evenOdd(int n)
	{
	   if(n%2==0)
	   {
		   System.out.println(n+"is even number");
	   }
	   else
	   {
		   System.out.println(n+"is a odd number")
	   }
	}

}
