class Test
{

void show(int i,float f)
{
 System.out.println("show() method with int,float...");
}

void show(float k,int a)
{
 System.out.println("show() method with float,int...");
}

public static void main(String [] args)
 {
 
  Test t = new Test();
  
  t.show(10,4.5f);
  t.show(2.4f,9);
  //t.show(45,67);//error: reference to show is ambiguous
  //t.show('c',100);//error: reference to show is ambiguous

 }

}
