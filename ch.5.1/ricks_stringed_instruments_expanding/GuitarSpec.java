import java.util.Objects;

public class GuitarSpec extends InstrumentSpec {
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
        super(builder, model, type, backWood, topWood);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    @override
    public boolean matches(InstrumentSpec otherSpec) {
        if (!super.matches(otherSpec)) {
            return false;
        }

        if (otherSpec instanceof GuitarSpec) {
            GuitarSpec otherGuitarSpec = (GuitarSpec) otherSpec;
            if (this.numStrings != otherGuitarSpec.numStrings) {
                return false;
            }
        }
        return true;
    }
}