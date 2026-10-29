public class CompoundInterest {
    public static void main(String[] args) {

        double P = 10000;
        double R = 10;
        double T = 2;

        // Calculate total amount
        double amount = P * Math.pow(1 + R / 100, T);

        // Calculate compound interest
        double CI = amount - P;

        System.out.println("Compound Interest = " + CI);
        System.out.println("Amount = " + amount);
    }
}