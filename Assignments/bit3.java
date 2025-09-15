class bit3{
    public static void main(String args[]){
        char ch;
        for(ch = 'A' ; ch<='Z' ; ch++){
            System.out.print((char)(ch | ' '));

            if(ch<90){
                System.out.print(",");
            }
        }
       
    }
}
//uppercase- A-Z = 65-90    65- 0100 0001
//lowercase a-z= 97-122     97- 0110 0001
// So, only 1 bit change that too in 6th(32) and ascii of ' '[blank character] == 32
//Therefore, (A | ' ' == a)