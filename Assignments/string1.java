import java.util.*;
class string1{

    public static void vowelchecker(String str){
        char arr[]= {'a','e','i','o','u'};
        Integer count = 0;
        for(int i=0 ; i<str.length() ; i++){
            for(int j=0 ; j<arr.length ; j++){
                if(str.charAt(i)==arr[j]){
                    count++;
                    
                }
            }
        }
        System.out.print("Number of vowels:- " + " ");
        System.out.print(count);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String a = sc.nextLine();
        vowelchecker(a);
    }
}