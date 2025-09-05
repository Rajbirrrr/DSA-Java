class uppercase{
   
   public static String upper(String str){
        StringBuilder sb = new StringBuilder();
        char ch= Character.toUpperCase(str.charAt(0)); //first alphabet is capitalized

        sb.append(ch);

        for(int i=1 ; i<str.length(); i++){
            if(str.charAt(i) == '\0' && i< (str.length()-1)){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
   }
   
    public static void main(String args[]){
        String str = "hi i am raj";
        System.out.println(upper(str));
    }
}