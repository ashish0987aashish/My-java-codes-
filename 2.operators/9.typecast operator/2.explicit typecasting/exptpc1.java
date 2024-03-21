class Testfirstexptpc
{
  
  public static void main(String []   args)
  {
  
    int x= 98;
    char c= (char)x;
    System.out.println("The values of c="+c);//b//explicit typecasting

    System.out.println();

    double d=1.2;
    float f= (float)d;
    System.out.println("The value of f ="+f);//explicit typecasting 
   
    System.out.println();
   
    byte b=4;
    float f1=b;//implicit typecasting
    System.out.println("The value of f1 ="+f1);

    System.out.println();    
 
    int a=5;
    byte b1=(byte)5;
    System.out.println("The value of b1 ="+b1);

    System.out.println();
    
    float f2=6.9f;
    int a1=(int)f2;
    System.out.println("The value of a1 ="+a1);

    System.out.println();

    int a2=130;
    byte b2=(byte)a2;
    System.out.println("The value of b2 ="+b2);

    System.out.println();

    long l=150;
    byte b3=(byte)l;
    System.out.println("The value of b3 ="+b3);
    
    System.out.println();
 
    int a3=150;
    byte b4=(byte)a3;
    System.out.println("The value of b4 ="+b4);
        

   
   }
 
  
}