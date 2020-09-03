class unknownInput //This is called variable length which...
{
public static void main(String [] args)
{  System.out.println(display (43,56,78,90, 84,98,78,21,90,90,9,10));
   
}
public static int display(int...num) //... allows unknown number of inputs
{ int total=0;
  for (int x:num)
     total+=x;
  
  return total/num.length;
  
  }
}
