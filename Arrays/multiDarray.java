class multiDarray
{
public static void main(String [] args)
{  
  int wasim[] []={{30, 40 , 50, 80},{20, 30,40,50,60}};
  int oishee[] []={{30,31,32,33},{43},{4,5,6}};
  
  System.out.println("Example: "+oishee[2][0]); //As many arrays as we want, just column no.[] then array no.[]
  System.out.println();
  System.out.println("Here's The First One");
  display(wasim);
  System.out.println();
  System.out.println("And Here's The The Second");
  display(oishee);
     
}
public static void display(int x[] []){
  for(int row=0;row<x.length;row++){
    for (int column=0; column<x[row].length;column++){
        System.out.print(x[row] [column]+"\t");
      } System.out.println();
    }    
  }
}
