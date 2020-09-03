public class Abstract_Concrete{ //non abstract class=concrete 
  public static void main (String[] args){
    
      digestion x=new digestion(); 
      //food f= new food(); //can't be created since food is abstract
      food c= new kfc(); 
      pizza p= new pizza(); 
     
      x.digest(c);
      x.digest(p);  
  }
}

abstract class food{ //the object of this class cant be created
  //food f=new food(); ERROR! here we need polymorphism
 void eat2(){ //abstract classes can hold normal methods too!    
  System.out.println("This Chicken is Great"); 
 }
 abstract void eat(); //no body!must be overrided
}
//abstract methods MUST be overrided by all subclasses!!
class kfc extends food{
void eat(){     
  System.out.println("This Chicken is Great");

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

