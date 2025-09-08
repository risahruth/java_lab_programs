class livingbeing {
    void Breath() {
        System.out.println("The living being can breath");
    }

    void Response() {
        System.out.println("The living being's response");
    }

}
class animal extends livingbeing {
    void Walk() {
        System.out.println("The animal can walk");
    }
    void Nooflegs() {
        System.out.println("The animal has legs");
    }
}
class cat extends animal{
    void meow(){
        System.out.println("The cat meows");
    }
}
class dog extends cat{
    void bark(){
        System.out.println("The dog barks");
    }
}
public class multilevel {
    public static void main(String[] args) {
        dog obj = new dog();
        obj.bark();
        obj.meow();
        obj.Walk();
        obj.Nooflegs();
        obj.Breath();
        obj.Response();
    }
}
