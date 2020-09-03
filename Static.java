class Static{
  public static void main(String [] args){
   get a= new get("Wasim", "Surjo");
   get b= new get("Marzana", "Oishee");
   get c= new get("Sadika", "Ananna");
   get d= new get("Sasuke", "Uchiha");
  
   System.out.println();
   System.out.println(a.get1());
   System.out.println(a.get2());
   System.out.println(a.get3());
   System.out.println(get.get3()); //Static doesn't need objects to be accessed.
   
  }
}

class get{
 private String x; 
 private String y; 
 private static int z=0;

 public get(String a, String b){
   x=a; y=b;
   z++;
   System.out.printf("Enter %s %s!, members in the club: %d\n", x, y, z);
 
 }
 public String get1(){
   return x;
 }
 public String get2(){
   return y;
 }
public static int get3(){
   return z;
 }
}
 