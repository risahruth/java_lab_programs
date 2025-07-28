import java.util.Scanner;
public class Attendance {
    public static void main(String[] args)
    {
        System.out.println("2024503543 Risah Ruth R");
        Scanner ip=new Scanner(System.in);
        int[][] Student= new int[5][8];
        for(int i=0;i<5;i++){
            System.out.println("Attendance for day:"+(i+1));
            for(int j=0;j<8;j++){
                System.out.println("Enter Attendance for period:"+(j+1));
                Student[i][j]=ip.nextInt();
                if((Student[i][j]!=1)&&(Student[i][j]!=0)){
                    System.out.println("Not a valid input");
                    System.exit(1);
                    return;
                }
            }
        }
        float sum=0;float sum2=0;
            for(int i=0;i<5;i++)
            {   sum=0;
                System.out.println("Attendance percentage for day:"+(i+1));
                for(int j=0;j<8;j++)
                {
                    sum=sum+Student[i][j];
                }
                sum2=sum2+sum;
                sum=(sum/8)*100;
                System.out.println(+sum);
            }
            sum2=(sum2/40)*100;
            System.out.println("The weekly Attendance percentage of the student is "+sum2);
        }
}
