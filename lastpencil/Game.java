package lastpencil;

import java.util.Random;
import java.util.Scanner;

public class Game {
    Scanner scanner;
    Random random;
    Integer numberOfPencils;
    Bot jack;
    Human john;
    Player currentPlayer;

    public Game() {
        this.scanner = new Scanner(System.in);
        this.random = new Random();
        this.numberOfPencils = this.askNumberOfPencils();
        this.jack = new Bot("Jack", random);
        this.john = new Human("John", scanner);
        this.currentPlayer = this.askWhoWillBeFirst();
    }

    private int askNumberOfPencils() {
        System.out.println("How many pencils would you like to use:");
        while (true) {
            String input = scanner.nextLine();
            if (input.matches("^-?[0-9]+$")) {
                int numberOfPencils = Integer.parseInt(input);
                if (numberOfPencils > 0) {
                    return numberOfPencils;
                } else {
                    System.out.println("The number of pencils should be positive");
                }
            } else {
                System.out.println("The number of pencils should be numeric");
            }
        }
    }

    private Player askWhoWillBeFirst() {
        System.out.println("Who will be the first (John, Jack):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("John")) {
                return this.john;
            } else if (name.equals("Jack")) {
                return this.jack;
            } else {
                System.out.println("Choose between 'John' and 'Jack'");
            }
        }
    }

    public void play() {
        while (this.numberOfPencils > 0) {
            System.out.println("|".repeat(this.numberOfPencils));
            System.out.println(this.currentPlayer.getName() + "'s turn!");
            int numberOfPencils = this.currentPlayer.chooseNumber(this.numberOfPencils);
            this.numberOfPencils -= numberOfPencils;
            this.currentPlayer = this.currentPlayer.getName().equals("John") ? this.jack : this.john;
        }
        System.out.println(this.currentPlayer.getName() + " won!");
    }
}
