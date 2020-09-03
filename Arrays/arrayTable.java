class arrayTable
{
public static void main(String [] args) //\t creates a table
{
   
  System.out.println("Index\tValue");
  int [] x={ 7, 8, 9, 10, 11, 12};
  
  for(int counter=0;counter<x.length;counter++){
     System.out.println(counter + "\t" + x[counter]);
    }
  }
}