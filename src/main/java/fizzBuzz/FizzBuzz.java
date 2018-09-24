package fizzBuzz;

public class FizzBuzz {

    public FizzBuzz() {

    }


    public String decideFizzBuzz(int input) {
        if (input == 3) {
            return "Fizz";
        }
        return String.valueOf(input);
    }
}
