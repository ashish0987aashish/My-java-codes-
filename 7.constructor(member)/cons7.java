//EXAMPLE OF INITIALIZING OBJECT BY CALLING CONSTRUCTOR

class Testc7
{

  static Testc7 t;
  int x=10;
  
  public static void main(String [] args)
  {
 
  System.out.println(t);//null
  //System.out.println(t.x);//NullPointerException
  t=new Testc7();
  System.out.println(t);//Testc7@2f92e0f4
  System.out.println(t.x);//10

  }


}
