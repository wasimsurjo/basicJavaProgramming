class Timed{
  public static void main(String[] args){
      T obj=new T();
      System.out.println(obj.toMilitary());
      obj.setTime(13, 27, 6);
      System.out.println(obj.toMilitary());
      System.out.println(obj.toString());
      //obj.hour=7; can't access bcz in another class
  }
}
  

class T
{
private int hour=11, minute=15, second=30; //Only methods of same class can access private
public void setTime(int hour, int minute, int second){
  this.hour = hour ; /*when it was hour,minutes,second it was a new variable for this function bt as we used this.It gained access to the global ones. */
  this.minute = minute; 
  this.second = second;
  }
public String toMilitary(){ //toString format used!!
     return String.format("%02d:%02d:%02d", hour, minute, second);
  }

public String toString(){
  return String.format("%d: %02d: %02d %s", ((hour==0||hour==12)?12:hour%12), minute, second, (hour<12? "AM":"PM"));
  }
}



