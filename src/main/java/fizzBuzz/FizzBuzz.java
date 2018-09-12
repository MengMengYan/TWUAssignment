package fizzBuzz;

public class FizzBuzz {

    public FizzBuzz(){
        for (int i = 1; i <= 100; i++) {
            decideFizzBuzz(i);
        }
    }

    private void decideFizzBuzz(int i) {
        StringBuilder output = new StringBuilder();

        if(isDivisibleByThree(i)) output.append("Fizz");
        if(isDivisibleByFive(i)) output.append("Buzz");
        if(output.length() == 0) System.out.println(i);
        else System.out.println(output);
    }

    private boolean isDivisibleByFive(int i) {
        if (i % 5 != 0) return false;
        return true;
    }

    private boolean isDivisibleByThree(int i) {
        if (i % 3 != 0) return false;
        return true;
    }


}
