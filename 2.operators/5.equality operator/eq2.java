

class Demo{}
class Test{}
class Testsecondeq
 
{
     public static void main(String [] args)
     {
       
       Test t1= new Test();
       Test t2= new Test();
       System.out.println(t1==t2);
     
       System.out.println();
 
       Demo d1= new Demo();
       Demo d2= new Demo();
       System.out.println(d1==d2);

       System.out.println();
    
       Thread th1= new Thread();
       Thread th2= new Thread();
       System.out.println(th1==th2);
     
       System.out.println();
   
       //System.out.println(t1==d1);//incompitable type: Test and Demo  

       System.out.println();
   
       Object obj1= new Object();
       Object obj2= new Object();
       System.out.println(obj1==obj2);

       System.out.println();

       System.out.println(obj1==t1);//it won't show any error because object is parent of all the predefined and userdefined  classes
       System.out.println(obj1==th1);
         


  
     }

}






       
       
       
    