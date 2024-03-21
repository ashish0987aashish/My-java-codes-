// EXAMPLE OF JAGGED ARRAY 

class Jarray
{

  public static void main(String[] args)
  {
    int [][] arr;
    arr = new int[7] [];

    arr[0] = new int[11];
    arr[1] = new int[4];
    arr[2] = new int[7];
    arr[3] = new int[9];
    arr[4] = new int[5];
    arr[5] = new int[14];
    arr[6] = new int[18];
     
   System.out.println("Array elements are(using for loop):"); 
   System.out.println("...................");
 
   for(int i=0;i<arr.length;i++)
   {
 
    
    for(int j=0;j<arr[i].length;j++)
    {
     System.out.print(arr[i][j]+" ");
    }System.out.println();
   
   }

   System.out.println();
   
   System.out.println("Array elements are:(using foreach loop)");
   System.out.println(".......................................");
 
   for(int[] a:arr)
   {
    System.out.println();
    for(int b:a)
    {
     System.out.print(b+" ");
    }

   }


  }
}
   
 
 
     
 
   
 
 
 
 

    
   
  
  