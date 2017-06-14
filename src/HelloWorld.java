public class HelloWorld
{
	public static void main (String [] args)
	{
		System.out.println("hello my brave new world (changed message text)");
		if (args[0] == null)
		{
			System.out.println("What do you mean by "+args[0]+"?");
		}
	}
}
