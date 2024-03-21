  class Testfirstar
{
   
      public static void main(String [] args)
      {
         int i1= 15;
         long l1=25;
         //int i= i1+l1;//error: incompitable types: possible lossy conversion from long to int  
          long l= i1+l1;
         System.out.println(l);
  
         char ch1='x';
         char ch2='a';
         //char ch=ch1+ch2;//error: incompitable type: possible lossy conversion from int to char
         int ic=ch1+ch2;
         System.out.println(ic);

         float f1=3.7f;
         float f= f1+l1;
         System.out.println(f);
         double d= f1+l1;
         System.out.println(d);
         
         boolean b1= true;
         boolean b2= false;
         //boolean b3= b1+b2; //bad operand for binary operator    
       }

}
         