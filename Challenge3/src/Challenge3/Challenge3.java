package Challenge3;
import java.util.Arrays;
import java.util.Scanner;
public class Challenge3 {
    public static void main(String args[]) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = Keyboard.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            a[i] = Keyboard.nextInt();
        }

        int perechide0=0;
        int track=0;
        for (int i=0; i<n; i++) {
        if(a[i]==0) perechide0++;
        }
        track=track+ perechide0/2;

        for (int i=0; i<n-1; i++) {
            for(int j=i+1; j<n;j++)
                if(a[i]+a[j]==0 & a[i]!=0){
                    track++;
                    a[i]=0;
                    a[j]=0;
                }


            }

        System.out.println(track);
    }
}