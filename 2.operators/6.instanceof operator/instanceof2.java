/*  for any class or interface X, null instanceof X  is false */

class Demo{}
class Message{}
class Test 
{
  
  public static void main(String[] args)
  {
  
   System.out.println(null instanceof Test);
   System.out.println(null instanceof Demo);
   System.out.println(null instanceof Message);
   System.out.println(null instanceof java.lang.Thread);
   System.out.println(null instanceof java.io.BufferedReader);
   System.out.println(null instanceof java.lang.Object);
  
  }

}