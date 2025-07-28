import java.util.Scanner;
class Login{
public static void main(String[] args)
{
System.out.println("2024503543 Risah Ruth R");
String user,password;
Scanner ip=new Scanner(System.in);
user="admin";
password="Risah@2006";
String usr,pw;
int failcount=0;
char c;
do{
System.out.println("Enter your username");
usr=ip.next();
System.out.println("Enter your password");
pw=ip.next();
if(!(usr.equals(user))&&(!(pw.equals(password))))
failcount++;
System.out.println("Enter k if you want to continue else press anything else");
c=ip.next().charAt(0);
}while(c=='k'||c=='K');
System.out.println("The total number of failed attempts are "+failcount);
}}

