//EXAMPLE OF ENTERING THE NO. OF PHONE NUMBERS YOU WANT TO ENTER, ENTER THEM AND DISPLAY THEM//

import java.util.*;

class Number
{

 public static void main(String[] args)

{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the no of phone numbers you want to enter:");
 int num=sc.nextInt();

 long[] arr= new long[num];
  
 System.out.println("Enter the phone numbers");

 for(int i=0;i<arr.length;i++)
 {
   arr[i]= sc.nextLong();
 }

 
 System.out.println("The phone numbers are:");
 for(long numbers:arr)
 {
   System.out.println(numbers);
 }
}


}
 
 