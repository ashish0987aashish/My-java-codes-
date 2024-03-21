//EXAMPLE OF MATRIX ARRAY 



class Test
{

public static void main(String[] args)
{

 
  int[][] a1;
  int []a2[];
  int a3[][];
  int []a4 [];
  int[][] a5,      a6[][][];//a5 is 2D and a6 is 5D array

  int[][] arr;
  arr = new int[3][3];
  arr[0] [0]=111;
  arr[0] [1]=222;
  arr[0] [2]=333;

  arr[1] [0]=444;
  arr[1] [1]=555;
  arr[1] [2]=666;

  arr[2] [0]=777;
  arr[2] [1]=888;
  arr[2] [2]=999;

  System.out.println();

  System.out.println("Retrieve elements by using for loop:");
  for(int i=0;i<arr.length;i++)
  {
    
    for(int j=0;j<arr[i].length;j++)
    {
     System.out.print(arr[i][j]+" ");
    } 
    System.out.println();
  }
    
  System.out.println();
   
   System.out.println("Retrieve elements by using for each loop");
   for(int[] a:arr)
   {
    System.out.println();
    for(int b : a)
    {
     System.out.print(b+" ");
    }

   }

 }

}
 

    




  
    
  
 