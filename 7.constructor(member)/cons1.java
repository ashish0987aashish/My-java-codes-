 class Testc1
 {
          

    static void Testc1()
    {
    System.out.println("Testc() method ......");      
    }
  
    Testc1()
    {
    System.out.println(" Test() constructor ........");
    }
    
    public static void main(String [] args)
    {

     Testc1();
     Testc1.Testc1();
     new Testc1().Testc1();
     Testc1 t= new Testc1();
     t.Testc1();
     
    }

    
} 
        

