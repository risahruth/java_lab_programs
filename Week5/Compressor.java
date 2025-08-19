import java.util.Scanner;
public class Compressor {
    public static void main(String[] args){
        System.out.println("2024503543 Risah Ruth R");
        Scanner ip=new Scanner(System.in);
        String a,coma="";
        System.out.println("Enter the uncompressed String");
        a=ip.nextLine();
        char[] arr=a.toCharArray();
        int count=1;
        for(int i=0;i<a.length();i++){
            if(i+1<a.length()&&arr[i]==arr[i+1]){
                count++;
            }
            else{
                coma+=arr[i];
                coma+=count;
                count=1;
            }
        }
        if(a.length()==coma.length()){
            coma=a;
        }
        System.out.println("The compressed String is:"+coma);
    }
}
