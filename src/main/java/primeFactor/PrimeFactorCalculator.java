package primeFactor;

public class PrimeFactorCalculator {

    public void generate(int n){
        StringBuilder output = new StringBuilder();

        for (int i = 2; i < n/2; i++) {
            if (isPrime(i)) if(n % i == 0) {
                output.append(i);
                output.append("'");
            }
        }

        System.out.println(output.deleteCharAt(output.length() - 1));
    }

    private boolean isPrime(int n){
        for (int i = 2; i < n/2; i++){
            if (n % i == 0) return false;
        }
        return true;
    }
}
