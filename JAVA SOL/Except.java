class Except{
    static void devide(int a , int b){     //Answer 1 & 3
        int res;
        res = a/b;
        System.out.println(res);
    try {
        
        res = a/b;
        System.out.println(res);
        
    } 
    catch (ArithmeticException e) {         //Answer 2 & 8
        System.out.println("You should not devide it");
    }
}

static void multiexcept(){          //Answer 3
    
    try {
        int arr[] = new int[5];
        arr[11] = 20;       //Answer 9
        arr[5] = 5/0;
        
    } catch (ArithmeticException e) {
        System.out.println("Arithmetic Exception occur");
    }
    catch(IndexOutOfBoundsException e){
        System.out.println("IndexOutOfBoundsException Occur");      //Answer 9
    }
    catch(Exception e){
        System.out.println("Parent Exception Ocuur");
    }

    try{
        Class.Exp("Hello");     //Answer 10
    }
    catch (ClassNotFoundException ex){
        ex.printStackTrace();
    }

}
    public static void main(String[] args) {
    multiexcept();
    throw new ArithmeticException("My message");        //Answer 5

    // try{
    // throw new MyCustomExpection();          //Answer 6
    // }
    // catch (MyCustomExpection ex){
    //     System.out.println("Caught Exception");
    //     System.out.println(ex.getMessage());
    // }
    
}
}