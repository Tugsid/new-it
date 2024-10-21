import java.util.Scanner;

public class Main {
  
    static class Time {
        int min;

        public Time(int m) {
            min = m;
        }
        
        public void mtt() {
            int hours = min / 60;
            int minutes = min % 60;
            System.out.println(hours + ":" + String.format("%02d", minutes));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter min:");
        int min = scanner.nextInt();
        
        Time myTime = new Time(min);
        myTime.mtt();
        
        scanner.close();
    }
}