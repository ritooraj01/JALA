import java.util.*;
public class strings {
    
    public static void main(String[] args) {
        String s = "   cdajhafbjsa";           //Answer 1
        String str = new String("cdajhaibJsa");

        System.out.println(s + str);       //Answer 2

        int x = s.length();     //Answer 3

        String substring = s.substring(3,8 );       //Answer 4

        System.out.println("Length : "+ x + " Substring : "+substring);

        int sa = s.indexOf(str);        //Answer 5
        if(s.equals(str)){          //Answer 7
            System.out.println("equal");
        }
        if(s.equalsIgnoreCase(str)){        //Answer 8
            System.out.println("equal1");
        }
        if(s.startsWith("c") && s.endsWith("a")){   //Answer 8
            System.out.println("True");
        }
        System.out.println(s.compareToIgnoreCase(str));
        s = s.trim();           //Answer 9
        String replace = s.replace(" ","");     //Answer 10
        System.out.println(replace);
        String newstring = "qwertuu@123";
        String[] newstring1 = newstring.split("@",0);   //Answer 11
        for(String a : newstring1){
            System.out.println(a);
        }
        int i =100;
        String q = String.valueOf(i);       //Answer 12 & 13
        System.out.println(i+100);
        System.out.println(q+100);
        System.out.println(s.toUpperCase());        //Answer 14
        
    }
    
}
