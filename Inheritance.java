class Inheritance{ //Gain/Inherit all variables and methods from another class using extends...
  public static void main(String [] args){
  get a= new get();
  get2 b= new get2();
  get3 c= new get3();
  a.eat();
  b.eat();
  c.eat();
  }  
}


class get{ //Super Class= Having the main things
  public void eat(){
    System.out.println("Life Isn't Precious");}
    public void eat2(){
      System.out.println("Life Can Be Precious");}
    private void eat3(){ //private stuff cannot be inherited, only public can be.
    System.out.println("Fried Chicken");
  }
}
class get2 extends get{ //extends means inherit from
  public void eat(){ //overriding method eat in subclass
    System.out.println("Life Is Precious Though");
    eat2();
    
  }}
class get3 extends get2{ 
  
}

 