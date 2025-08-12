import java.util.Scanner;
public class static_init {
    int num;
    String name;
    Scanner ip=new Scanner(System.in);
    static int a;static String b;
    static{
        a=56;
        b="ananthi";
        System.out.println("Static initializer block");
    }
    public static void show(){
        System.out.println("Name:"+b+" Marks:"+a);
    }
    void display(){
        System.out.println("Name:"+name+" Marks:"+num);
    }
    public static void main(String[] args){
        System.out.println("2024503543 Risah Ruth R");
        static_init obj=new static_init();
        System.out.println("Enter the name and marks");
        Scanner ip=new Scanner(System.in);
        obj.name=ip.next();
        obj.num=ip.nextInt();
        obj.display();
        show();
    }


}
