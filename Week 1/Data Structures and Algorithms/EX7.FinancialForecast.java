import java.util.*;

public class FinancialForecast {

    static double forecast(double amount, double rate, int years) {
        if (years == 0) return amount;
        return forecast(amount * (1 + rate / 100), rate, years - 1);
    }

  
    static double forecastMemo(double amount, double rate, int years, Map<Integer, Double> memo) {
        if (years == 0) return amount;
        if (memo.containsKey(years)) return memo.get(years);
        double result = forecastMemo(amount * (1 + rate / 100), rate, years - 1, memo);
        memo.put(years, result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current value (₹): ");
        double initialAmount = sc.nextDouble();

        System.out.print("Enter annual growth rate (%): ");
        double growthRate = sc.nextDouble();

        System.out.print("Enter number of years to forecast: ");
        int years = sc.nextInt();

        double result = forecast(initialAmount, growthRate, years);
        System.out.printf("\nFuture Value after %d years: ₹%.2f\n", years, result);


        Map<Integer, Double> memo = new HashMap<>();
        double optimizedResult = forecastMemo(initialAmount, growthRate, years, memo);
        System.out.printf("Optimized Recursive Result: ₹%.2f\n", optimizedResult);
    }
}
