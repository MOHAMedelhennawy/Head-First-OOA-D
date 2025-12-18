import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
  private List<Guitar> guitars;
  
  public Inventory() {
    guitars = new LinkedList<>(); 
  }

  public void addGuitar(String serialNumber, double price,
                        Builder builder, String model,
                        Type type, Wood backWood, Wood topWood) {

        Guitar guitar = new Guitar(serialNumber, price, builder,
                               model, type, backWood, topWood);
        guitars.add(guitar);
    }
  
  public Guitar getGuitar(String serialNumber) {
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();

      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }

    return null;
  }

  public List search(GuitarSpec searchGuitar) {
    List<Guitar> matchingGuitars = new LinkedList<>();

    // System.out.println(
    //   "Guitar Specs To look up: " +
    //   "\n" + searchGuitar + "\n" + "==============================" + "\n"
    // );
    
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
  
      // System.out.println(guitar);
      if (searchGuitar.equals(guitar.getGuitarSpec())) {
        matchingGuitars.add(guitar);
      }
    }

    return matchingGuitars;
  }
}