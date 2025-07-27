import java.util.Scanner;

class Temperature{
public static void main(String[] args){
System.out.println("2024503543 Risah Ruth R");
float cel,fahrenheit;boolean hot;
Scanner ip=new Scanner(System.in);
System.out.println("Enter the temperature in celcius");
cel=ip.nextFloat();
fahrenheit=(cel*(9/5))+32;
System.out.println("Celcius="+cel+" Fahrenheit="+fahrenheit);
if(fahrenheit>=100)
hot=true;
else
hot=false;
System.out.println("It is hot:"+hot);
}}
