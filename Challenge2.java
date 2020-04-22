package Challenges;
import java.util.Scanner;
public class Challenge2 {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter an integer= ");
        int n = keyboard.nextInt();

        System.out.println(Compute2(n));
    }
    private static String Compute (int n){
        String numar="";
    int x=n;
    int y=0;
    while (x!=0){
        y=x%10;
        if(y==3)numar="Foo"+numar;
        if(y==5)numar="Bar"+numar;
        if(y==7)numar="Qix"+numar;
        x=x/10;
    }
    if(n%7==0)numar="Qix"+numar;
    if(n%5==0)numar="Bar"+numar;
    if(n%3==0)numar="Foo"+numar;

    if(numar=="") return (numar+n);
    else return numar;
    }

    private static String Compute2 (int n){
        String numar="";
        int x=n;
        int g=n;
        int y=0;
        while (x!=0){
            y=x%10;
            if(y==3)numar="Foo"+numar;
            if(y==5)numar="Bar"+numar;
            if(y==7)numar="Qix"+numar;
            if(y==0)numar="*"+numar;
            x=x/10;
        }
        if(n%7==0)numar="Qix"+numar;
        if(n%5==0)numar="Bar"+numar;
        if(n%3==0)numar="Foo"+numar;
        if (numar.equals("*")) numar="";
        if(numar==""){
            while(g!=0){
                if(g%10!=0) numar=numar+g%10;
                else numar=numar+"*";
                g=g/10;
            }

        }
       return numar;
    }

}
