public class Para_Marks{
    int num;
    String name;
    Para_Marks(){}
    Para_Marks(int a){
        this.num=a;
    }
    Para_Marks(int a,String b){
        this.num=a;
        this.name=b;
    }
    public static void main(String[] args){
        Para_Marks obj=new Para_Marks();
        System.out.println("2024503543 Risah Ruth R");
        System.out.println("The value with default constructor");
        System.out.println(obj.num+" and "+obj.name);
        System.out.println("The values with single parameter constructor");
        Para_Marks obj1=new Para_Marks(5);
        System.out.println(obj1.num+" and "+obj1.name);
        Para_Marks obj2=new Para_Marks(8,"risah");
        System.out.println("The values with double parameter constructor");
        System.out.println(obj2.num+" and "+obj2.name);
    }

}
