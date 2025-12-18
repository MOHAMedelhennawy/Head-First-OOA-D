import java.util.Objects;

public class GuitarSpec {
    private String model;
    private Wood backWood, topWood;
    private Builder builder;
    private Type type;

    public GuitarSpec (Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }
    
    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    @Override
    public String toString() {
        return (
            "{ " +
                "Builder: " + builder + 
                ", Model: " + model +
                ", Type: " + type +
                ", BackWood: " + backWood +
                ", TopWood: " + topWood +
            " }"
        );
    }

    @Override
    public boolean equals(Object o) {
        // Check if both of them are the same object
        if (this == o) return true;
        // Check class type
        // if (o == null || getClass() != o.getClass()) return false;
        if (!(o instanceof GuitarSpec)) return false;

        GuitarSpec specs = (GuitarSpec) o;
        return Objects.equals(builder, specs.builder) && Objects.equals(model, specs.model) &&
               Objects.equals(type, specs.type) && Objects.equals(backWood, specs.backWood) &&
               Objects.equals(topWood, specs.topWood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(builder, model, type, backWood, topWood);
    }
}