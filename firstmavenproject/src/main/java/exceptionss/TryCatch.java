package exceptionss;

public class TryCatch {
	
	public static void main(String[] args) {
		System.out.println("Starting of the prgram");
		try
		{
			int a=28/0;
			System.out.println("a"+a);
		
		}
		catch(ArithmeticException var) //give Exception
		{
		int b=5;
		int a=28/b;
		System.out.println("a: "+a);
		//System.out.println(var);
		}
			
			System.out.println("end of the prgram");
			}
}
	