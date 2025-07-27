import java.util.Scanner;
public class Bank {
    static int totalAccounts;
    int bankAccounts;
    int balance;
    public Bank(int a,int b){
        totalAccounts++;
        bankAccounts=a;
        balance=b;
    }
    public void deposit(int amount){
        int depositAmount=amount;
        balance=balance+depositAmount;
    }
    public void show(){
        System.out.println(+bankAccounts);
        System.out.println(+balance);
    }

    public static void main(String[] args){
        System.out.println("2024503543 Risah Ruth R");
        int i=0;
        Scanner ip=new Scanner(System.in);
        char c;

        do{
            int temp1,temp2;
            System.out.println("Enter the account number and balance of the user "+(i+1));
            temp1=ip.nextInt();
            temp2=ip.nextInt();
            if(temp1<0||temp2<0) {
                System.out.println("Not a valid input");
                break;
            }
            Bank users_i=new Bank(temp1,temp2);
            System.out.println("Enter the amount you want to deposit in this account");
            int x=ip.nextInt();
            if(x<0) {
                System.out.println("Not a valid input");
                break;
            }
            users_i.deposit(x);
            System.out.println("The Account details of the user is as below");
            users_i.show();
            i++;
            System.out.println("Enter k if you want to continue else press anything else");
            c=ip.next().charAt(0);
        }while(c=='k'||c=='K');
        System.out.println("The total number of accounts created are "+totalAccounts);
    }
}
