import javax.sql.rowset.spi.SyncResolver;

class thisNsuper {
    int minAge = 18;

    // thisNsuper(int minAge){          //Answer 1
    //     this.minAge = minAge;
    // }

    void display(){System.out.println(minAge);}}

    class Subs extends thisNsuper{          //Answer 2
        int minAge = 19;
        
        void display(){
            super.display();            //Answer 5 & 6
            System.out.println(minAge);
            System.out.println(super.minAge);
        }
    
    }

    class A{
        int age = 18;           //Answer 4
        A(){
            System.out.println("Hello");        
        }
        A (int x, int age){
            
            this();             //Answer 3
            System.out.println(x +" "+ age);
        }
    }
    class test{
    
    public static void main(String[] args) {
        Subs obj = new Subs();
        obj.display();
    }
    }