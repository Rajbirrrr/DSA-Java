class Palindrome{

    public static void check(String str){

        boolean pal = true;

        for(int i=0 ; i<str.length() ; i++){
            int n= str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                pal= false;
                break;
            }
        }

        if(!pal) System.out.println("Not a palindrome!");
        else System.out.println("The string is a palindrome");
    }
    
    
    public static void main(String args[]){
        String a = "racecar";
        check(a);
    }
}