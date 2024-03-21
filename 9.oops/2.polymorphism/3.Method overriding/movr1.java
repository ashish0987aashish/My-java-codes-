class Parent 
{
  void m1(int a)
  { 
   System.out.println("m1() method of parent class");
   System.out.println("The value of local a of parent "+a);
  }
}
 
class Child extends Parent
{  
  void m1(int a)
  {
   System.out.println("m1() method of child class");
   System.out.println("The value of local a of child "+a);
  }
 
  public static void main(String[] args)
  {
    Parent p = new Child();
    p.m1(200);

    System.out.println();
  
    Child c = new Child ();
    c.m1(100);
  }

}
  
 
   
 