//10. Interfaces

public interface Inter {
    String name = "Rituraj";
    void print();
    void run();         //Answer 2
}

private interface pri{
    String name = "Rituraj Private";        //Answer 10
}

protected interface pro{
    static final String name = "Rituraj Protected";     //Answe 11
}

interface Outer extends Inter{      //Answer 4 & 5 & 7
    void print();            
    void run();
}

    class Human implements Outer{           //Answer 1
        public void print(){
            System.out.println("Hello I am Human");
        }
        static void name(){
            System.out.println(name);
        }
    }
    class Student implements pri{

        static void name(){
            System.out.println(name);       //Answer 9
        }
        public static void main(String[] args) {
            Human obj = new Human();
            obj.print();
            // obj.run();          //Answer 6
            name();         //Answer 8 & 9
        }
    }
