//1. Within a class if local and instance variable are same name then "This" keyword refers to instance variable


class Test
{
  int i=10;
  void m1(int i)
  {
   System.out.println(i);
   System.out.println(this.i);
  }
   
  public static void main(String[] args)
  {
   new Test().m1(40);
  }

}
 
  
  
   
  