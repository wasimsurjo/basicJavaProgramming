class arrayMethods
{
public static void main(String [] args)
{  int wasim[]={30, 40 , 50, 80};
   set(wasim);
   
  for (int y:wasim)
     System.out.println(y);
  }

public static void set(int x[]){
     for (int counter=0;counter<x.length;counter++)
               x[counter]+=5;
     
}}
