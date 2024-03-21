// WE CANNOT OVERRIDE FINAL METHOD 

class P
{
   final void m1()
   {}

}

class C extends P
{

 void m1() //m1() in C cannot override m1() in P   // overridden method is final
 {
 }


}
