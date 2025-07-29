import java.util.Scanner;
class Traffic{
public static void main(String[] args)
{
System.out.println("2024503543 Risah Ruth R");
Scanner ip=new Scanner(System.in);
String color;
System.out.println("Enter the Traffic light color");
color=ip.nextLine();
color=color.toLowerCase();
switch(color){
case "red":
System.out.println("Stop");
break;
case "yellow":
System.out.println("Ready to move");
break;
case "green":
System.out.println("Go");
break;
default:
System.out.println("Not a valid color");
break;
}
}
}
