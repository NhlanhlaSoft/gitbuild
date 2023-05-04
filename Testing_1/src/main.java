/**
 * 
 */

/**
 * @author Nhlan
 *
 */
public class main {

	private static void FizzBuzz(int number)
	{
		if(number%15==0 && number%3==0)
		{
			System.out.println("Fizz Buzz");
		}else if(number%5==0) 
		{
			System.out.println("Buzz");
		}else if(number%3==0)
		{
			System.out.println("Fizzz");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =15;
		FizzBuzz(number);
	}

}
