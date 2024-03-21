class Parent 
{
  int a=10;
}

class Child extends Parent
{
 int b=20;
 
public static void main(String [] args)
{
 
  Parent p = new Parent();
  System.out.println(p.a);//10
 //System.out.println(p.b);//error : cannot find symbol

  System.out.println();

  Child c= new Child();
  System.out.println(c.a);//10
  System.out.println(c.b);//20
  
  System.out.println();

  Parent p1 = new Child();
  System.out.println(p1.a);//10
  //System.out.println(p1.b);//error : cannot find symbol
 
  System.out.println();

  //Child c1=(Child)new Parent();//ClassCastException
  //System.out.println(c1.a);
  //System.out.println(c1.b);  



 
}


}
   
