//EXAMPLE OF STRING CREATION WITH 'new' AND 'lateral' keyword


class  Test
{
  
 public static void main(String [] args)
 {
 
  String s1= new String("Soumyan");
  String s2= new String("Soumyan");

  String s3="Soumyan";
  String s4="Soumyan";
 
  System.out.println(s1+" "+s2+" "+s3+" "+s4);
 
  System.out.println(s1==s2);//false
  System.out.println(s2==s3);//false
  System.out.println(s3==s4);//true //String pool never contains duplicate string

 }

} 
  