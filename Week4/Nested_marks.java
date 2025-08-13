package nested_static;

public class Nested_marks {
    static int x=50;
    private static class Private_inner{
        void show(){
            System.out.println("This is private nested class which cannot be accessed outside by other class");
            System.out.println("The public outer data in this class is "+x);
        }
    }
    public static class Public_inner{
         public static void display(){
            System.out.println("This is public inner class and can be accessed by other classes");
            System.out.println("The public outer data is "+x);
        }
    }
    public void demo(){
        Private_inner obj=new Private_inner();
        obj.show();
        Public_inner obj1=new Public_inner();
        obj1.display();
    }
}
