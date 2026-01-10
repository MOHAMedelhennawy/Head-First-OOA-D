import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindMandolinTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        // Add guitar to rick inventory
        initializeInventory(inventory);

        // Erin want's guitar with a specific specs
        MandolinSpec whatErinLikes = new MandolinSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.SITKA, Style.A);

        // App search in rick's guitars inventory
        List<Mandolin> matchingMandolins = inventory.searchMandolin(whatErinLikes);

        if (!matchingMandolins.isEmpty()) {
            for (Iterator<Mandolin> i = matchingMandolins.iterator(); i.hasNext(); ) {
                Mandolin instrument = i.next();
                MandolinSpec spec = (MandolinSpec) instrument.getSpec();

                System.out.println("  We have a " +
                spec.getBuilder() + " " + spec.getModel() + " " +
                spec.getType() + " guitar:\n     " +
                spec.getBackWood() + " back and sides,\n     " +
                spec.getStyle() + " style.\n     " +
                spec.getTopWood() + " top.\n  You can have it for only $" +
                instrument.getPrice() + "!\n  ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

  private static void initializeInventory(Inventory inventory) {
    MandolinSpec mandolinSpec1 = new MandolinSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.SITKA, Style.A);
    inventory.addInstrument("11277", 3999.95, mandolinSpec1);

    MandolinSpec mandolinSpec2 = new MandolinSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, Style.F);
    inventory.addInstrument("V95693", 1499.95, mandolinSpec2);

    MandolinSpec mandolinSpec3 = new MandolinSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, Style.F);
    inventory.addInstrument("V9512", 1549.95, mandolinSpec3);

    MandolinSpec mandolinSpec3_2 = new MandolinSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, Style.A);
    inventory.addInstrument("V9512", 1049.95, mandolinSpec3_2);

    MandolinSpec mandolinSpec4 = new MandolinSpec(Builder.MARTIN, "D-18", Type.ACOUSTIC,Wood.MAHOGANY, Wood.ADIRONDACK, Style.A);
    inventory.addInstrument("122784", 5495.95, mandolinSpec4);

    MandolinSpec mandolinSpec5 = new MandolinSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC,Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK, Style.A);
    inventory.addInstrument("76531", 6295.95, mandolinSpec5);

    MandolinSpec mandolinSpec6 = new MandolinSpec( Builder.GIBSON, "Les Paul", Type.ELECTRIC,Wood.MAHOGANY, Wood.MAHOGANY, Style.F);
    inventory.addInstrument("70108276", 2295.95, mandolinSpec6);

    MandolinSpec mandolinSpec7 = new MandolinSpec(Builder.GIBSON, "SG '61 Reissue", Type.ELECTRIC,Wood.MAHOGANY, Wood.MAHOGANY, Style.A);
    inventory.addInstrument("82765501", 1890.95, mandolinSpec7);

    MandolinSpec mandolinSpec8 = new MandolinSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC,Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK, Style.F);
    inventory.addInstrument("77023", 6275.95, mandolinSpec8);

    MandolinSpec mandolinSpec9 = new MandolinSpec(Builder.OLSON, "SJ", Type.ACOUSTIC,Wood.INDIAN_ROSEWOOD, Wood.CEDAR, Style.F);
    inventory.addInstrument("1092", 12995.95, mandolinSpec9);

    MandolinSpec mandolinSpec10 = new MandolinSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC,Wood.COCOBOLO, Wood.CEDAR, Style.A);
    inventory.addInstrument("566-62", 8999.95, mandolinSpec10);

    MandolinSpec mandolinSpec12 = new MandolinSpec(Builder.PRS, "Dave Navarro Signature", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE, Style.F);
    inventory.addInstrument("6 29584", 2100.95, mandolinSpec12);
  }
}