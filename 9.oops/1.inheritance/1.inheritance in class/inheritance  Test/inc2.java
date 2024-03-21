//EXAMPLE OF 'MEMBER SEARCH'---"FROM CHILD TO PARENT" , 'OBJECT CREATION'---"FROM PARENT TO CHILD"

class Parent 
{
 
  Parent()
 {
   System.out.println("Parent() constructor");
 }

  void m1()
 {
   System.out.println(" m1() method of parent class");
 }    
 
}
 
 class Child extends Parent
{
 
 Child()
 {
   System.out.println("Child() constructor");
 }

  void m1()
 {
   System.out.println(" m1() method of child class");
 }
 
}
 
class Test
{
   public static void main(String [] args) 
    {
       Child c= new Child();
       c.m1();
    }
}
   
       
     
      
   
 
   


  