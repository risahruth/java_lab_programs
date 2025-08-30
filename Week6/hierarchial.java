
class livingbeing{
    livingbeing(String name){
        System.out.println("The living being's name is "+name);
    }
    void breath(){
        System.out.println("The living being can breathe");
    }
    void response(){
        System.out.println("The living being's response");
    }
}
class landanimal extends livingbeing{
    landanimal(String name){
        super(name);
        System.out.println("The land animal name is "+name);
    }
    void walk(){
        System.out.println("The land animal can walk ");
    }
    void noOfLegs(){
        System.out.println("The land animal has legs");
    }
}
class wateranimal extends livingbeing{
    wateranimal(String name){
        super(name);
        System.out.println("The water animal name is"+name);
    }
    void swim(){
        System.out.println("The water animal can swim");
    }
    void waterType(){
        System.out.println("The water animal swims in fresh water");
    }
}
class dog extends landanimal{
    dog(String name){
        super(name);
        System.out.println("The dog name is "+name);
    }
    void bark(){
        System.out.println("The dog barks");
    }
}
class cat extends landanimal{

    cat(String name) {
        super(name);
        System.out.println("The cat name is "+name);
    }
    void meow(){
        System.out.println("The cat meows");
    }
}
public class hierarchial {
    public static void main(String[] args) {
        dog a = new dog("Pomerian");
        cat b = new cat("Larry");
        a.bark();
        b.meow();
        wateranimal c=new wateranimal("Prawn");
        c.swim();
        c.waterType();
        a.walk();
        a.noOfLegs();
        b.breath();
        b.response();
    }
}
