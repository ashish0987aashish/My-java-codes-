class Test
{
   
 final static int a=10;
 final int b=20;
 //final int c;//  error: variable c not initialized in the default constructor  

 public static void main(String[] args)
 {
 final int c;
 //System.out.println(c);// error in line 10, error: variable c might not have been initialized 

 System.out.println(Test.a);
 //a=16;//  error: cannot assign a value to static final variable a

 Test t = new Test();
 System.out.println(t.b);
 //t.b=19;// error: cannot assign a value to final variable b
 
 

 }

} 