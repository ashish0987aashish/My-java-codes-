//Example to add between two number by using returntype of method

class Test 
{
 int show()
 {
   return 100;
 }

 int display()
 {
    return 200;
 }

 public static void main(String[] args) {
    Test t = new Test();
    int x=t.show();
    int y=t.display();
    System.out.println("Addition ="+(x+y));
 }

}