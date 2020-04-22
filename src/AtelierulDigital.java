package AtelierulDigital;

public class AtelierulDigital {
    public static void main(String[] args){
        int i =0;
                for (i=1;i<=100;i++){
                    if(i%3!=0 & i%5!=0){
                        //if(i%7!=0 & i%11!=0)
                            System.out.println(i);
                       // else System.out.println(i%7==0 ? i%11==0 ? "RizzJazz" : "Rizz" : "Jazz");
                    }
                    else System.out.println(i%3==0 ? i%5==0 ? "FizzBuzz" : "Fizz" : "Buzz");


                }
    }
// For stage 2 uncomment the two lines of code.
}