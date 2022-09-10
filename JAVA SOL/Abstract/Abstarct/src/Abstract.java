abstract class Abstract {

    abstract void run();        //Answer 1
    abstract void black();

    public void bike(){
        System.out.println("Bike");
    }
}
    class Car extends Abstract{
        void run(){System.out.println("Running Fast");}
    }
    class color extends Car{}

    class shape extends Car{
        
    public static void main(String[] args) {
        // Abstract obj = new Car();       //Answer 2
        // obj.run();

        // Abstract obj1 = new color();    //Answer 3
        // obj1.black();

        Abstract obj2 = new shape();       //Answer 4
        obj2.bike();

    }
}

