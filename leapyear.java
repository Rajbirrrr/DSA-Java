import java.util.*;
class leapyear{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int a = sc.nextInt();

        if(a%4==0 && a%100!=0  || a%400==0){
            System.out.println("Leapyear");
        }else{
            System.out.println("not a leap year");
        }
    }
}