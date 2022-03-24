/**
 * subclass of Building
 */
public class Market extends Building {
    private int opening_time;
    private int closing_time;

    public Market() {
        super();
    }

    public Market(int opening_time, int closing_time) {
        super();
        this.opening_time = opening_time;
        this.closing_time = closing_time;
    }

    /**
     * market constructor with parameters
     * @param length of  the building
     * @param height of  the building
     * @param start_point of  the building
     * @param end_point of  the building
     * @param owner of  the building
     * @param opening_time of  the building
     * @param closing_time of  the building
     */
    public Market(int length, int height, int start_point, int end_point, String owner, int opening_time, int closing_time) {
        super(length, height, start_point, end_point, owner);
        this.opening_time = opening_time;
        this.closing_time = closing_time;
    }

    public int getClosing_time() {
        return closing_time;
    }
    public int getOpening_time() {
        return opening_time;
    }





}
