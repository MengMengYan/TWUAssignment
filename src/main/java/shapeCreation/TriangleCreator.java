package shapeCreation;



public class TriangleCreator extends ShapeCreator{

    public void drawRightTriangle(int input) {

        for (int i = 1; i <= input; i++) {
            printLineOfAsterisks(i);
        }
    }

    public void drawVerticalLine(int input) {

        for (int i = 0; i < input; i++) {
            printAsterisk();
        }
    }

    public void drawHorizontalLine(int input) {
        printLineOfAsterisks(input);
    }
}
