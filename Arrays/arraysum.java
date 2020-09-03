class arraysum
{
  public static void main(String [] args) {
   
  
  int [] x={ 7, 8, 9, 10, 11, 12};
  int y=0;
  
  for(int counter=0;counter<x.length;counter++)
  {
     y +=x[counter];
    } System.out.println("SUM = "+y);
  }
}