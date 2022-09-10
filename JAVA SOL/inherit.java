class inherit {
    public void eat()
    {
       System.out.println("Human is eating");
    }
    public void region(){}
 }
 class Boy extends inherit{
    //Overriding method
    public void eat(){
       System.out.println("Boy is eating");
    }
    public void height(){
        System.out.println("Boy is Tall");
    }
    class Girl extends Boy{
        //Overriding method
        public void eat(){
        System.out.println("Girl is eating");
        }

        static void looks(){
            System.out.println("Girl is smart");
        }
    }

    public static void main(String[] args) {
        Boy obj = new Boy();
        Girl obj1 = new Girl();
        obj.height();
        looks();
        
        inherit obj2 = new inherit();
        obj2.eat();
    }
}