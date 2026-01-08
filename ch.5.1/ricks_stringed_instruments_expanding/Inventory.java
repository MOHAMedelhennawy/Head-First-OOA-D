import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
  private List inventory;
  
  public Inventory() {
    inventory = new LinkedList<>(); 
  }

  public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = null;

        if (spec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber, price, (GuitarSpec) spec);
        } else if (spec instanceof MandolinSpec) {
            instrument = new Mandolin(serialNumber, price, (MandolinSpec) spec);
        }
        inventory.add(instrument);
    }
  
  public Instrument get(String serialNumber) {
    for (Iterator i = inventory.iterator(); i.hasNext(); ) {
      Instrument instrument = (Instrument)i.next();

      if (instrument.getSerialNumber().equals(serialNumber)) {
        return instrument;
      }
    }

    return null;
  }

  public List search(GuitarSpec searchSpec) {
    List<Guitar> matchingGuitars = new LinkedList<>();
  
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
  
      if (searchSpec.equals(guitar.getGuitarSpec())) {
        matchingGuitars.add(guitar);
      }
    }

    return matchingGuitars;
  }

  public List searchMandolin(MandolinSpec searchSpec) {
    List<Mandolin> mat = new LinkedList<>();
  
    for (Iterator i = mandolins.iterator(); i.hasNext(); ) {
      Mandolin mandolin = (Mandolin)i.next();
  
      if (searchSpec.equals(mandolin.getMandolinSpec())) {
        mat.add(mandolin);
      }
    }

    return mat;
  }
}