// super keyword is used to invoke super class variable 

class Parent 
{
  int a =10;
}

 
class Child extends Parent
{
  int a= 20;
  
  void m1()
  {
    int a=30;
  
    System.out.println(a);
    System.out.println(this.a);
    System.out.println(super.a);
   
  }
   public static void main(String[] args)
   { 
    new Child().m1();
   }

}
   
   
 