package inputManager;

import java.util.Scanner;

class InputRetriever {

    String getStringInput(){
        Scanner in = new Scanner(System.in);
        return in.nextLine().trim();
    }

    int getIntInput(){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().trim();
        while(!isNumeric(input)) {
            System.out.print("Please, enter a positive natural number: ");
            input = in.nextLine().trim();
        }
        return Integer.parseInt(input);
    }

    private boolean isNumeric(String input) { return input.matches("\\d+"); }
}
