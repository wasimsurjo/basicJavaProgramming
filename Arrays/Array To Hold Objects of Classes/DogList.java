class DogList{
  
  private Dog [] dog = new Dog[5];
  private int i=0;
  
  public void addDog(Dog d){
    if (i<dog.length){
    dog[i]=d;
    System.out.println("Dog Added At "+i);
    i++;
    }
  }
}