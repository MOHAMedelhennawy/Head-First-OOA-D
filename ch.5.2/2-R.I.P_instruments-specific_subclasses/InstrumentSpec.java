import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public abstract class InstrumentSpec {
    private properties;

    public InstrumentSpec(Map properties) {
        if (properties == null) {
            this.properties = new HashMap<>();
        } else {
            this.properties = new HashMap<>(properties);
        }
    }

    public Object getProperty(String propertyName) {
        return properties.get(propertyName);
    }

    public Map getProperties() {
        return properties;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        if (this == otherSpec) return true;
        if (otherSpec == null || !(otherSpec instanceof InstrumentSpec)) return false;

        for (Iterator i = otherSpec.getProperties().keySet().iterator(); i.HasNext(); ) {
            String propertyName = (String)i.next();
            if (!properties.get(propertyName).equals(otherSpec.getProperty(propertyName))) {
                return false;
            }
        }

        return true;
    }
}