class Retrieve
{
 
  static int[] arr={111,222,333,444,555};
 
 public static void main(String [] args)
 {
  
  System.out.println("The length of the array is :"+arr.length);//length keyword is used to see the length of the array
  
  System.out.println("................................................................................................");
   
 
  System.out.println();

  /*RETRIEVATION OF THE ARRAY */

  System.out.println("Retrieving elements of array using [index]");
  System.out.println("........................................");
 
  System.out.println(arr[0]);
  System.out.println(arr[1]);
  System.out.println(arr[2]);
  System.out.println(arr[3]);
  System.out.println(arr[4]);

  System.out.println();

  System.out.println("Retriving elements of array using [for loop] ");
  System.out.println(".............................................");

   for(int i=0;i<arr.length;i++)
   { 
     System.out.println(arr[i]);
   } 

  System.out.println();
  
  System.out.println("Retrieving elements of array using [foreach loop] ");
  System.out.println("..................................................");

  for(int r:arr)
  {
    System.out.println(r);
  } 


 }


}

     
     
  
  