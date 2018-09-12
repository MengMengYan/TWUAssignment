package shapeCreation;

public class ShapeCreator {

    public void printAsterisk(){
        System.out.println("*");
    }

    void printLineOfAsterisks(int number) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < number; i++){
            output.append("*");
        }
        System.out.println("\n" + output.toString());
    }
}
