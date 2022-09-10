class Constructors{
    public Constructors(){              //Answer 1
        System.out.println("Default");
    }
    int age = 18;
    Constructors(int age){
        this.age = age;
    }
    void print(){
        System.out.println(this.age);
    }
}
class A{
    String name;
    protected A(String name){       //Answer 3
        this.name = name;
    }
    void display(){
        System.out.println(name);
    }
}
class Child extends Constructors{       //Answer 2
    void display(){
        System.out.println(age);
    }

    public static void main(String[] args) {
        A obj = new A("Riturakj");
        obj.display();
    }
}
//Answer 4 - No, constructor does not have any return type in Java

//Answer 5 - A constructor is called only once per object instance