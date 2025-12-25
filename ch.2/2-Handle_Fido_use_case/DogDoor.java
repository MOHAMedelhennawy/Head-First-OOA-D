public class DogDoor {
    private boolean open;

    public DogDoor() {
        this.open = false;
    }

    public void open() {
        open = true;
        System.out.println("The dog door opens");
    }

    public void close() {
        open = false;
        System.out.println("The dog door closes");
    }

    public boolean isOpen() {
        return open;
    }
}