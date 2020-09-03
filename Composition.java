class Compostion{ //alllows us to create reference to methods/Objects e.e. private tax birthday
  public static void main(String[] args){
      tax obj=new tax(10,10,1997);
      Compose obj1=new Compose("Wasim", obj); //Here we sent the variables of tax using obj
      
      System.out.println(obj1);
         
  }
}

class tax{
 private int month, day, year;

 public tax(int m, int n, int o){
   month=m; day=n; year=o;
    
   System.out.printf("The cons for this is %s\n", this); //%s is for using string & by "this", we called the toString method.
  }                                                              //this can also be called to detect objects like %S & call methods related to objects.. e.g. %s

 public String toString(){
 
    return String.format("%d/%d/%d :)", month,day,year); //%d is for printing decimal integers
 
 }
}

class Compose{
private String name;
private tax birthday;

public Compose(String theName, tax theDate){
   name=theName;
   birthday=theDate;

}
public String toString(){
   return String.format("My Name is %s, My Birthday is  %s", name, birthday);
 }             //first %s finds and uses name & the second %s finds the later string.
}



