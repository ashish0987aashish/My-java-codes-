class Testc6
{

 int x=120;
 
 Testc6(int x)
 {
    System.out.println("Testc6() constructor .......");
    System.out.println("The value of local x ="+x);
   
 }

 void Testc6()
 {
 
    System.out.println("Testc6() method ..........");
  
 }

   public static void main(String [] args)
   {
      Testc6 t =new Testc6(100);
       
      System.out.println("The value of non static x ="+(t.x));
 
      new Testc6(150).Testc6();
   }



}      
      

   

 

 

  
  