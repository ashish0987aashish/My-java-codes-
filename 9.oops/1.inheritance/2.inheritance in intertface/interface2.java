interface LitInstitute
{
  void joinItCourse();
}

class Java implements LitInstitute
{
 
  public void joinItCourse()
  {
    System.out.println("I am joining java");
  }

}

class Python implements LitInstitute
{
  
  public void joinItCourse()
  {   
    System.out.println("I am joining pyhton");
  }

}

class Oracle implements LitInstitute
{
 
  public void joinItCourse()
  {
    System.out.println("I am joining databse");
  }

}


class Main
{
  public static void main(String[] args)
  {
   // LitInstitute course = new LitInstitute();//  error: LitInstitute is abstract; cannot be instantiated

   LitInstitute course1 = new Java();
   course1.joinItCourse();
  
   System.out.println();
  
   LitInstitute course2= new Python();
   course2.joinItCourse();
 
   System.out.println();
 
   LitInstitute course3= new Oracle();
   course3.joinItCourse();
 
  }

}





   




















































  

