package lastpencil;

import java.util.Scanner;

public class Human extends Player {
    Scanner scanner;

    public Human(String name, Scanner scanner) {
        super(name);
        this.scanner = scanner;
    }

    public int chooseNumber(int numberOfPencils) {
        while (true) {
            String input = this.scanner.nextLine();
            if (input.equals("1") || input.equals("2") || input.equals("3")) {
                int inputNumber = Integer.parseInt(input);
                if (numberOfPencils >= inputNumber) {
                    return inputNumber;
                } else {
                    System.out.println("Too many pencils were taken");
                }
            } else {
                System.out.println("Possible values: '1', '2' or '3'");
            }
        }
    }
}
