package inputManager;

import fizzBuzz.FizzBuzz;
import primeFactor.PrimeFactorCalculator;
import shapeCreation.DiamondCreator;
import shapeCreation.TriangleCreator;

public class IntroductoryExerciseInput {

    public static void main(String[] args){

        //TODO create some switch case to navigate between different commands

        System.out.println("You may use the following actions");
        printHelp();

        InputRetriever retriever = new InputRetriever();
        String stringInput = retriever.getStringInput();

        int intInput = retriever.getIntInput();

        TriangleCreator triangleCreator = new TriangleCreator();

        triangleCreator.printAsterisk();
        triangleCreator.drawHorizontalLine(intInput);
        triangleCreator.drawVerticalLine(intInput);
        triangleCreator.drawRightTriangle(intInput);

        DiamondCreator diamondCreator = new DiamondCreator();
        diamondCreator.drawIsoscelesTriangle(intInput);
        diamondCreator.drawDiamond(intInput);
        diamondCreator.drawDiamondWithMyName(intInput);

        new FizzBuzz();

        PrimeFactorCalculator primeFactorCalculator = new PrimeFactorCalculator();
        primeFactorCalculator.generate(intInput);
    }

    private static void printHelp() {
        System.out.println("Type \"DRAW\" to draw shapes");
        System.out.println("Type \"FIZZBUZZ\" to print out fizz buzz");
        System.out.println("Type \"PRIME\" to calculate a prime factorization");
        System.out.println("Type \"HELP\" to receive this help menu :)");
        System.out.println("Type \"EXIT\" to exit");
    }


}

