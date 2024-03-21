// VARAG'S METHOD CAN TAKE ANY NUMBER OF ARGUMENTS

 class Test
 {
 
  static void add(int...x)
  {
   int sum=0;
    
   for(int i=0;i<x.length;i++)
   {
    sum= sum+x[i];
   }

   System.out.println("The sum is "+sum);
  }    
    
  public static void main(String[] args)
  {
   Test.add(10,20);
   Test.add(1,2,3);
  }

 }
  
  
  