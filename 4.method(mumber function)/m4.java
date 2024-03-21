 // EXAMPLES OF METHOD EXCEPTING PRIMITIVES AS PARAMETERS AND HOLDING THE PARAMETER VALUE AND DISPLAYING THEM


class Test
{

  void m1(int x)
   {
   System.out.println("m1() method with 1 argument");
   System.out.println("the value of x="+x);
   }

   void m2(int a,byte b)
   {
   System.out.println("m2() method with 2 arguments");
   System.out.println("the value of a="+a);
   System.out.println("the value of b="+b);
   }

   void m3(short s,int i,double d)
   {
   System.out.println("m3() method with 3 arguments");
   System.out.println("the value of s="+s);
   System.out.println("the value of i="+i);
   System.out.println("the value of d="+d);
   }

  public static void main(String[] args)
  {
    Test t= new Test();


    t.m1(100);

    System.out.println();

    t.m2(56,(byte)45);
   
    System.out.println();
   
    t.m3((short)78,34,7.9);

   }


 }     
  
    
      
  
 
   

  
  
 
    
 
   