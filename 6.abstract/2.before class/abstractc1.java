/* ABSTRACT CLASS CAN'T BE INSTANCIATED, ABSTRACT METHOD() DOESN'T HAVE BODY AND ENDS WITH SEMICOLON, ABSTRACT METHOD() MUST BE WITHIN ABSTRACT
   CLASS, ABSTRACT CLASS MAY OR MAY NOT CONTAIN ABSTRACT METHOD()  */

abstract class Test
{
  int x=10;
  //abstract void m1(){}//error: abstract methods cannot have a body
  
  abstract void m1();
  static void m2()
  {
   System.out.println("complete method m2()...");
  }
  
  
  public static void main(String[] args)
  {
    //Test t = new Test();//error: Test is abstract; cannot be instantiated
    // t.x;//error: not a statement
     m2();
  }

}
   