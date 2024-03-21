//  STATIC METHOD CAN BE OVERRIDDEN BY ONLY STATIC METHOD 


class P
{
  static void m1(int a)
  {
    System.out.println("The method of P class is getting overridden");
    System.out.println("The value of local a in P class= "+a);
  }

}


class C extends P
{
  static void m1(int a)
  {
    System.out.println("The method of C class is overridding ");
    System.out.println("The value of local a in C class= "+a);
    
  }

  public static void main(String[] args)
  {
    m1(100);
    System.out.println();
     
    P p = new P();
    p.m1(90);
    
     
  }

}