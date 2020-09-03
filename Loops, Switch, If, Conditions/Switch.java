import java.util.Scanner;

class Switch{
  
  public static void main(String[] args){
 Scanner light= new Scanner(System.in);   
         
        System.out.println("Enter Your Age Now!");
        
    int age= light.nextInt();
    
    switch (age) {
      
      case 1: 
        
        System.out.println("You can crawl!");
        break;
        
      case 2:
        
        System.out.println("You can talk!");
        break;
        
      case 3:
        
        System.out.println("You can walk!");
        break;
        
      default:
        System.out.println("Enjoy Life!");
        break; 
        
    }
  }
}
       
      
      