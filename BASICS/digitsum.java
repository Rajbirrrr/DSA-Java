import java.util.*;
class digitsum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        int ld;
        int original = num;
        while(num>0){
            ld = num%10;
            sum= sum+ld;
            num=num/10;
        }
        System.out.println("The sum of digits of "+ original+" is\n"+ sum);
    }
}