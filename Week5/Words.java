import java.util.Scanner;
public class Words {
    public static void main(String[] args){
        System.out.println("2024503543 Risah Ruth R");
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the string");
        String a;
        a=ip.nextLine();
        String[] str=a.split(" ");
        int count=str.length;
        System.out.println("The number of words in the given string is:"+count);
    }
}
