class A{
public void show(){
System.out.println("class A's method");
A type(){
System.out.println("The method with super class return type");
return new A();
}
void func1(int a,int b){
System.out.println("The overloading method with two parameters in different class");
}
}}
class B extends A{
private int show(int x){
System.out.println("Class B's method");
return 0;
}
B type(){
System.out.println("The method with child class return type");
return new B();
}
int demo(int a){
System.out.println("The method with int return type");
}
float demo(int a){
System.out.println("The method with float return type");
}
void func1(int a){
System.out.println("The overriding function with one parameter in different class");
}
void func(int a){
System.out.println("The overloading function with one parameter in same class");
}
void func(int a,int b){
System.out.println("The overloading function with two parameter in same class");
}
static void eg(int a){
System.out.println("The static function with one parameter");
}
static void eg(int a,int b){
System.out.println("The static function with two parameters");
}
}
public class over_ride {
public static void main(String[] args){
System.out.println("Risah Ruth R 2024503543");
B obj=new B();
B.show(5);
B obj1=new A();
obj1.show();
obj.func(5);
obj.func(5,10);
obj.demo(6);
obj.demo(8);
eg(7);
eg(69);
obj1.func1(2,7);
obj.func(8);
obj1=new B();
}}
