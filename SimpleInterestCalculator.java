import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input Principal, Rate, and Time
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter Rate of Interest (per annum): ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();
        
        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;
        
        // Calculate Total Amount
        double amount = principal + simpleInterest;
        
        // Display results
        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Total Amount = " + amount);
        
        sc.close();
    }
}

