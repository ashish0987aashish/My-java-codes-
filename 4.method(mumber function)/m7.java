class Evaluation 
{
	void calculate(int x,int y)
	{
		System.out.println("calculate() method...");
		System.out.println("Addition ="+(x+y));
	}
	
	public static void main(String[] args)
	{
		Evaluation evaluate = new Evaluation();
		evaluate.calculate(100,10); // by using primitive value
		
		System.out.println();
		
		int a=200,b=20;
		evaluate.calculate(a,b); // by using variable
		
		System.out.println();
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Enter the value for first parameter:");
		int p = sc.nextInt();
		
		System.out.println("Enter the value for the second parameter:");
		int q= sc.nextInt();
		
		evaluate.calculate(p,q); // by using runtime input
		 
	}
}



/*  output :

calculate() method...
Addition =110

calculate() method...
Addition =220

Enter the value for first parameter:
300
Enter the value for the secomnd parameter:
30
calculate() method...
Addition =330  */



 












 