import java.util.*; 
import java.io.*;

class cons1 {

  public static String NonrepeatingCharacter(String str) {
   
    int n = str.length();
    for(int i=0 ; i<n ; i++){
      boolean repeat = false;
      for(int j=0 ; j<n ; j++){
        if(i!=j && str.charAt(i)==str.charAt(j)){
          repeat = true;
          break;
        }
      }
      if(!repeat){
        return String.valueOf(str.charAt(i));
      }
    }
    return "";
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(NonrepeatingCharacter(s.nextLine())); 
  }

}