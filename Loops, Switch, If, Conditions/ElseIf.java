import java.util.Scanner;

class ElseIf
{
public static void main(String args[])
{
 Scanner light=new Scanner(System.in);
 
   System.out.println("Enter Age! I Dare You!");
   int eren=light.nextInt();
   
   if (eren<20){
   System.out.println("Hey! Ur not old dude!");
 } else if(eren<40){
   System.out.println("Almost 40! Don't Be Naughty!");
 }
   else if (eren==40){
   System.out.println("Seems ur 40! So be Naughty!");
   } else{
   System.out.println("Start Praying Grandpa!");}
 }
}