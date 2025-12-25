public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(String bark) {
        System.out.println("\tBark Recognizer Heard a: `" + bark + "`");
        door.open();
    }
}