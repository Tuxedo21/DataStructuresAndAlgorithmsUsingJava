package JavaAlgDaSt;

/**
 * Created by tuxedo21 on 11/01/17.
 */
public interface KeyMode {
    public abstract KeyMode deepCopy(); // Performs a deepCopy of the invoking object

    public abstract int compareTo(Object targetKey);

    public abstract String toString();
}
