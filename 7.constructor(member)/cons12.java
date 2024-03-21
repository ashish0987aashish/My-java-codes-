// EXAMPLE OF PRIVATE CONSTRUCTOR() AND FACTORY METHOD()

 class Litcollege
 {
   String fname= "Sushant sir";
 }



 class Lit
 {
   String fname= ("Moon sir");
     
   private Lit()// private constructor
   {}
   
   static Lit mlit()//static factory method() 
   {
     Lit institute = new Lit();
     return institute;
   }
     
   Litcollege mlitcollege()//non-static factory method()
   {
     Litcollege college = new Litcollege();
     return college;
   }

}
 
  class Jt
  {
    public static void main(String[] args)
    {
      Lit sir = Lit.mlit();
      System.out.println(sir.fname);

      System.out.println();
  
      Litcollege clgsir = sir.mlitcollege();
      System.out.println(clgsir.fname);
    }
     
   }
   
         







