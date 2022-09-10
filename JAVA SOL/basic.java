import java.util.*;     //Package

    public class basic {    //Class
        int x = 10;             // Global Variable
    
        static void method(String name){      //Method and its Signature
    
            System.out.print("Your Name is "+ name);    //Question 2 - program to print your name
        }
    
        public static void main(String[] args) {
            basic obj = new basic();     //Object
            System.out.print(obj.x+" ");                  // Question 4 & 5- Print on console & calling Gobal Variable 
            int x =20;          // Local Variable
            Scanner sc = new Scanner(System.in);    //Calling Scanner class
            String name = sc.nextLine();    //Input
    
            method(name);       //Question 6 - Calling Method
        }
    }
    
    // Question 3 -
    //Single Line Comment       
    /*Multi Line Comment */
    /**Documentation Comment */