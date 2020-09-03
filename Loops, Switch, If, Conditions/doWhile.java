import java.util.Scanner;

class doWhile
{
public static void main(String args[])
{
 Scanner light=new Scanner(System.in);
   double amount, principal=10000, rate=.01;
   System.out.println("Enter Age To See Interest!");
   int eren=light.nextInt();
   
   do{
      System.out.println(eren);
      System.out.print("Live 10 Years To Become ");
      eren+=10;
   } while (eren <=100);
   
  }
}