import java.util.*;

class Test1
{
 public static void main(String[] args)
 {

  System.out.println("Hello Good evening to all");

  
  
    int num1= Integer.parseInt(args[0]);

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the second number to devide:");
    int num2= scan.nextInt();

    int result=num1/num2;
    System.out.println("result="+result);

    System.out.println("End of the program");

 }

}  


/*

 Test1--------

Output1 :    
C:\Users\ashis\OneDrive\Desktop\JAVA C SIR\Exception handling\1.try catch>java Test1 18
Hello Good evening to all
Enter the second number to devide:
9
result=2
End of the program
 
Output2 :(ArrayIndexOutOfBoundsException)

C:\Users\ashis\OneDrive\Desktop\JAVA C SIR\Exception handling\1.try catch>java Test1
Hello Good evening to all
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at Test1.main(2.multipletrycatch.java:12)

Output3 :(NumberFormatException)

C:\Users\ashis\OneDrive\Desktop\JAVA C SIR\Exception handling\1.try catch>java Test1 raja
Hello Good evening to all
Exception in thread "main" java.lang.NumberFormatException: For input string: "raja"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:661)
        at java.base/java.lang.Integer.parseInt(Integer.java:777)
        at Test1.main(2.multipletrycatch.java:12)

Output4 :(InputMismatchException)

C:\Users\ashis\OneDrive\Desktop\JAVA C SIR\Exception handling\1.try catch>java Test1 60
Hello Good evening to all
Enter the second number to devide:
rani
Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:947)
        at java.base/java.util.Scanner.next(Scanner.java:1602)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2267)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
        at Test1.main(2.multipletrycatch.java:17)

Output5 :(ArithmeticException)

C:\Users\ashis\OneDrive\Desktop\JAVA C SIR\Exception handling\1.try catch>java Test1 56
Hello Good evening to all
Enter the second number to devide:
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test1.main(2.multipletrycatch.java:19)


*/










class Test2
{
 public static void main(String[] args)
 {

  System.out.println("Hello Good evening to all");
  
  
    try
   {
    int num1= Integer.parseInt(args[0]);

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the second number to devide:");
    int num2= scan.nextInt();

    int result=  num1 / num2;
    System.out.println("result="+result);
   }
  
   catch(ArrayIndexOutOfBoundsException e)
   {

    System.out.println("Yee  !! enter a value at command line");

   }
 
   catch(NumberFormatException e)
   {

    System.out.println("Yee  !! enter a number value at command line");

   }

   catch(InputMismatchException e)
   {
  
    System.out.println("Yee  !! enter a integer number to num2  to devide");

   }

   catch(ArithmeticException e)
   {

    System.out.println("Yee  !!  don't divide the num1 by zero");

   }
   
    
    System.out.println("End of the program");
   

 }

} 
 
/*


 Output1 :(With no Exception)

C:\Users\ashis\OneDrive\Desktop\JAVA C SIR\Exception handling\1.try catch>java Test2 56
Hello Good evening to all
Enter the second number to devide:
8
result=7
End of the program



 
 Output2 :(After ExceptionHandling)

C:\Users\ashis\OneDrive\Desktop\JAVA C SIR\Exception handling\1.try catch>java Test2
Hello Good evening to all
Yee  !! enter a value at command line
End of the program

C:\Users\ashis\OneDrive\Desktop\JAVA C SIR\Exception handling\1.try catch>java Test2 raja
Hello Good evening to all
Yee  !! enter a number value at command line
End of the program

C:\Users\ashis\OneDrive\Desktop\JAVA C SIR\Exception handling\1.try catch>java Test2 50
Hello Good evening to all
Enter the second number to devide:
rani
Yee  !! enter a integer number to num2  to devide
End of the program

C:\Users\ashis\OneDrive\Desktop\JAVA C SIR\Exception handling\1.try catch>java Test2 50
Hello Good evening to all
Enter the second number to devide:
0
Yee  !!  don't divide the num1 by zero
End of the program

*/










