package com.package1;
import com.package2.*;

public class Access {
    private String name = "Rituraj";        //Answer 1
    private int age = 22; 

    protected String yourname1 = "Rituraj Protected Diff";      //Answer 3

    protected void studpro1(){
        System.out.println("Protected Method in Different class");
    }

    private void student(){
        String name = "Singh";
        System.out.println(name);
    }

    class Sub extends Access{
        private String name = "Ritu";
        private int age = 22; 

        private void studentSub(){
            String name = "RSingh";
            System.out.println(name);
    }
    }
    
    public static void main(String[] args) {
        Access obj = new Access();
        Sub obj1 = obj.new Sub();

        System.out.println(obj.name);            //Answer 1
        obj.student();

        System.out.println(obj1.name);
        obj1.studentSub();

        Access2 objDef = new Access2();         /*Answer 2 - We can Access default fields but not default methods
                                                            from any other class in the same package */
        System.out.println(objDef.name);                      // However we can access it by Inteface

        Access4 objPro = new Access4();

        System.out.println(objPro.yourname);       //Answer 3
        objPro.studpro();

        

    }
}