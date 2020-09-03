class multiConstructor{
  public static void main(String[] args){
      T obj=new T();
      T obj2=new T(5);
      T obj3=new T(5,6);
      T obj4=new T(5,6,7);
     
      System.out.printf("%s\n", obj.toMilitary());
      System.out.printf("%s\n", obj2.toMilitary());
      System.out.printf("%s\n", obj3.toMilitary());
      System.out.printf("%s\n", obj4.toMilitary());
  }
}
  

class T
{
private int hour=11, minute=15, second=30; //Only methods of same class can access private

public T(){
  this(0,0,0);
}
public T(int h){
  this(h,0,0);
}
public T(int h, int i){
  this(h,i,0);
}
public T(int x, int y, int z){
  setTime(x,y,z);
}

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



