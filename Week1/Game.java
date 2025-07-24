import java.util.Scanner;

class Game{
public static void main(String[] args){
int runs;short foul;boolean win;
System.out.println("2024503543 Risah Ruth R");
System.out.println("Enter the number of runs and fouls of the player");
Scanner ip=new Scanner(System.in);
runs=ip.nextInt();
foul=ip.nextShort();
if(runs>=50&&foul<=5)
win=true;
else
win=false;
System.out.println("win status of the player is "+win);
}}
