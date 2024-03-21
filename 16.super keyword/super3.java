// "super" keyword is used to call super class constructor()

class Parent
{
 
  Parent(int a)
  {
   System.out.println("Parent() constructor...");
  }

}

class Child extends Parent
{
  Child()
  {
   super(10);
   System.out.println("Child() constructor...");
  }    
   
  public static void main(String[]  args)
  {
   new Child();
  }
 
}

  