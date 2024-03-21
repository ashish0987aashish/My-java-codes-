class Test
{ 
 public static void main(String[] args)
 {
 
  String s1 =new String("Chandra");
  System.out.println(s1);
  System.out.println(s1.concat("Sir"));
  System.out.println(s1);
 
  System.out.println();

  StringBuilder sb1 = new StringBuilder("Chandra");
  System.out.println(sb1); 
  System.out.println(sb1.append("Sir"));
  System.out.println(sb1);
 
 }

}
 