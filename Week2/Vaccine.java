import java.util.Scanner;
class Vaccine{
public static void main(String[] args)
{
System.out.println("2024503543 Risah Ruth R");
int age,aptno;
Scanner ip=new Scanner(System.in);
System.out.println("Enter the age and appointment number");
age=ip.nextInt();
aptno=ip.nextInt();
int a=aptno;
if(age>=18&&age<=65)
{
System.out.println("You are eligible for vaccine");
int k=0;
while(a>0)
{
k++;
a=a/10;
}
if(k==3)
{
System.out.println("Your Appointment number is verified");
if(aptno%2==0)
System.out.println("You are assingned a priority slot");
else
System.out.println("You are assigned a normal slot");
int x=aptno%10;
switch(x){
case 1:
System.out.println("Gift:Pen");
break;
case 2:
System.out.println("Gift:Mask");
break;
case 3:
System.out.println("Sanitizer");
break;
default:
System.out.println("No other gifts");
break;
}
}
else
System.out.println("Not a verified Appointment number");
}
else
System.out.println("Not eligible for vaccine");
}}
