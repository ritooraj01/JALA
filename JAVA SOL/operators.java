class operators {

    static void arithmetic(){               //Answer 1
        int a=10;
        int b=5;
        int Addition = a+b;
        int Substraction = a-b;
        int Multiplication = a*b;
        float Division = a/b;
        System.out.println("Addition " + Addition);
        System.out.println("Substraction " + Substraction);
        System.out.println("Multiplication " + Multiplication);
        System.out.println("Division " + Division);
    }

    static void increment(){            //Answer 2
        int a = 10;
        int b;
        int c;
        b = a++;    //Post Increment
        c = ++a;    //Pre Increment
        System.out.println("Post Increment "+b);
        System.out.println("Pre Increment "+c);
    }

    static void decrement(){            //Answer 2
        int a = 10;
        int b;
        int c;
        b = a--;    //Post Decrement
        c = --a;    //Pre Decrement
        System.out.println("Post Decrement "+b);
        System.out.println("Pre Decrement "+c);
    }

    static void relational(){           //Answer 3, 4, 5 & 6
        int a = 10;
        int b = 10;
        int c = 10;
        for (int i=0; i<=2; i++){           //Relational
            a *= i;
            if(a==b && a==c){       //Logical AND
                System.out.println("Both are True");
            }
            if (a==b || a!=b){      //Logical OR
                System.out.println("Either one is True");
            }
            System.out.println(!(a<b));     //Logical NOT

        }
    }

    static void numbers(){          //Answer 7
        int a = 50;
        int b = 30;
        if(a>b){
            System.out.println("a is greater ");
        }
        if(b<a){
            System.out.println("b is smaller ");
        }
    }

    public static void main(String[] args) {
        arithmetic();
        System.out.println();
        increment();
        System.out.println();
        decrement();
        System.out.println();
        relational();
        System.out.println();
        numbers();
    }

}