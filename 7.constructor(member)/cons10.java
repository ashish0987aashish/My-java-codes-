// USE OF PARAMETERIZED CONSTRUCTOR


class Student 
{
   String stuname;
   int sturoll;
   double stumark;

   Student(String sname,int sroll,double smark)
   {
     this.stuname= sname;
     this.sturoll= sroll;
     this.stumark= smark;
   }

   public static void main(String[] args)
   {
 
    Student s1= new Student("Rahul",101,1.1);
    
    System.out.println(s1.stuname);
    System.out.println(s1.sturoll);
    System.out.println(s1.stumark);

    System.out.println();

    Student s2= new Student("Raj",102,1.2);
    System.out.println(s2.stuname);
    System.out.println(s2.sturoll);
    System.out.println(s2.stumark);

    System.out.println();
     
    Student s3= new Student("Rohan",103,1.3);
    System.out.println(s3.stuname);
    System.out.println(s3.sturoll);
    System.out.println(s3.stumark);

    }

}
















      













     
  
   