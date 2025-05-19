class Testboxing
{
   
    public static void main(String [] args)
   {
       int a=10;//primitive type
       System.out.println(a);//10
  
     Integer b = new Integer(a);//boxing (forcefully)
    System.out.println(b);//10

       
    int c = b.intValue();//unboxing (forcefully)
   System.out.println(c);//10

     Integer d = c; //auto boxing (automatic)
   System.out.println(d);//10
   
   int e=d;//auto unboxing (automatic)
   System.out.println(e);//10




    /* BOXING AND UNBOXING USING "valueOf()  " utility method */



   char ch1='a';
   Integer x= Integer.valueOf(ch1);//boxing (forcefully)
   System.out.println(x);//97
   
   int i1=30;
   Integer i2=Integer.valueOf(i1);//boxing (forcefully)
   System.out.println(i2);//30
   
   Character ch3='b';
   int i5=Integer.valueOf(ch3);//unboxing(forcefully)
   System.out.println(i5);//98


   Integer i3=19;
   int i4= Integer.valueOf(i3);//unboxing (forcefully)
   System.out.println(i4);//19

     
   }
}
      
  
