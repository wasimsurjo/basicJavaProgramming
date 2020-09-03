import java.util.Scanner;
import java.util.Random;
/*
 * *
 * * *@Wasim
 * * * *
 */
class apples
{
public static void main(String [] args)
{
  Scanner light=new Scanner(System.in); 
         Random dice =new Random();
         int x;
         
         for (int counter=1; counter<=10;counter++){
                 x=1+dice.nextInt(6);//Putting 6 will give us numbers from range 0-5. So 1+ is done to increase range to 6.
         System.out.println(x+" ");
    }
  }
}