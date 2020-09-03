import java.util.*;

class ExceptionHandling{
  public static void main(String[] args){
  int x=1;

  Scanner light=new Scanner(System.in);
  do{
    try{
    System.out.print("1: ");
    int n1=light.nextInt();
    System.out.print(" / ");
    int n2=light.nextInt();
    int s=n1/n2;
    System.out.println(s);
    x++;
    }
    catch(Exception s){
    System.out.println("Hold On! Do It Right Dumbass");
    }}while(x==1);
  }
}