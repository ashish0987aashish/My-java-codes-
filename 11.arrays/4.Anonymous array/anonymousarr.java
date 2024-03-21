class Anonymousarray
{

   int sum(int[] a)
   {
    int s=0;
   
     for(int i:a)
     {
       s= s+i;      
     }

     return s;
    }
 
   public static void main(String[] args)
   {
      
    Anonymousarray arr = new Anonymousarray();  

   System.out.println(arr.sum(new int[]{1,2,3,4})); // anonymousarray

    }

}
  
 
