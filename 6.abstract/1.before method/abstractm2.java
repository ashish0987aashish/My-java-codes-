//EXAMPLE OF ABSTRACT METHOD USING ANONYMOUS CLASS 

abstract class Thaunriafamily 
{
  abstract void padmalochan();
   
  void chandrasekhar()
  {
   System.out.println(" method chandrasekhar() is already complete");
  }

  public static void main(String[] args)
  {
    Thaunriafamily tf1= new Thaunriafamily()    
    {
     void padmalochan()
     {
      System.out.println("method padmalochan() is getting completed in anonymous class");
     }

    };


    Thaunriafamily tf2 = new Thaunriafamily()
    {
      void padmalochan()
     {
      System.out.println("method padmalochan() is getting updated in another anonymous class");
     }  

    };


     /* Thaunriafamily tf3 = new Thaunriafamily()
        {}; */ //error: <anonymous Thaunriafamily$3> is not abstract and does not override abstract method padmalochan() in Thaunriafamily

    tf1.chandrasekhar();
    tf1.padmalochan();
    tf2.chandrasekhar();
    tf2.padmalochan();
  }


}
  
   
       
  
  
  
   
 