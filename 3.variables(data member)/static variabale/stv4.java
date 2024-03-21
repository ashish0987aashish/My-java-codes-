// "STATIC" VARIABLE CREATES "SINGLE COPY" DIFFERENT OBJECT, BUT "NONSTATIC" VARIABLE "DIFFERENT COPY" FOR DIFFERENT OBJECT

 class Test
{
   static int a=10;
   int b =20;

   public static void main(String[] args)
   {
      
     Test t1= new Test();
     Test t2= new Test();
     Test t3= new Test();
     System.out.println(t1.a+"..."+t2.a+"..."+t3.a);
     System.out.println(t1.b+"..."+t2.b+"..."+t3.b);

     t1.a=111;
     t2.a=222;
     t3.a=333;
     System.out.println(t1.a+"..."+t2.a+"..."+t3.a); // 333...333...333

     t1.b=444;
     t2.b=555;
     t3.b=666;
     System.out.println(t1.b+"..."+t2.b+"..."+t3.b); // 444...555...666

   }


}
    

 