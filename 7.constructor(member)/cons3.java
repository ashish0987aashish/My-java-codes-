//EXAMPLE OF  REFERENCE AND OBJECT

class Testc3
{
 
  int x=100;
  static Testc3 t1;//static reference 
  Testc3 t2;//non-static reference 

  public static void main(String [] args)
 {

   Testc3 t3;//local reference 
   
   System.out.println(t1);//null
   System.out.println(Testc3.t1);//null
   
   //System.out.println(t1.t2);//NullPointerException
   System.out.println( new Testc3().t2);//null
 
   t3= new Testc3().t2;
   System.out.println(t3);//null

   System.out.println();

   t1=new Testc3();
   System.out.println(t1);//Testc3@2f92e0f4
   
   t1.t2=new Testc3();
   System.out.println(t1.t2);//Testc3@28a418fc

   t3=new Testc3();
   System.out.println(t3);//Testc3@5305068a

   System.out.println();

   System.out.println(t1.x);
   System.out.println(t1.t2.x);
   System.out.println(t3.x);   

}


}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
  

  
   
 