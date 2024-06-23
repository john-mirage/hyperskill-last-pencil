package lastpencil;

public class Human extends Player {
    public Human(String name) {
        super(name);
    }

    public int chooseNumber(int numberOfPencils) {
        return UserInterface.askForNumberOfPencilsToTake(numberOfPencils);
    }
}
