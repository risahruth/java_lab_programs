import java.util.Scanner;
public class Marks_avg {
    int num;
    String name;
    Marks_avg(int num ,String name){
        this.num=num;
        this.name=name;
    }
    float calc_avg(Marks_avg obj){
        return (num+obj.num)/2;
    }
    public static void main(String[] args){
        System.out.println("2024503543 Risah Ruth R");
        System.out.println("Enter the marks and name of the student");
        int num;String name;
        Scanner ip=new Scanner(System.in);
        num=ip.nextInt();
        name=ip.next();
        Marks_avg obj=new Marks_avg(num,name);
        System.out.println("The name and marks of the student using constructor is "+obj.num+" and "+obj.name);
        System.out.println("Enter the name and marks of the second student");
        num=ip.nextInt();
        name=ip.next();
        Marks_avg obj2=new Marks_avg(num,name);
        float c=obj.calc_avg(obj2);
        System.out.println("The average of the marks is "+c);
    }

}
