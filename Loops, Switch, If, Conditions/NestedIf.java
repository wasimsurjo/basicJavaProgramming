import java.util.Scanner;

class NestedIf
{
public static void main(String args[])
{
 Scanner light=new Scanner(System.in);
 
   System.out.println("Enter Age! I Dare You!");
   int eren=light.nextInt();
   
   if (eren<20){
   System.out.println("Hey! Ur not old dude!");
 } else {
   System.out.println("Seems ur old dude!");
   if (eren<40){
   System.out.println("-->But The Age Is Nice");
   }else {
   System.out.println("-->Not kiddin! Ur Really Old!!");}
 }
   
 }
}