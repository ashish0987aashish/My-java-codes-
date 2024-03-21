class Krushna

{

 private String daughter = "Radha";
 
  String take_daughter()
  {
    return daughter;
  }

}

 class Kansha
{
   
  public static void main(String [] args)
  {
    
     Krushna kanha = new Krushna();
     //System.out.println(kanha.daughter);//error: daughter has private access in Krushna
  
     String name= kanha.take_daughter();
     System.out.println("name is "+name);
      
  }
     
}  
  
   