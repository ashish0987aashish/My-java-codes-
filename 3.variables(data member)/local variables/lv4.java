class Student 
{

   void StudentDetails(double mark)
   {
    String name =  "Swati"; 
    int roll = 101;
    char age;

    System.out.println("Student name is :"+name);
    System.out.println("Student roll is :"+roll);
    //System.out.println(id);//error: cannot find symbol
    System.out.println("Student mark is :"+mark);
    //System.out.println(age);//variable age might not have been initialized
   }

   public static void main(String[] args)
   {
    int id= 111;
    System.out.println("Student id is:"+id);
    
    Student s = new Student();
    s.StudentDetails(7.9);   
   }



}

