import java.util.Scanner;
class Matrix{
public static void main(String[] args){
System.out.println("2024503543 Risah Ruth R");
int[][] arr=new int[3][3];
int[] sum={0,0,0};
for(int i=0;i<3;i++){
System.out.println("Row:"+(i+1));
for(int j=0;j<3;j++)
{
System.out.println("Enter the element:"+(j+1));
Scanner ip=new Scanner(System.in);
arr[i][j]=ip.nextInt();
sum[j]=sum[j]+arr[i][j];
}}
int max=sum[0];int maxi=0;
System.out.println("The sum of each row are as follows:");
for(int i=0;i<3;i++)
{
System.out.println("Row "+(i+1)+":"+sum[i]);
if(sum[i]>max){
max=sum[i];
maxi=i+1;
}
}
System.out.println("The row with the maximum sum is "+maxi+":"+max);
}
} 

