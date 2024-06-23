package lastpencil;

public class LastPencil {
    public static void play() {
        int numberOfPencils = UserInterface.askForInitialNumberOfPencils();
        Player jack = new Computer("Jack");
        Player john = new Human("John");
        Player currentPlayer = UserInterface.askForFirstPlayer(john, jack);
        while (numberOfPencils > 0) {
            System.out.println("|".repeat(numberOfPencils));
            System.out.println(currentPlayer.getName() + "'s turn!");
            int numberOfPencilsToTake = currentPlayer.chooseNumber(numberOfPencils);
            numberOfPencils -= numberOfPencilsToTake;
            currentPlayer = currentPlayer == jack ? john : jack;
        }
        System.out.println(currentPlayer.getName() + " won!");
    }
}
