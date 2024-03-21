import java.util.*;

class Test1
{
 public static void main(String [] args)
 {
   System.out.println(" Hello ! Good morning");
  
    int num1= Integer.parseInt(args [0]);
   Scanner scan = new Scanner(System.in);
 
    System.out.println("Enter  the 2nd number to divide : ");
    int num2= scan.nextInt();
 
    int result= num1/num2;
    System.out.println("result="+result);

    System.out.println("End of program");


   /*

 Output: 1(Without Exception)
   
 C:\Users\ashis\OneDrive\Desktop\JAVA C SIR\Exception handling\1.try catch>java Test1 56
 Hello ! Good morning
 Enter  the 2nd number to divide :
 8
 result=7
 End of program
  
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

  }

}



class Test2
{
 public static void main(String [] args)
 {
   System.out.println(" Hello ! Good morning");
  try
   {
    int num1= Integer.parseInt(args [0]);
   Scanner scan = new Scanner(System.in);
 
    System.out.println("Enter  the 2nd number to divide : ");
    int num2= scan.nextInt();
 
    int result= num1/num2;
    System.out.println("result="+result);
   }

  //catch(Object o)//  incompatible types: Object cannot be converted to Throwable  catch(Object e)

 // catch(Throwable t)//possible
   
    catch(Exception e)
  {
    System.out.println("Exception found,and handled by the parent class");
  }
        


    System.out.println("End of program");


 Output:
   
C:\Users\ashis\OneDrive\Desktop\JAVA C SIR\Exception handling\1.try catch>java Test2
 Hello ! Good morning
Exception found,and handled by the parent class
End of program

 
  }

}



    
   
  
  
  