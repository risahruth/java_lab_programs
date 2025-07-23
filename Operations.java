import java.util.Scanner;

class Operations
{
public static void main(String[] args)
{
double a,b;char c;
System.out.println("2024503543 Risah Ruth R");
System.out.println("Enter any two integers or double values");
Scanner ip=new Scanner(System.in);
a=ip.nextDouble();
b=ip.nextDouble();
System.out.println("Enter the kind of operation you want to perform on the two numbers");
c=ip.next().charAt(0);
switch(c){
case '+':{
System.out.println(a+b);
break;
}
case '-':{
System.out.println(a-b);
break;
}
case '*':{
System.out.println(a*b);
break;
}
case '/':{
System.out.println(a/b);
break;
}
}}}


