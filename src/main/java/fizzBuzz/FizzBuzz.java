package fizzBuzz;

public class FizzBuzz {

    public FizzBuzz() {
        String result = "";
        for (int i = 1; i <= 100; i++) {
            result += decideFizzBuzz(i) + "\n";
        }

        System.out.println(result.trim());
    }


    public String decideFizzBuzz(int input) {
        if (input % 15 == 0) {
            return "FizzBuzz";
        }
        if (input % 3 == 0) {
            return "Fizz";
        }
        if (input % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(input);
    }
}
