import java.util.Scanner;
public class String_reverse {
    public static void main(String[] args) {
        System.out.println("2024503543 Risah Ruth R");
        Scanner ip = new Scanner(System.in);
        String a;
        System.out.println("Enter the string");
        a = ip.nextLine();
        char[] arr=a.toCharArray();
        int j=a.length()-1;
        for(int i=0;i<a.length()/2;i++){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        String b=new String(arr);
        System.out.println("The reverse of the entered string is:"+b);
    }
}
