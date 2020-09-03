import java.util.Scanner;

class Conditions
{
public static void main(String args[])
{
 Scanner light=new Scanner(System.in);
 
   System.out.println("Enter Age! I Dare You!");
   int eren=light.nextInt();
   
   System.out.println(eren>50 ? "Not kiddin! Ur Really Old!!" : "You're Young!"); // ? & : Operators For Conditions!
   /* ? checks the condition and puts left : if true & : right if false*/
  }
}