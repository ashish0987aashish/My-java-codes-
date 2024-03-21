   //METHOD EXPECTING OBJECT AS PARAMETER AND DISPLAY ALL PARAMETER VALUE

class Course
{}
class Book 
{} 
class Pen
{} 
 
class X
{}
class Y
{}

class Chandra
{}
class Surya
{} 

class Message
{

 void show(Course c,Book b,Pen p)
 {
 System.out.println("show() method with 3 arguments");
 System.out.println("..............................");
 System.out.println("The value of c="+c);
 System.out.println("The value of b="+b);
 System.out.println("The value of p="+p);
 }

 static void display(X x,Y y,String s)
 {
 System.out.println("display() method with 3 arguments");
 System.out.println(".................................");
 System.out.println("The value of x="+x);
 System.out.println("The value of y="+y);
 System.out.println("The value of s="+s);
 }

 void fun(Chandra cool,Surya hot)
 {
 System.out.println("fun() method with 2 arguments");
 System.out.println(".............................");
 System.out.println("The value of cool="+cool);
 System.out.println("The value of hot="+hot);
 }

 public static void main(String[] args)
 {
   Message m = new Message();

   Course java = new Course();
   Book alzebra = new Book();
   Pen parker = new Pen();
   m.show(java,alzebra,parker);

   System.out.println();

   X x = new X();
   Y y = new Y();
   Message.display(x,y,"raj");

   System.out.println();

   Chandra sir = new Chandra();
   Surya student = new Surya();
   m.fun(sir,student);

 }


}
   
   
 
  
   
   
 








 
  







  
  

