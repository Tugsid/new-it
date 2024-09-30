// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = sc.nextInt();
        while(n > 1) { 
            int nmax = sc.nextInt();
            if (nmax > max) max = nmax;
            n--;
        }
        
        System.out.println(max);
        sc.close();
    }
}