import java.util.Scanner;

class Sort {
 /*
  * 
  * @ Wasim 8.1
  * 
  */
     public static void main(String args[])
    {
        Scanner light = new Scanner(System.in);
        
     int [] lab = new int[10], [] lab2=new int[10];
        int max=0;
       
    System.out.println("Enter 10 Numbers Respectively : ");
        for (int i=0;i<lab.length;i++)
        {     lab[i] = light.nextInt();  }
      
        //imperfect number ordering algorithm
        for(int index=0;index<lab.length;index++)
        {
            max=0;
            for(int index2=0;index2<lab.length;index2++)
            {
                if(lab[index]>lab[index2])
                {
                    max++;
                }
            }
            lab2[max]=lab[index];
        }

        //ask if ascending or descending
        System.out.print("Display order :\nA - Ascending\nD - Descending\nEnter your choice : ");
        choice = light.next();

        //output the numbers based on choice
        if(choice.equalsIgnoreCase("a"))
        {
            for(max=0;max<lab2.length;max++)
            {
                System.out.print(lab2[max]+" ");
            }
        }
        else if(choice.equalsIgnoreCase("d"))
        {
            for(max=9;max>-1;max--)
            {
                System.out.print(lab2[max]+" ");
            }
        }
    }
}

