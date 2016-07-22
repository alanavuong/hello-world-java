package greetings;

public class MessageConditions 
{
	public MessageConditions()
	{
		
	}
	
	public void countMessage(int quantity)
	{
		if(quantity > 5)
		{
			System.out.println("Too much!");
		}
		else
		{
			System.out.println("Reasonable");
		}
	}
}
