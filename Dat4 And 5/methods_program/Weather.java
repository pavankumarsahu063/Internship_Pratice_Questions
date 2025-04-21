package methods_program;
/*create a static method get temp 
 * return 28.05
 * create main method,call the method as the condition in if, if the temp is more then 32.5
 * print heat is high otherwish heat 
 * 
 */

public class Weather
{
	public static double getTemperture()
	{
		return 28.5;
	}
	
	public static void main(String[] args)
	{
		if(getTemperture()>32.5)
		{
			System.out.println("Heat is high");
		}
		else
		{
			System.out.println("modirat heat");
		}
	}

}
