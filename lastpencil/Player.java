package lastpencil;

public abstract class Player {
    String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    abstract public int chooseNumber(int numberOfPencils);
}
