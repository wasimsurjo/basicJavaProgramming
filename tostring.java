class tostring{
  public static void main(String[] args){
      tax obj=new tax(10,10,1997);
      T obj1=new T("Wasim", obj);
      
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
 
    return String.format("%d/%d/%d :)", month,day,year);
 
 }
}

class T{
private String name;
private tax birthday;

public T(String theName, tax theDate){
   name=theName;
   birthday=theDate;

}
public String toString(){
   return String.format("My Name is %s, my Birthday is %s", name, birthday);
 }             //first S5 finds and uses name & the second %s finds teh later string.
}



