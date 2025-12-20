import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
  private List<Guitar> guitars;
  
  public Inventory() {
    guitars = new LinkedList<>(); 
  }

  public void addGuitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
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

  public List search(GuitarSpec searchGuitarSpec) {
    List<Guitar> matchingGuitars = new LinkedList<>();
  
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
  
      if (searchGuitarSpec.equals(guitar.getGuitarSpec())) {
        matchingGuitars.add(guitar);
      }
    }

    return matchingGuitars;
  }
}