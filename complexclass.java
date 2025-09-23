import java.util.Scanner;
public class complexclass {
    double real,im;
    Scanner ip= new Scanner(System.in);
    complexclass(){
        im=0;
        real=0;
    }
    void getter(){
        System.out.println("Enter the values of the real and imaginary values");
        real=ip.nextDouble();
        im=ip.nextDouble();
    }
    complexclass add(complexclass a){
        complexclass c=new complexclass();
        c.real=real+a.real;
        c.im=im+a.im;
        return c;
    }
    complexclass sub(complexclass a){
        complexclass c=new complexclass();
        c.real=real-a.real;
        c.im=im-a.im;
        return c;
    }
    complexclass multiply(complexclass a) {
        complexclass c = new complexclass();
        c.real = (real * a.real - im * a.im);
        c.im = (real * a.im + im * a.real);
        return c;
    }
    complexclass divide(complexclass a){
        complexclass c=new complexclass();
        c.real=(real*a.real+im*a.im)/(a.real*a.real+a.im*a.im);
        c.im=(im*a.real-real*a.im)/(a.real*a.real+a.im*a.im);
        return c;
    }
    boolean equals(complexclass a){
        if(real==a.real&&im==a.im){
            return true;
        }
        else
            return false;
    }
    public String toString(){
        String a=new String();
        if(im>=0){
            a=real+"+"+im+"i";
        }
        else{
            a=real+"-"+(im*-1)+"i";
        }
        return a;
    }
    public static void main(String[] args){
        complexclass x=new complexclass();
        complexclass y=new complexclass();
        x.getter();
        y.getter();
        System.out.println("Risah Ruth R 2024503543");
        System.out.println("The sum of the two complex numbers is "+(x.add(y)).toString());
        System.out.println("The difference of the two complex number is "+(x.sub(y)).toString());
        System.out.println("The product of the two complex number is "+(x.multiply(y)).toString());
        System.out.println("The division of the two complex number is "+(x.divide(y)).toString());
        System.out.println("(x==y)="+x.equals(y));
    }
}
