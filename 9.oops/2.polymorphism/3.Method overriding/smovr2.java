// OVERRIDDING METHOD CAN'T BE STATIC 

class P 
{
  void m1()
  {
  }

}

class C extends P
{
   static void m1() // error: m1() in C cannot override m1() in P  , overriding method is static
   {
   }

}
   
