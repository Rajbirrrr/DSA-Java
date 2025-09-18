class Copyconstructor{
    static class Student{
        String name;
        int roll;
        String password;
        int marks[] = new int[3];
        

        Student(){   /* once I create a parameterized constructor, i need to create the default constructor,
                                it will be not be created automatically anymore*/
            
        }

        //shallow copy
        Student(Student s1){  
            this.name = s1.name;
            this.roll = s1.roll;
            this.marks = s1.marks;
        }
    }
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name= "Rajbir";
        s1.roll = 30;
        s1.password = "abc";

        s1.marks[0]=50;
        s1.marks[1]=62;
        s1.marks[2]=93;

        Student s2 = new Student(s1);  //s1 attributes get copied here
        s2.password = "abc"; //I want to have all other features same

        System.out.println(s2.name); //Gets the name of s1

        s1.name = "Ranabir"; //s2 will hold the old context when I copied it.
        System.out.println(s2.name); //still holds s1

        for(int i=0 ; i<3 ; i++){
            System.out.println(s1.marks[i]);
        }

        for(int i=0 ; i<3 ; i++){
            System.out.println(s2.marks[i]);
        }

        s1.marks[0]= 100; //changes s1

        for(int i=0 ; i<3 ; i++){
            System.out.println(s2.marks[i]); //s2 too gets changed
        }
    }
}