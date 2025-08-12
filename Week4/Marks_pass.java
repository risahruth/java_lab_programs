import java.util.Scanner;
public class Marks_pass {
    float num;
    String name;
    Marks_pass(){}
    Marks_pass(int a,String b){
        num=a;
        name=b;
    }
    Marks_pass calc_avg(Marks_pass a){
        Marks_pass x=new Marks_pass();
        x.name="Student average";
        x.num=(num+a.num)/2;
        return x;
    }
    void display(){
        System.out.println("Name:"+name+" Marks:"+num);
    }

    public static void main(String[] args){
        System.out.println("2024503543 Risah Ruth R");
        Scanner ip=new Scanner(System.in);
        int x;String y;
        System.out.println("Enter the name and mark");
        y=ip.next();
        x=ip.nextInt();
        Marks_pass obj=new Marks_pass(x,y);
        System.out.println("Enter the name and mark");
        y=ip.next();
        x=ip.nextInt();
        Marks_pass obj1=new Marks_pass(x,y);
        Marks_pass obj2=obj.calc_avg(obj1);
        obj.display();
        obj1.display();
        obj2.display();
    }
}
