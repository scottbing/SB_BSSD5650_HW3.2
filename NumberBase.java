import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class NumberBase extends Subject {

    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }

    private int value;

    public int getValue() {
        return this.value;
    }

    public void setValue(int newValue) {
        int oldValue = this.value;
        this.value = newValue;
        this.pcs.firePropertyChange("value", oldValue, newValue);
    }
}