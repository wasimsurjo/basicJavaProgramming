import java.util.EnumSet;  //For Setting Range of ENUM

class Enum{
  public static void main(String [] args){
    for(wasim friends: wasim.values()) //wasim.values is built in array created by java
      System.out.printf("%s\t %s\t %d\t \n", friends, friends.getAbout(), friends.getYear());
    System.out.println("\nNow The Range Of Constatnts!! \n"); //%d is for printing decimal int
    
    for (wasim friends: EnumSet.range(wasim.filora,wasim.oishee)) //EnumSet.range(from,to)
      System.out.printf("%s\t %s\t %d\t \n", friends, friends.getAbout(), friends.getYear());
  }
}
/*public */ enum wasim{ // Created like a class for setting defaults
  annie("gone", 32),
  filora("nice", 22), 
  oishee("best", 20),
  sara("cute", 23),
  milie("lost", 23);
  
  
   private final String aboutHer;
   private final int year;
   
   wasim(String description, int Year){
         aboutHer= description;
         year = Year;
         
   }
   
   public String getAbout(){
      return aboutHer;
      }
   public int getYear(){
     return year;
   
   }
}