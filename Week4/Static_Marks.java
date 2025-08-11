import java.util.Scanner;
public class Static_Marks {
    int num;
    String name;
    static int number;
    static String student;
    Static_Marks(int a,String b){
        num=a;
        name=b;
    }
    static void display(){
        System.out.println("This is a static method");
        System.out.println("(static data) Name:"+student+"\nMarks:"+number);
    }
    void show(){
        System.out.println("This is object method and the datas are:"+num+" "+name);
    }

    public static void main(String[] args){
        System.out.println("2024503543 Risah Ruth R");
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the name and marks");
        int x;String y;
        y=ip.next();
        x=ip.nextInt();
        Static_Marks obj=new Static_Marks(x,y);
        System.out.println("Enter the name and marks");
        student=ip.next();
        number=ip.nextInt();
        display();
        obj.show();
    }
}
