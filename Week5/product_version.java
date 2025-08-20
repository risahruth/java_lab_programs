import java.util.Scanner;
class product_version{
public static void main(String[] args){
System.out.println("2024503543 Risah Ruth R");
String a,b;
Scanner ip=new Scanner(System.in);
System.out.println("Enter the first string");
a=ip.nextLine();
System.out.println("Enter the second string");
b=ip.nextLine();
String[] c=a.split("\\.");
String[] d = b.split("\\.");

        int length = Math.max(c.length, d.length);

        for (int i = 0; i < length; i++) {
            int num1 = i < c.length ? Integer.parseInt(c[i]) : 0;
            int num2 = i < d.length ? Integer.parseInt(d[i]) : 0;

            if (num1 > num2) {
                System.out.println("The product version " + a + " is greater than " + b);
                return;
            } else if (num1 < num2) {
                System.out.println("The product version " + a + " is lesser than " + b);
                return;
            }
        }

        System.out.println("The product versions " + a + " and " + b + " are equal");
}}
