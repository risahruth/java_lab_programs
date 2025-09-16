
class ani{
    void move(){
        System.out.println("The animal moves");
    }
    void move(String direction){
        System.out.println("The animal moves "+direction);
    }
    void move(int distance){
        System.out.println("The animal moves "+distance+" meters");
    }
    void move(String direction,int distance){
        System.out.println("The animal moves "+distance+" meters "+direction);
    }
}
class Dog extends ani{
    void move(){
        System.out.println("The Dog moves");
    }
    void move(String direction){
        System.out.println("The Dog moves "+direction);
    }
    void move(int distance){
        System.out.println("The Dog moves "+distance+" meters");
    }
    void move(String direction,int distance){
        System.out.println("The Dog moves "+distance+" meters "+direction);
    }
}
class Cat extends ani{
    void move(){
        System.out.println("The cat moves");
    }
    void move(String direction){
        System.out.println("The cat moves "+direction);
    }
    void move(int distance){
        System.out.println("The cat moves "+distance+" meters");
    }
    void move(String direction,int distance){
        System.out.println("The cat moves "+distance+" meters "+direction);
    }
}
class bird extends ani{
    void move(){
        System.out.println("The bird moves");
    }
    void move(String direction){
        System.out.println("The bird moves "+direction);
    }
    void move(int distance){
        System.out.println("The bird moves "+distance+" meters");
    }
    void move(String direction,int distance){
        System.out.println("The bird moves "+distance+" meters "+direction);
    }
}
public class animal_move {
    public static void main(String[] args){
        ani[] obj={new ani(),new Dog(), new Cat(), new bird()};

        for(int i=0;i<obj.length;i++){
            obj[i].move();
            obj[i].move("West");
            obj[i].move(100);
            obj[i].move("East",100);
        }
        Dog a=new Dog();
        a.move();
        a.move("South");
        a.move(200);
        a.move("North",500);
    }
}
