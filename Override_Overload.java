public class Override_Overload{
  public static void main (String[] args){
         
      digestion x=new digestion(); //will only take food types
      food f= new food(); //this is general food
      food c= new kfc(); //polymorphiosm strikes! since here kfc is food, digestion is able to take it!
      pizza p= new pizza(); //since food is the parent class, it can also take subclasses of food i.e. pizza & kfc
     
      x.digest(f);
      x.digest(c);
      x.digest(p);  
  }
}

class food{
  void eat(){
   System.out.println("The Food Is Great!");
  
  }   
}

class kfc extends food{
void eat(){  //this is overriding/replacing methods
  System.out.println("This Chicken is Great");
  void eat(int x){ //this is overloading/alternating methods
  System.out.println("This Is overloading");
  }
  }


class pizza extends food{
  void eat(){
  System.out.println("Bel Piatto!!!");
  }
}

class digestion{
  void digest(food x){ //will only take food so subclasses also.. i.e. kfc,pizza
     x.eat();
  
  }
}

