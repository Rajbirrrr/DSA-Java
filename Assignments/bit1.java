class bit1{
    public static void main(String args[]){
        int a = 2;
        int b =3;

        System.out.println("Before swap:" + a + " , " + b );

        //swap using xor
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("After swap:" + a + " , " + b );
    }
}