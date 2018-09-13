package primeFactor;

public class PrimeFactorCalculator {

    public void generate(int n){
        StringBuilder output = new StringBuilder();

        if(n > 1) {
            for (int i = 2; i <= n / 2 + 1; i++) {
                if (isPrime(i)) if (n % i == 0) {
                    output.append(i);
                    output.append(",");
                }
            }

            System.out.println(output.deleteCharAt(output.length() - 1));
        }
    }

    private boolean isPrime(int n){
        for (int i = 2; i <= n/2 + 1; i++){
            if (n % i == 0 && n != i) return false;
        }
        return true;
    }
}
