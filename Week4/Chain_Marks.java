import java.util.Scanner;
public class Chain_Marks {
    Scanner ip=new Scanner(System.in);
    int num;
    String name;
    Chain_Marks(){
        this(90,"Muthu");
        System.out.println("Default constructor");
    }
    Chain_Marks(int a,String b){
        this.num=a;
        this.name=b;
        System.out.println("Parametrized constructor");
    }
    void display(){
        System.out.println("Name:"+name+" Marks:"+num);
    }
    public static void main(String[] args){
        System.out.println("2024503543 Risah Ruth R");
        Chain_Marks obj=new Chain_Marks();
        obj.display();
    }


}
