//  EXAMPLE OF JAVA PROGRAM TO ENTER YOUR NAME, ROLL AND MARK USING BUFFEREDREADER CLASS AND DISPLAY THEM 

class MyDetails
{
 
 public static void main(String[] args) throws Exception
 {
  
  java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

  System.out.println("Enter your name:");
  String name = br.readLine();

  System.out.println("Enter your roll:");
  int roll = Integer.parseInt(br.readLine());

  System.out.println("Enter your mark:");
  double mark = Double.parseDouble(br.readLine());

  System.out.println("Enter your gender:");
  char gender = (char)br.read();

  System.out.println();
 

  System.out.println("My name is "+name);
  System.out.println("My roll is "+roll);
  System.out.println("My mark is "+mark);
  System.out.println("My gender is "+gender);

 }
 
}