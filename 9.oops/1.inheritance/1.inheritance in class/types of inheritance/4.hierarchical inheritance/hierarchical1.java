// EXAMPLE OF HIERARCHICAL INHERIATNCE 

class A
{
 int a=10;
}

class B extends A
{
 int b=20;
}

class C extends A
{
 int c=30;
}

class D extends A
{
 int d=40;
}

class Test
{
 public static void main(String[] args)
 {
 
  A obj1 = new A();
  System.out.println("The value of a is "+a+" (through object of A class)");

  B obj2 = new B();
  System.out.println("The value of a is "+a+" (through object of B class)");
  System.out.println("The value of b is "+b+" (through object of B class)");

  C obj3 = new C();
  System.out.println("The value of a is "+a+" (through object of C class)");
  System.out.println("The value of c is "+c+" (through object of C class)");

  D obj4 = new D();
  System.out.println("The value of a is "+a+" (thorugh object of D class)");
  System.out.println("The value of d is "+a+" (through object of D class)");
  
 }

}










