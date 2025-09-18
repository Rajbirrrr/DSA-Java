class Constuctoverload{

    static class Student{
        String name;
        int roll;
        Student(){ //1
            System.out.println("I am called"); //default constructor- always called.
        }
        Student(String name){ //parameterized constructor //2
            this.name = name;
            System.out.println(name);
        }
        Student(int roll){ //3
            this.roll = roll;
            System.out.println(roll);
        }
    }

    public static void main(String args[]){

        //This behaviour of multiple objects to use the suitable constructor is called construcor overloading.
        
        Student s1 = new Student(); //1
        Student s2 = new Student("Rajbir");  //2
        Student s3 = new Student(30); //3
    }
}