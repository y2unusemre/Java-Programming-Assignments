/**
 * Building class is the super class of House, Market, Office and Playground classes.
 * only used for data storing
 */
public class Building {

    private int length;
    private int height;
    private int start_point;
    private int end_point;
    private String owner;

    /**
     * default building constructor
     */
    public Building() {
        this.length=0;
        this.height=0;
        this.start_point=0;
        this.end_point=0;
        this.owner="";
    }

    /**
     * building constructor with parameters
     * @param length of  the building
     * @param height of  the building
     * @param start_point of  the building
     * @param end_point of  the building
     * @param owner of  the building
     */
    public Building(int length, int height, int start_point, int end_point, String owner) {
        this.length = length;
        this.height = height;
        this.start_point = start_point;
        this.end_point = end_point;
        this.owner = owner;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setStart_point(int start_point) {
        this.start_point = start_point;
    }

    public void setEnd_point(int end_point) {
        this.end_point = end_point;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getStart_point() {
        return start_point;
    }

    public int getEnd_point() {
        return end_point;
    }

    public String getOwner() {
        return owner;
    }
}
