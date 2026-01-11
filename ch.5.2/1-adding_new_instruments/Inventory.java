import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
  private List<Instrument> inventory;
  
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
    for (Iterator<Instrument> i = inventory.iterator(); i.hasNext(); ) {
      Instrument instrument = i.next();

      if (instrument.getSerialNumber().equals(serialNumber)) {
        return instrument;
      }
    }

    return null;
  }

  public List<Instrument> searchGuitar(InstrumentSpec instrumentSpec) {
    List<Instrument> matchingInstruments = new LinkedList<>();
  
    for (Iterator<Instrument> i = inventory.iterator(); i.hasNext(); ) {
      Instrument instrument = (Instrument)i.next();
  
      if (instrumentSpec.matches(instrument.getSpec())) {
        matchingInstruments.add(instrument);
      }
    }

    return matchingInstruments;
  }

  // public List<Mandolin> searchMandolin(MandolinSpec mandolinSpec) {
  //   List<Mandolin> matchingMandolin = new LinkedList<>();
  
  //   for (Iterator<Instrument> i = inventory.iterator(); i.hasNext(); ) {
  //     Mandolin mandolin = (Mandolin)i.next();
  
  //     if (mandolinSpec.matches(mandolin.getSpec())) {
  //       matchingMandolin.add(mandolin);
  //     }
  //   }

  //   return matchingMandolin;
  // }
}