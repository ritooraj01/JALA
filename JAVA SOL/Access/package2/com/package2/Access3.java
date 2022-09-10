package com.package2;
import com.package1.*;

class Access3 extends Access {
    public static void main(String[] args) {
        Access3 obj = new Access3();            //Answer 3
        System.out.println(obj.yourname1);
        obj.studpro1();
    }
}