//EXAMPLE AND PROOF OF NAMED OBJECT IS BETTER THAN ANONYMOUS OBJECT 

class Bus
{
 
  void student1()
  {
    System.out.println("student1");
  }
 
  void student2()
  {
    System.out.println("student2");
  }
 
  void student3()
  {
    System.out.println("student3");
  }

  Bus()
  {
    System.out.println("Bus () constructor...");
  }

  public static void main(String [] args)
  {
 
   Bus trip = new Bus();
   trip.student1();   
   trip.student2();
   trip.student3();
 
   System.out.println();

   new Bus().student1();
   new Bus().student2();
   new Bus().student3();

 }

}
 