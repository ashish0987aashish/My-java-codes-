class Test
{
 public static void main(String[] args)
 {
  StringBuffer sb1= new StringBuffer("Hello");

  System.out.println(sb1);
  System.out.println(sb1.indexOf("l"));
  System.out.println(sb1.lastIndexOf("l"));
  sb1.reverse();
  System.out.println(sb1); //olleH
  System.out.println(sb1.replace(0,1,"java")); 
  System.out.println(sb1.replace(0,4,"o"));
  System.out.println(sb1.replace(2,3,"java"));
  
  StringBuffer sb2 = new StringBuffer(sb1);
  System.out.println(sb2);


 }
}   

