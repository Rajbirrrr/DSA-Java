import java.util.*;
class table{
    public static void main(String args[]){
        int num;
        int tablesize;
        int i;
        int val = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();
        System.out.println("Enter the size of table, kaha tak chiyeee:");
        tablesize = sc.nextInt();

        for(i=0; i<=tablesize ; i++){
            val = num*i;
            System.out.println(num + "*" + i +"="+ val);
        }



    }
}