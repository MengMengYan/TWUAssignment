package shapeCreation;

public class DiamondCreator extends ShapeCreator {

    public void drawIsoscelesTriangle(int input) {
        drawUpperTriangle(input);
        printLineOfAsterisks(2*input - 1);
    }

    public void drawDiamond(int input) {
        drawUpperTriangle(input);
        printLineOfAsterisks(2*input - 1);
        drawBottomTriangle(input);
    }

    public void drawDiamondWithMyName(int input) {
        drawUpperTriangle(input);
        System.out.println("MengMeng");
        drawBottomTriangle(input);
    }

    private void drawBottomTriangle(int input) {
        for (int i = 1; i <= input; i++){
            drawCenteredAsterisks(i, 2*input - (2*i + 1));
        }
    }

    private void drawUpperTriangle(int input) {
        for (int i = 1; i < input; i++){
            drawCenteredAsterisks(input - i, 2*i - 1);
        }
    }

    private void drawCenteredAsterisks(int margin, int numberAsterisks) {
        StringBuilder output = new StringBuilder();
        appendMargin(output, margin);

        for (int i =0; i < numberAsterisks; i++) {
            output.append("*");
        }

        appendMargin(output, margin);

        System.out.println("\n" + output.toString());
    }

    private void appendMargin(StringBuilder output, int margin){
        for (int i = 0; i < margin; i++){
            output.append(" ");
        }
    }
}
