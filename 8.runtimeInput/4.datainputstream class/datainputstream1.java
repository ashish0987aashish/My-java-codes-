// EXAMPLE OF ENTERING DATA  USING DATAINPUTSTREAM


class MyData
{

 public static void main(String[] args) throws Exception
 {
  
 java.io.DataInputStream dis = new java.io.DataInputStream(System.in);

 System.out.println("Enter your name:");
 String name = dis.readLine();

 System.out.println("Enter your age:");
 int age = dis.readInt();

 System.out.println("Check your data:");
 boolean check = dis.readBoolean();



 System.out.println("My name is:"+name);
 System.out.println("My age is:"+age);
 System.out.println("The data is "+check);

 }


}

  
