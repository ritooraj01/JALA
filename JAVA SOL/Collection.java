import java.util.*;

import javax.swing.SortingFocusTraversalPolicy;

class Collection {
    static void array(){
        ArrayList<String> as = new ArrayList<>(Arrays.asList("Anuj" , "Ritu" , "Raj" , "Vicky" , "Surya" , "Tanmay" , "Shiv" , "Sid" , "Akash" , "Rohan"));

        as.add("Shivangi");
        as.add(2 , "Shivi");
        as.remove(1);
        as.set(2, "Ritu");
        System.out.println(as.get(2));
        System.out.println(as.size());
        System.out.println(as.indexOf("Vicky"));
        System.out.println(as.contains("Sid"));
        

        for(int i =0; i<as.size(); i++){
            System.out.print(as.get(i)+ "  ");
        }
        
        as.removeAll(as);
        System.out.println(as);
    }

    static void hashmap(){
        HashMap<Integer , String> student = new HashMap<>();
        student.put(10, "Anuj");
        student.put(11, "Ritu");
        student.put(12,"Raj");
        student.put(13,"Vicky");
        student.put(14,"Surya");
        student.put(15,"Tanmay");
        student.put(16,"Shiv");
        student.put(17,"Sid");
        student.put(18,"Akash");
        student.put(19,"Rohan");

        student.remove(16);

        System.out.println(student);
        System.out.println(student.values());
        System.out.println(student.entrySet());
        System.out.println(student.get(12));

        HashMap<Integer , String> a = (HashMap<Integer , String>)student.clone();

        System.out.println(student.containsKey(18));
        System.out.println(student.containsValue("Anuj"));
        System.out.println(student.isEmpty());
        System.out.println(student.size());
        System.out.println(student.keySet());
        System.out.println(student.values());

        System.out.println("Clone : " + a);
    }

    static void hashset(){
        HashSet<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        set.add("six");
        System.out.println(set);

        set.remove("two");
        HashSet<String> newset = new HashSet<String>();

        newset.add("seven");
        newset.add("eight");

        set.addAll(newset);
        System.out.println(set);
        set.removeAll(newset);
        System.out.println(set);
        set.clear();
        System.out.println(set);
    }
    public static void main(String[] args) {
        hashset();
    }
}
