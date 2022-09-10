public class Staticsol {
    static int minage = 18;     //Static Variable
    static int maxage = 32;

    public String name;         //public Instance
    int age;                    //Default Instance

    static student(String sname, int sage){
        name = sname;           //Answer 2 - Cannot access instance variable with static mathod
        age = sage;
        System.out.println(name + age);
    }

    static void student1(){
        String name = "Rituraj";
        int age = 22;
        System.out.println(name + " " + age);
    }

    public void age(){             // Answer 3 - static variables in Instance methods
        System.out.println(minage);
        System.out.println(maxage);
    }

    public static void main(String[] args) {        //Answer 6 & 7
        student1();
        Staticsol s = new Staticsol();
        s.age();
    }

}

//ANSWER 4 & 5

//instance methods cannot be called directly from static methods, but vice versa is true.
//To call instance methods from static methods we need to use an object of the class.
