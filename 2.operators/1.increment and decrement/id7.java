class Testseventh
{
   
    public static void main(String [] args)
 {
  
    int i=25;
    int j= ++(++i);

    System.out.println(i);
    System.out.println(j);
    // it will show an error because listing in increment and decrement operator is not possible , the value of (++i) is a constant
 }


}