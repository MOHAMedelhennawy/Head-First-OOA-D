import java.util.Objects;

public abstract class InstrumentSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        if (this == otherSpec) return true;
        if (otherSpec == null || !(otherSpec instanceof InstrumentSpec)) return false;

        InstrumentSpec spec = otherSpec;
        return Objects.equals(builder, spec.builder) &&
               Objects.equals(model, spec.model) &&
               Objects.equals(type, spec.type) &&
               Objects.equals(backWood, spec.backWood) &&
               Objects.equals(topWood, spec.topWood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(builder, model, type, backWood, topWood);
    }
}