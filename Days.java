
import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of days: ");
        int totalDays = sc.nextInt();
        
        int years = totalDays / 365;
        int remainingDaysAfterYears = totalDays % 365;
        
        int months = remainingDaysAfterYears / 30;
        int days = remainingDaysAfterYears % 30;
        
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
        
        sc.close();
    }
}


