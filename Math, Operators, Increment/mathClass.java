import java.util.Scanner;

class mathClass
{
public static void main(String args[])
{
 Scanner light=new Scanner(System.in);
   System.out.println("Enter A Negative Value!");
   double eren=light.nextDouble();
   double eren2=eren*-1;
    System.out.println("Original = " +eren);
    System.out.println("Power^2 = " +Math.pow(eren, 2));
    System.out.println("Absoulate Value = " +Math.abs(eren));
    System.out.println("Ceil (Round Down To) = " +Math.ceil(eren));
    System.out.println("Floor (Round Up To) = " +Math.floor(eren));
    System.out.println("Max = " +Math.max(eren2, 2));
    System.out.println("Min = " +Math.min(eren2, 1));
    System.out.println("Sqrt = " +Math.sqrt(eren2)); 
  }
}