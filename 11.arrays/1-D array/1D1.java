class Test
{
 
 public static void main(String [] args)
 {
  
    /* ARRAY DECLARATION  */
 
    int[] a1; // preferred because it differenciaes variable from datatype ;
    int []a2;
    int [] a3;
    int[]a4;
    int a5[];
    int a6                                      [];
 
     
    int []b1,b2;//both are 1D array
    int b3[],b4;// Here b3 is 1D array and and b4 is normal variable
    int b5[],b6[];//Here b5 and b6 both are 1D array

    
    /*ARRAY DECLARATION AND CREATION */
     
    int [] c1;//array declarartion 
    c1= new int[5];//array creation 
    
        //OR   
 
    int[] c2=new int[5];//declaration and creation in a single line

    //int [] c3= new int[-3];//NegativeArraySizeException

   
    /*ARRAY DECARATION,CREATION AND INITIALIZATION  */  
 
    int[] d1= new int[3];//array declaration and creation
    d1[0]=10;//array initialization
    d1[1]=20;//array initialization
    d1[2]=30;//array initialization

         //OR
        
    int[] d2= new int[] {10,20,30,40,50};//array declaration,creation and initialization in a single line
 
         //OR
 
    int[] d3={11,22,33,44,55,66,77};//array declaration,creation and initialization in a single line



 }

}   
  