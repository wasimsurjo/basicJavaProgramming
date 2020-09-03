import java.util.Scanner;

class Theory{
  public static void main(String [] args){
  
     Scanner light=new Scanner(System.in);
     Wasim wo=new Wasim();
     System.out.print("Whom Do You Miss A Lot!?\n");
     String temp= light.nextLine();
     wo.setName(temp);
     wo.saying();
  }
}