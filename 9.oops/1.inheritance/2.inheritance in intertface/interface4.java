// ANOTHER EXAMPLE OF MULTIPLE INHERITANCE 


interface A
{
void m1();
}


interface B
{
void m2();
}

interface C extends A,B
{
void m3();
}


class Test implements C
{

  public void m1()
  {
   System.out.println("m1() method of A interface");
  }
 
  public void m2()
  {
   System.out.println("m2() method of B interface"); 
  }

  public void m3() 
  {
   System.out.println("m3() method of C interface");
  } 

   
  public static void main(String[] args)
  {
    
    A obj1 = new Test();
    B obj2 = new Test();
    C obj3 = new Test();  
  
 
    obj1.m1(); 
    obj2.m2();
    obj3.m3();

  }

}   
    
 
   
  
 
 
  
 
 
