
public class nested_mark {
     static int x=50;
    private class Private_inner{
        void show(){
            System.out.println("This is private nested class which cannot be accessed outside by other class");
            System.out.println("The public outer data in this class is "+x);
        }
    }
    public class Public_inner{
         public void display(){
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
    

