class Test 
{
 void m1()
 {
  System.out.println("m1() method of parent class");
 }
 
 void m2() 
 {
  System.out.println("m2() method of parent class"); 
 }

}


 
class Demo extends Test
{
 
 void m1()
 {
  System.out.println("m1() method of child class"); 
 }
 
 void m3()
 {
  System.out.println("m3() method of child class");
 }

 public static void main(String[] args ) 
 {

   System.out.println("parent class reference holding child class object");
   
   Test t1 = new Demo();  //upcasting  
   t1.m1(); 
   t1.m2();
   //t.m3();//  error: cannot find symbol

   System.out.println(); 

   System.out.println("parent class reference holding parent class object"); 
   Test t2 = new Test();
   t2.m1(); 
   t2.m2();

   //Demo d = new Test();//  error: incompatible types: Test cannot be converted to Demo

   Demo d = (Demo) new Test();// ClassCastException: class Test cannot be cast to class Demo (Test and Demo are in unnamed module of loadr'app')
  


 }

}







    


 

    
 