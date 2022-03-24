/**
 * subclass of Building
 */
public class Playground extends Building{
    public Playground() {
        super();
        this.setHeight(1);
    }

    /**
     * playground constructor with parameters
     * @param length of  the building
     * @param start_point of  the building
     * @param end_point of  the building
     */
    public Playground(int length, int start_point, int end_point) {
        super(length, 1, start_point, end_point, "Government");
    }
}
