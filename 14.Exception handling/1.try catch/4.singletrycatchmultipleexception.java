class Test1
{

 public static void main(String [] args)
 {
 
  System.out.println("Hello");

  System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
  
  System.out.println("Chaloo");



/*


Output1  :(ArrayIndexOutOfBoundsException)

C:\Users\ashis\OneDrive\Desktop\JAVA C SIR\Exception handling\1.try catch>java Test1
Hello
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at Test1.main(4.singletrycatchmultipleexception.java:9)



Output2  :(NumberFormatException)

C:\Users\ashis\OneDrive\Desktop\JAVA C SIR\Exception handling\1.try catch>java Test1 raja
Hello
Exception in thread "main" java.lang.NumberFormatException: For input string: "raja"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:661)
        at java.base/java.lang.Integer.parseInt(Integer.java:777)
        at Test1.main(4.singletrycatchmultipleexception.java:9)


Output3  :(ArithmeticException)

C:\Users\ashis\OneDrive\Desktop\JAVA C SIR\Exception handling\1.try catch>java Test1 54 0
Hello
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test1.main(4.singletrycatchmultipleexception.java:9)


Output4  :(no Exception)

C:\Users\ashis\OneDrive\Desktop\JAVA C SIR\Exception handling\1.try catch>java Test1 54 9
Hello
6
Chaloo

*/


 }

}




class Test2
{

  public static void main(String [] args)
  {
    
    System.out.println("Hello");
    
    try
    {
 
   System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[1]));
    
    }

    catch(ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e)
    {

    System.out.println("Don't worry !  Exception is handled,mind your inputs in command line");
   
    }

    System.out.println("Chaloo");
   }




/*
 
Output1 :(With Handled Exception)

C:\Users\ashis\OneDrive\Desktop\JAVA C SIR\Exception handling\1.try catch>java Test2
Hello
Don't worry !  Exception is handled,mind your inputs in command line
Chaloo

C:\Users\ashis\OneDrive\Desktop\JAVA C SIR\Exception handling\1.try catch>java Test2 raja
Hello
Don't worry !  Exception is handled,mind your inputs in command line
Chaloo

C:\Users\ashis\OneDrive\Desktop\JAVA C SIR\Exception handling\1.try catch>java Test2 40 0
Hello
Don't worry !  Exception is handled,mind your inputs in command line
Chaloo


Output2  :(With no Exception)
C:\Users\ashis\OneDrive\Desktop\JAVA C SIR\Exception handling\1.try catch>java Test2 40 4
Hello
10
Chaloo
 
*/




}



















 


