 class Message
 {
 
  void show(String name)  //method
  {

   int a=10;  // local
   System.out.println(a);

   //System.out.println(Message.a);// local variables can not be called by class name


    Message m = new Message();
   //System.out.println(m.a);//  local variable can't be called by object name


   int b;  //local but no problem in declaration but problem in use
   //System.out.println(b);// error: variable b might not have been initialized


   System.out.println(name);  // although it is a local variable it won't show any error because it is in the function parameter

  }


   Message()   // Constructor 
   {

   int b=20; //local
   System.out.println(b);     
   
   } 


   static      // Block
   {
     
   int c = 30;  //local
   System.out.println(c);
   
   }  

 }




