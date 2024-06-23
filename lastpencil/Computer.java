package lastpencil;

import java.util.Random;

public class Computer extends Player {
    Random random;

    public Computer(String name) {
        super(name);
        this.random = new Random();
    }

    public int chooseNumber(int numberOfPencils) {
        switch (numberOfPencils % 4) {
            case 0:
                System.out.println(3);
                return 3;
            case 2:
                System.out.println(1);
                return 1;
            case 3:
                System.out.println(2);
                return 2;
            default:
                if (numberOfPencils == 1) {
                    System.out.println(1);
                    return 1;
                } else {
                    int randomNumber = this.random.nextInt(3) + 1;
                    System.out.println(randomNumber);
                    return randomNumber;
                }
        }
    }
}
