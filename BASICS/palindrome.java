import java.util.*;

class palindrome{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int lastdigit;
        int rev=0;
        System.out.println("Enter a num:");
        int num = sc.nextInt();
        int original = num;
        while(num>0){
            lastdigit= num%10;
            rev = (rev*10)+lastdigit;
            num = num/10;
        }
        if(original==rev){
            System.out.println(original+ " is a palindrome");
        }else{
            System.out.println(original + " is not a palindrome");
        }

        sc.close();
    }
}
