class TimetoString{
  public static void main(String[] args){
      Time obj=new Time();
      System.out.println(obj.toMilitary());
      obj.setTime(13, 27, 6);
      System.out.println(obj.toMilitary());
      System.out.println(obj.toString());
      
  }
}
  

class Time
{
private int hour, minute, second;

public void setTime(int h, int m, int s){
  hour = ((h>=0 && h<24) ? h : 0); /*Puts left : if ? is true & : right otherwise*/
  minute = ((m>=0 && m<60) ? m : 0);
  second = ((s>=0 && s<60) ? s : 0);
  
  
    }
public String toMilitary(){ //toString format used!!
     return String.format("%02d:%02d:%02d", hour, minute, second);
  }

public String toString(){
  return String.format("%d: %02d: %02d %s", ((hour==0||hour==12)?12:hour%12), minute, second, (hour<12? "AM":"PM"));}
}



