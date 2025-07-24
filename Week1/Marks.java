import java.util.Scanner;

class Marks{
public static void main(String[] args)
{
System.out.println("2024503543 Risah Ruth R");
float[] m=new float[3];
float sum=0;float avg;char grade='a';boolean pass;
Scanner ip=new Scanner(System.in);
System.out.println("Enter the marks in three subjects");
for(int j=0;j<3;j++){
m[j]=ip.nextFloat();
sum=sum+m[j];
}
avg=sum/3;
if(m[0]>50&&m[1]>50&&m[2]>50){
if(avg>90)
grade='S';
else if(avg>80)
grade='A';
else if(avg>70)
grade='B';
else if(avg>60)
grade='C';
}
else
grade='U';
if(avg>=50)
pass=true;
else 
pass=false;
System.out.println("Total="+sum+" Average="+avg+" Grade="+grade+" Pass status=" +pass);
}}
