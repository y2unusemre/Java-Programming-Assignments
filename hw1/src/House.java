/**
 * subclass of Building
 */
public class House extends Building {
    private int number_of_room;
    private String color;

    public House(int number_of_room, String color) {
        super();
        this.number_of_room = number_of_room;
        this.color = color;
    }

    /**
     * house constructor with parameters
     * @param length of  the building
     * @param height of  the building
     * @param start_point of  the building
     * @param end_point of  the building
     * @param owner of  the building
     * @param number_of_room of  the building
     * @param color of  the building
     */
    public House(int length, int height, int start_point, int end_point, String owner, int number_of_room, String color) {
        super(length, height, start_point, end_point, owner);
        this.number_of_room = number_of_room;
        this.color = color;
    }

    public void setNumber_of_room(int number_of_room) {
        this.number_of_room = number_of_room;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber_of_room() {
        return number_of_room;
    }
    public String getColor() {
        return color;
    }

}
