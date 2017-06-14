public class HelloWorld
{
	public static void main (String [] args)
	{
		System.out.println("hello my brave new world (changed message text)");
		if (args.length == 0)
		{
			System.out.println("\nNothing to say?");
		} else {
			System.out.println("\nWhat do you mean by "+args[0]+"?");
		}
	}
}
