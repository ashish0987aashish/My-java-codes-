// WRITE A JAVA PROGRAM TO ENTER USERNAME & PASSWORD BY USING CONSOLE CLASS AND DISPLAY THEM

class UsernamePassword
{

  public static void main(String[] args)
  {
    java.io.Console c = System.console();
 
    System.out.println("Enter Username :");
    String uname = c.readLine();

    System.out.println("Enter Password :");
    char [] ch  = c.readPassword();
    String pwd = String.valueOf(ch);

    System.out.println("Username is:"+uname);
    System.out.println("Password is:"+pwd);

   }

}
    
    
    
   