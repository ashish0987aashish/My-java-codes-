 class Testfirstnbw
 
 {
 
    public static void main(String [] args)
   
   {
  
      byte b1=10,b2=20;
      short s1=14,s2=15;
      int i1=22,i2=23;
      long l1=43,l2=45;
    
      float f1=2.8f,f2=3.6f;
      double d1=4.2,d2=2.4;

      char ch1='a',ch2='b';

      boolean b3=true,b4=false;
    
     System.out.println(true & true); 
  
     System.out.println();

     System.out.println(b1&b2);
     System.out.println(s1|s2);
     System.out.println(i1^i2);
     System.out.println(l1&l2);

     System.out.println();
     
     //System.out.println(f1&f2);//error: bad operand types for binary operator '&'
     //System.out.println(d1&d2);//error: bad operand types for binary operator '&'

     System.out.println();

     System.out.println(ch1&ch2);
     
     System.out.println();
 
     System.out.println(b3^b4);
   
     System.out.println();
     
     System.out.println(b1&s1);
     System.out.println(i1|l1);

    
     System.out.println();

     System.out.println(i1|ch1);

     System.out.println();
 
    // System.out.println(s1&b3);//error:bad operand
    // System.out.println(b1&b3);//error:bad operand

     
   }

}