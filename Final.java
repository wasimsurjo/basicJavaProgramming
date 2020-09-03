class Final{
  public static void main(String [] args){
   get a= new get(10);
      
   for (int i=0; i<5;i++){
   a.add();
   System.out.printf("%s", a);
  /* a.Z=20; won't work bcz Z is final */
   }
   
  }
}

class get{
 private int x;  
 private static int t=0;
 private final int Z; //final means it is unchangeable

 public get(int a){
   Z=a;
    }
 public void add(){
   x+=Z;
   t++;
 }
 public String toString(){
   return String.format("Sum is = %d Added %d Time(s)\n", x, t);
 }
}
 