public class Wasim{
   private String herName; //Only Methods of this class can use private
   public void setName(String name){
    herName=name;   }
   public String getName(){
   return herName;}
   public void saying(){
      System.out.printf("Your First Love Was %s! \n", getName());
   }
}