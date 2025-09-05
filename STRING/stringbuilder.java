class stringbuilder{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        StringBuilder abc = new StringBuilder("");
        
        String a = "zoo";
        

        for(char i= 'a'; i<='z' ; i++){
            abc = sb.append(i);
        }

        a = abc.toString();

        System.out.println(abc);
        System.out.println(abc.getClass().getName());
        
        
        System.out.println(abc);
        System.out.println(abc.toString().getClass().getName());


        System.out.println(a);
        System.out.println(a.getClass().getName());
        
        
    }
}