                                                                                 
class Test
{

 public static void main(String [] args)
 {
  
 String s1= new String("Hello");
 
 System.out.println(s1);
 System.out.println(s1.length());
 System.out.println(s1.charAt(3)); 
 System.out.println(s1.indexOf("l"));
 System.out.println(s1.lastIndexOf("l"));
 System.out.println(s1.toUpperCase());
 System.out.println(s1.toLowerCase());
 System.out.println(s1.equals("hello"));
 System.out.println(s1.equalsIgnoreCase("hello"));
 

 char[] arr= s1.toCharArray();//converts to array of character
 byte[] brr= s1.getBytes();//converts to byte array

 for(int i=0;i<arr.length;i++)
 {

 System.out.println(arr[i]+"\t"+brr[i]);

 }

 System.out.println(s1.compareTo("Hello"));
 System.out.println(s1.compareTo("Gello"));
 System.out.println(s1.compareTo("Iello"));
 System.out.println(s1.compareTo("hello"));
 System.out.println(s1.compareTo("Hells"));
 System.out.println(s1.compareTo("Hell"));
 System.out.println(s1.compareTo("Helloooo"));


 
 }

}
 