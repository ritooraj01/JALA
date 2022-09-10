import java.lang.reflect.Field;

class AccessModifiers {
    
    private String name;
    private int age;

    public AccessModifiers(String name, int age){
        this.name = name;
        this.age = age;
    }

    private String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
        return;
    }

    private int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        AccessModifiers Student = new AccessModifiers("Rituraj", 22);

        Student.setName("Ritu");
        
    }
}
