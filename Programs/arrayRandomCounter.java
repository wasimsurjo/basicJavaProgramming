import java.util.Random;
/*
 * *
 * * *@Wasim
 * * * *
 */
class arrayRandomCounter
{
public static void main(String [] args)
{
  Random light=new Random(); 
  int freq[]=new int[7]; //This Program Rolls 6 Randomm numbers 1000 times and shows in a table how many times they were rolled!
  
  for(int roll=1;roll<1000;roll++){
     ++freq[1+light.nextInt(6)];
  }
  
  System.out.println("Face\tFrequency");
  
  for (int face=1;face<freq.length;face++){
  System.out.println(face+"\t"+freq[face]);
  }
  }
}