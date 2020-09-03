import java.util.Scanner;

class interestProgram
{
public static void main(String args[])
{
 Scanner light=new Scanner(System.in);
   double amount, principal=10000, rate=.01;
   System.out.println("Enter Age To See Interest!");
   int eren=light.nextInt();
   
   //A=P(1+R)^n
   for (int day=1;day<=20;day++){
       amount=principal*Math.pow(1+rate, day);
      System.out.println(day + " -- " + amount);
    }
  }
}