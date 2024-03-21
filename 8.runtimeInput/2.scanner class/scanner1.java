class StudentDetails
{
  public static void main(String[] args)
  {
 
  java.util.Scanner sc = new java.util.Scanner(System.in);

  System.out.println("Enter Student Name:");
  String sname = sc.nextLine();
  
  System.out.println("Enter Student Roll:");
  int sroll = sc.nextInt();

  System.out.println("Enter Student mark:");
  double smark = sc.nextDouble();
 
  System.out.println("Enter Student Gender:");
  char sgender = sc.next().charAt(0);


  System.out.println();
 
  
  System.out.println("The student name is "+sname);
  System.out.println("The student roll is "+sroll);
  System.out.println("The student mark is "+smark);
  System.out.println("The student gender is "+sgender);

  }


}
 
  