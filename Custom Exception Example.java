class MyReader{  
   static String readInteger(String a) throws EitaIntegerNoiException{  
     for (int x=0;x<a.length();x++){
       if (a.charAt(x)=='.'){
         throw new EitaIntegerNoiException("Cannot Accept Floating Point Digits");}
       else{}}
            return a;   
             }
     
   public static void main(String [] args){  
      try{  
      readInteger("13.15");  
      }
      catch(Exception m){
        
     System.out.println("Exception occured: \n"+m);}  
  
      System.out.println("THE END");  
  }  
}
class EitaIntegerNoiException extends Exception{  
 EitaIntegerNoiException(String s){  
  super(s);  
 }  
} 