import java.util.Scanner;
public class stringtochar
{
public static void main(String[] args)
{
System.out.println("2024503543 Risah Ruth R");
String org,lower;
Scanner ip=new Scanner(System.in);
System.out.println("Enter the string");
org=ip.nextLine();
lower=org.toLowerCase();
System.out.println("The lower case string of the input is "+lower);
char[] arr=org.toCharArray();
int[] vowel={0,0,0,0,0};
for(int i=0;i<org.length();i++)
{
char c=arr[i];
switch(c){
case 'a':
vowel[0]++;
break;
case 'e':
vowel[1]++;
break;
case 'i':
vowel[2]++;
break;
case 'o':
vowel[3]++;
break;
case 'u':
vowel[4]++;
break;
}}
System.out.println("The frequency of the vowels are as below:");
System.out.println("a:"+vowel[0]);
System.out.println("e:"+vowel[1]);
System.out.println("i:"+vowel[2]);
System.out.println("o:"+vowel[3]);
System.out.println("u:"+vowel[4]);
}
}
