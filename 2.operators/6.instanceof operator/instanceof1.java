


class Test{}
class Demo{}
class Rise{} 
class Fall extends Rise{}

class Exp
{
    
    public static void main(String[] args)
  {
    
    Test t1=new Test();
    Test t2=new Test();

   System.out.println(t1 instanceof Test);//true
   System.out.println(t2 instanceof Test);//true

   System.out.println();

    Demo d1=new Demo();
    Demo d2=new Demo();

   System.out.println(d1 instanceof Demo);//true
   System.out.println(d2 instanceof Demo);//true

   System.out.println();
 
   //System.out.println(d1 instanceof Test);//error:Demo can not be converted to Test
   //System.out.println(t1 instanceof Demo);//error:Test can not be converted to Demo

     Rise r1=new Rise();
     Rise r2=new Rise();
  
   System.out.println(r1 instanceof Rise);//true
   System.out.println(r2 instanceof Rise);//true
   
   System.out.println();
  
    Fall f1=new Fall();
    Fall f2=new Fall();

   System.out.println(f1 instanceof Fall);//true 
   System.out.println(f2 instanceof Fall);//true

   System.out.println();
 
   System.out.println(f1 instanceof Rise);//true
   System.out.println(r1 instanceof Fall);//false
     
   System.out.println();

     Thread th1=new  Thread();
     Thread th2=new  Thread();

   System.out.println(th1 instanceof Thread);//true
   System.out.println(th2 instanceof Thread);//true
   
   System.out.println();
   
   System.out.println(t1 instanceof Object);
   System.out.println(d1 instanceof Object);
   System.out.println(r1 instanceof Object);
   System.out.println(f1 instanceof Object);
   System.out.println(th1 instanceof Object);
 
 // Object class is a predefined  class which is the parent of the all the predefined and user defined classes.
    






  }

}

   