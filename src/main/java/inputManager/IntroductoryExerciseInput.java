package inputManager;

import fizzBuzz.FizzBuzz;
import primeFactor.PrimeFactorCalculator;
import shapeCreation.DiamondCreator;
import shapeCreation.TriangleCreator;

public class IntroductoryExerciseInput {

    public static void main(String[] args){


        InputRetriever retriever = new InputRetriever();

        TriangleCreator triangleCreator = new TriangleCreator();

        triangleCreator.printAsterisk();

        System.out.println("How many stars should be in a row? ");
        int intInput = retriever.getIntInput();
        triangleCreator.drawHorizontalLine(intInput);

        System.out.println("How many stars should be in a column? ");
        intInput = retriever.getIntInput();
        triangleCreator.drawVerticalLine(intInput);

        System.out.println("How many rows should the right triangle have? ");
        intInput = retriever.getIntInput();
        triangleCreator.drawRightTriangle(intInput);


        DiamondCreator diamondCreator = new DiamondCreator();

        System.out.println("How many rows should the isosceles triangle have? ");
        intInput = retriever.getIntInput();
        diamondCreator.drawIsoscelesTriangle(intInput);

        System.out.println("How many rows should the upper part of the diamond have? ");
        intInput = retriever.getIntInput();
        diamondCreator.drawDiamond(intInput);

        System.out.println("At which line should my name appear? ");
        intInput = retriever.getIntInput();
        diamondCreator.drawDiamondWithMyName(intInput);

        new FizzBuzz();

        System.out.println("For which number do you want to do a prime factorization? ");
        intInput = retriever.getIntInput();
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

