// EXAMPLE OF METHOD() EXCEPTING "CLASS" AS RETURNTYPE


class Demo
{} 
class Message
{}
class Lit
{}

class Test
{

 Demo m1()
 {  
  System.out.println("m1() method...");
  Demo d= new Demo();
  return d; 
 }

 static Message m2()
 {  
  System.out.println("m2() method...");
  Message m=new Message();
  return m;
 }

  
 Lit m3()
 {
 System.out.println("m3() method...");
 Lit college = new Lit();
 return college;
 }

 public static void main(String[] args)
 {
   Test t = new Test();
    
    Demo d = t.m1();
    System.out.println("m1() method returns value "+d);
  
    System.out.println();

    Message hi=Test.m2();
    System.out.println("m2() method returns value "+hi);
  
    System.out.println();

    Lit institute = t.m3();
    System.out.println("m3() method returns value "+institute);

 }


}   

    
 
  
  
 


      

  
 









