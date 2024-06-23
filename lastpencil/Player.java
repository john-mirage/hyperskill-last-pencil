package lastpencil;

public abstract class Player {
    String name;

    public Player(String name) throws IllegalArgumentException {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    abstract public int chooseNumber(int numberOfPencils);
}
