class NeonNumber2 {
    public static boolean checkNeon(int n) {
        int square = n * n; 
        int sum = 0;
        while (square > 0) {
            sum += square % 10; 
            square /= 10;    
        }
        return sum == n;
    }
    public static void main(String[] args) {
        int n = 9;
        if (checkNeon(n))
            System.out.println("Given number " + n + " is a Neon number");
        else
            System.out.println("Given number " + n + " is not a Neon number");
    }
}