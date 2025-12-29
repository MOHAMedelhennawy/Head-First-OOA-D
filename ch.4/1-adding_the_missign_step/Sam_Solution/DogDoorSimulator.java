public class DogDoorSimulator {
    public static void main(String [] args) {
        Bark bark = new Bark("woof");
        DogDoor door = new DogDoor(bark);
        Remote remote = new Remote(door);
        BarkRecognizer barkRecognizer = new BarkRecognizer(door);

        System.out.println("\nFido bark to let out...");
        barkRecognizer.recognize(bark);
        System.out.println("\nFido goes outside...");

        try {
            Thread.currentThread().sleep(10000);
        } catch(InterruptedException e) {}

        System.out.println("\nFido's all done");
        System.out.println("\nBut he's stuck outside!");
        System.out.println("\nFido barks to be let back inside...");
        barkRecognizer.recognize("woof");
        System.out.println("\nFido goes back again...");
    }
}