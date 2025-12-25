public class DogDoorSimulator2 {
    public static void main(String [] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Fido barks to go outside");
        remote.pressButton();

        System.out.println("\nFido has gone outside...");
        System.out.println("\nFido's all done...");

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {}

        System.out.println("\n...But he stuck outside");
        System.out.println("\nFido start barking");
        System.out.println("\n...So gina grabs remote control");
        remote.pressButton();

        System.out.println("\nFido's back inside...");
    }
}