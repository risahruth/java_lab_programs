import java.util.Scanner;
class anagram{
public static void main(String[] args){
System.out.println("2024503543 Risah Ruth R");
Scanner ip=new Scanner(System.in);
System.out.println("Enter the string");
String a,b;
a=ip.nextLine();
a=a.toLowerCase();
System.out.println("Enter the second string");
b=ip.nextLine();
b=b.toLowerCase();
char[] arr=a.toCharArray();
char[] arra=b.toCharArray();
int count=0;
if(a.length()==b.length()){
for(int i=0;i<a.length();i++){
for(int j=0;j<b.length();j++){
if(arr[i]==arra[j]){
count++;
arra[j]='0';
break;
}
}}
if(count==a.length())
System.out.println("The given strings are anagram");
else
System.out.println("The given strings are not anagram");
}
else{
System.out.println("The given strings are not anagram");
}
}}



