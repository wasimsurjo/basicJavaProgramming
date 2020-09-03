import java.util.Scanner;

class Increment {

 public static void main(String[] args) {
 
 int girls=60; int boys=20;
            
            System.out.println("Addition:");
            
            ++girls;
            System.out.println(girls);
            System.out.println(++girls);
            System.out.println(girls++);
            //The Whole Function Was Considered As 62 And Addition Occurred After The Print So Reprinting will show the post increment result//
            System.out.println(girls);
            //This girls is after the post increment i.e. Addition//
            
            System.out.println("Subtraction:");
            
            //Similarly!
            
            --girls;
            System.out.println(girls);
            System.out.println(--girls);
            System.out.println(girls--);
            //The Whole Function Was Considered As 61 And Sub Occurred After The Print So Reprinting will show the post increment result//
            System.out.println(girls);
             //This girls is after the post increment i.e. "-"//
 
            System.out.println("Other Tricks:");

            girls= girls + 5; 
            System.out.println(girls);
            


            girls += 5; //also means girls=girls+5!
            System.out.println("+5 = " +girls);
            
            //Similarly!
            
            girls -= 5;
            System.out.println("- = " +girls);
            girls *= 5;
            System.out.println("* = " +girls);
            girls /= 5;
            System.out.println("/ = " +girls);
 }
 

}
