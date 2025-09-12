class runlength{
    
    public static String compress(String str){
        if(str == null || str.isEmpty()){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        
        for(int i=0 ; i<str.length() ; i++){
            char current = str.charAt(i);
            Integer count = 1;
            while(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(count.toString()).append(str.charAt(i));
            
        }
        return sb.toString();
    }
    
    public static void main(String args[]){
        String str = "aabbcde";
        System.out.println(compress(str));
    }
}