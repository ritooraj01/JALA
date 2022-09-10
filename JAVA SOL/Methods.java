public class Methods {
    void method(int age, String name){      //Answer 1
        System.out.println(age);
        System.out.println(name);
    }
    void method(String name){
        System.out.println(name);
    }
    void method1(int age, int age1){            //Answer 2
        System.out.println(age);
    }
    void method1(String string, String name){
        System.out.println(age);
    }
    // int method2(int n, String s){
    //     return n + " " + s;
    // }
    // void method2(int n, String s){             //Answer 3 & 5 - we can not return anything with same number of parameters and data type
    //     System.out.println(n + " " + s);
    // }
    public static void main(String[] args) {
        Methods obj = new Methods();
        obj.method(18, "Rituraj");
        obj.method("Ritu");
    }
}