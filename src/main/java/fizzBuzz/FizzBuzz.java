package fizzBuzz;

public class FizzBuzz {

    public FizzBuzz() {

    }


    public String decideFizzBuzz(int input) {
        if (input == 15) {
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
