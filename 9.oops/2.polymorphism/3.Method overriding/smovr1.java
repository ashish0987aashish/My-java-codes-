// WE CAN'T OVERRIDE STAIC METHOD 


class P
{
  static void m1()
 { 
 }

}


class C extends P
{
  void m1() //  error: m1() in C cannot override m1() in P,    overridden method is static
  {
  }

}

  
  
  