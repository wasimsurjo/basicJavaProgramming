class TimetoString{
  public static void main(String[] args){
      Time obj=new Time();
      System.out.println(obj.toMilitary());
      obj.setTime(13, 27, 6);
      System.out.println(obj.toMilitary());
      
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
}



