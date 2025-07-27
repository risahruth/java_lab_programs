import java.util.Scanner;

class BMI{
public static void main(String[] args){
System.out.println("2024503543 Risah Ruth R");
double height,weight,bmi;
boolean b;
Scanner ip=new Scanner(System.in);
System.out.println("Enter the height(in m) and weight(in kg) of the person");
height=ip.nextDouble();
weight=ip.nextDouble();
bmi=(weight/(height*height));
if(bmi<=18.5&&bmi<=25)
{
b=true;
System.out.println("The BMI of the person("+bmi+") is normal");
}
else {
b=false;
System.out.println("The BMI of the person("+bmi+") is not normal");
}}}
