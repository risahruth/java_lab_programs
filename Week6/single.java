class Livingbeing {
    void breath() {
        System.out.println("The living being can breath");
    }

    void response() {
        System.out.println("The living being's response");
    }

}
class Animal extends Livingbeing {
    void walk() {
        System.out.println("The animal can walk");
    }

    void nooflegs() {
        System.out.println("The animal has legs");
    }
}

public class single {
    public static void main(String[] args){
        System.out.println("Risah Ruth R 2024503543");
        Animal obj=new Animal();
        obj.breath();
        obj.response();
        obj.walk();
        obj.nooflegs();
    }
}
