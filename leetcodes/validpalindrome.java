class validpalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder("");
        StringBuilder sb1 = new StringBuilder("");
        
        //lowercase
        for(int i=0 ; i<s.length() ; i++){
            sb.append(Character.toLowerCase(s.charAt(i)));
        } 
        //removed special character and spaces
        for(int i=0 ; i<sb.length() ; i++){
            for (char j= 'a' ; j<='z' ; j++){
                if(sb.charAt(i)==j){
                    sb1.append(sb.charAt(i));
                }
            }
        }

        for(int i=0 ; i<sb1.length()/2 ; i++){
            if(sb1.charAt(i) != sb1.charAt(sb1.length()-1-i)){
                return false;
            }
        }

       return true;
    }


    public static void main(String args[]){
        String str = "hello I am Raj";
        System.out.println(isPalindrome(str));
    }
}

