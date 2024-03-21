interface A  // 100% abstract 
{
 void m1();
 void m2();
}


abstract class B // 0-100% abstraction 
{
 void m3()
 {
  System.out.println("m3() method of abstract class B");
 }

 abstract void m4();
}

 
class C extends B implements A // 0% abstraction 
{

 void m5()
 {
  System.out.println("m5() method of complete class C");
 }

 public void m1()
 {
  System.out.println("m1() method of A interface"); 
 }

 public void m2()
 {
  System.out.println("m2() method of A interface");
 }

 void m4()
 {
  System.out.println("m4() method of abstract class B");
 }
}



class Test 
{
 public static void main(String[] args)
 { 
 
  C obj = new C();
 
  obj.m1();
  obj.m2(); 
  obj.m3();
  obj.m4(); 
  obj.m5();
 }

}
     
  

 
 
 
 






