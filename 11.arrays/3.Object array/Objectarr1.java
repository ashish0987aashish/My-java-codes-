class Employee
{
  String ename= "Uttam_tau";
  String eid= "Tau_123";
 
  public String toString()
  {
    return "Employee_name"+ename+"\nEmployee_id"+eid;
  }

}

class Address
{
  String houseno = "100-101/h";
 
  public String toString()
  { 
    return "House_no"+houseno;
  }

}

class Test 
{
 
 public static void main(String[] args)
 {
 
  Employee e = new Employee();
  Address a = new Address();
 
  Object[] arr = new Object[] {e,a};

  System.out.println("Elements of array are:");

  for(Object obj : arr)
  {
    System.out.println(obj);
  }

 }

}
   
  









