public class Mandolin extends Instrument {
    private String serialNumber;
    private double price;
    private MandolinSpec mandolinSpec;

    public Mandolin (String serialNumber, double price, MandolinSpec mandolinSpec) {
        super(serialNumber, price, mandolinSpec);
        // this.serialNumber = serialNumber;
        // this.price = price;
        // this.mandolinSpec = mandolinSpec;
    }
}