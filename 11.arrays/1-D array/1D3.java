//EXAMPLE TO CREATEING A STRING TYPE ARRAY AND INPUTING 5 STUDENTS NAME USING SCANNER CLASS AND DISPLAYING THEM



import java.util.*;        //.* represents all the classes inside util package

class Student
{

 public static void main(String [] args)
 {
 
  String[] student = new String[5];
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter student name:");
  for(int i=0;i<student.length;i++)
  {
    student[i]=sc.nextLine();
  }

  System.out.println();

  System.out.println("Retrieving students name using [for loop]");
  System.out.println(".......................................");

  System.out.println("The name of the students are:");

  for(int i=0;i<student.length;i++)
  {
    System.out.println(student[i]);
  }

  System.out.println();

  System.out.println("Retrieving students anme using [foreach loop]");
  System.out.println(".............................................");
 
  System.out.println("The name of the students are:");
   
  for(String name:student)
  {
    System.out.println(name);
  }
 } 


}    
        

   
 
 
 
