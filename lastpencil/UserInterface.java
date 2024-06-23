package lastpencil;

import java.util.Scanner;

public class UserInterface {
    private static final Scanner scanner = new Scanner(System.in);

    public static int askForInitialNumberOfPencils() {
        System.out.println("How many pencils would you like to use:");
        while (true) {
            try {
                int numberOfPencils = Integer.parseInt(scanner.nextLine());
                if (numberOfPencils > 0) {
                    return numberOfPencils;
                } else {
                    System.out.println("The number of pencils should be positive");
                }
            } catch (NumberFormatException e) {
                System.out.println("The number of pencils should be numeric");
            }
        }
    }

    public static Player askForFirstPlayer(Player john, Player jack) throws IllegalArgumentException {
        if (john == null) {
            throw new IllegalArgumentException("John is null");
        }
        if (jack == null) {
            throw new IllegalArgumentException("Jack is null");
        }
        System.out.println("Who will be the first (John, Jack):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("John")) {
                return john;
            } else if (name.equals("Jack")) {
                return jack;
            } else {
                System.out.println("Choose between 'John' and 'Jack'");
            }
        }
    }

    public static int askForNumberOfPencilsToTake(int numberOfPencils) throws IllegalArgumentException {
        if (numberOfPencils <= 0) {
            throw new IllegalArgumentException("Number of pencils should be positive");
        }
        while (true) {
            try {
                int numberOfPencilsToTake = Integer.parseInt(scanner.nextLine());
                if (numberOfPencilsToTake >= 1 && numberOfPencilsToTake <= 3) {
                    if (numberOfPencils >= numberOfPencilsToTake) {
                        return numberOfPencilsToTake;
                    } else {
                        System.out.println("Too many pencils were taken");
                    }
                } else {
                    System.out.println("Possible values: '1', '2' or '3'");
                }
            } catch (NumberFormatException e) {
                System.out.println("Possible values: '1', '2' or '3'");
            }
        }
    }
}
