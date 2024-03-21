class Oarray
{
 public static void main(String[] args)
 {
  
  String ename = "Uttam_Broker";
  int eid = 100;
  double esalary = 1.0;
 
  Object[] emp = new Object[]{ename,eid,esalary};

  System.out.println("Employee details are : ");
 
  for(Object o : emp)
  {
    System.out.println(o);
  }
 
 }
}
  
  
     

 
