import java.util.Scanner;

public class Main{
    static int perimeter(int a, int b){
        return (a+b)*2;
    }
    static int square(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a=scanner.nextInt(), b=scanner.nextInt();
        int s = square(a,b);
        int p = perimeter(a,b);
        System.out.println("Square: " + s + "cm2");
        System.out.flush();
        System.out.println("Perimeter: " + p + "cm");
        scanner.close();
    }
}

// class HelloWorld {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         int a=scanner.nextInt();
//         int b=scanner.nextInt();
//         int s = Main.square(a,b);
//         int p = Main.perimeter(a,b);
//         System.out.println("Square: " + s + "cm2");
//         System.out.flush();
//         System.out.println("Perimeter: " + p + "cm");
//         scanner.close();
//     }
// }