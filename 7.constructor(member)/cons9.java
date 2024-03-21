//CONSTRUCTOR INITIALIZING INDSTANCE VARIABLE

class Student 
{
 
    String sname;
    int sroll;
    double smark;

   Student()
  {
   sname="raj";
   sroll=102;
   smark=38;
  }
   
 public static void main(String [] args)
 {
   Student s1=new Student();
   System.out.println(s1.sname);
   System.out.println(s1.sroll);
   System.out.println(s1.smark);
 }

}   