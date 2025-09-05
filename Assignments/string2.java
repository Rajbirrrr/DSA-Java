import java.util.Scanner;
import java.util.Arrays;
class string2{

    
    public static void anagram(String str1 , String str2){
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);  //sort function do not return anything , it sorts array in place.
        Arrays.sort(arr2);


        if( Arrays.equals(arr1,arr2) ){
            System.out.println("The given two strings "+ str1 +" & "+ str2 + " are anagrams");
        }else{
            System.out.println("The given two strings "+ str1 +" & "+ str2 + " are not anagrams");
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string 1:");
        String str1 = sc.nextLine();
        System.out.println("Enter string 2:");
        String str2 = sc.nextLine();

        anagram(str1 , str2);
        
        
    }
}