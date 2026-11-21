public class PrintArguments {
static void demo(String[] args)	
{
try{
		for (int i = 0; i <= args.length; i++) {
    System.out.println("Argument " + (i + 1) + ": " + args[i]);
}

System.out.println("Number of arguments: " + args.length);
}
catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("your limit is over .Dont insert out of the limit");
		}
}
    public static void main(String[] args) {
System.out.println("Number of arguments: " + args.length);

        /*for (int i = 0; i <=args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);

        } */
    demo(args);
    }
	
}
/*public class PrintArguments{
	 static void hello()
	{
		System.out.println("hello world");
	}
	public static void main(String[] args)
	{
		//PrintArguments a=new PrintArguments();
		hello();
	}
}*/