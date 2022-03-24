import java.util.LinkedList;
/**
 * Street class is the main template for the town, has two arrays of building class for right side  and left  side of the street
 */
public class Street {

    private int length;
    private final LDLinkedList<Building> r_buildings = new LDLinkedList<>();
    private final LDLinkedList<Building> l_buildings = new LDLinkedList<>();
//    private Building[] r_buildings = new Building[30];  //array for right side of street
//    private Building[] l_buildings = new Building[30];  //array for left side of street


    public Street() {       //default constructor
    }

    public Street(int length) {// constructor with given length
        this.length = length;
    }


    public void setLength(int length) { //length setter
        this.length = length;
    }

    public int getLength() {            //length getter
        return length;
    }

    /**
     * base add_building method
     * @param side of  the street
     * @param length of  the building
     * @param height of  the building
     * @param start_point of  the building
     * @param end_point of  the building
     * @param owner of  the building
     */
    public void add_building(char side, int length, int height, int start_point, int end_point, String owner){
        if (side == 'r'){
            r_buildings.add(new Building(length,height,start_point,end_point,owner));
        }
        else if (side == 'l'){
            l_buildings.add(new Building(length,height,start_point,end_point,owner));
        }else {
            System.out.println("Wrong side input");
        }
        //normal building methodu

    }

    /**
     * add_building for house
     * @param side of  the street
     * @param length of  the building
     * @param height of  the building
     * @param start_point of  the building
     * @param end_point of  the building
     * @param owner of  the building
     * @param number_of_room  of  the building
     * @param color of  the building
     */
    public void add_building(char side, int length, int height, int start_point, int end_point, String owner,int number_of_room, String color){//
        if (side == 'r'){
            r_buildings.add(new House(length,height,start_point,end_point,owner,number_of_room,color));
        }
        else if (side == 'l'){
            l_buildings.add(new House(length,height,start_point,end_point,owner,number_of_room,color));
        }else {
            System.out.println("Wrong side input");
        }
        //house
    }

    /**
     * add_building for market
     * @param side of  the street
     * @param length of  the building
     * @param height of  the building
     * @param start_point of  the building
     * @param end_point of  the building
     * @param owner of  the building
     * @param opening_time of  the market
     * @param closing_time of  the market
     */
    public void add_building(char side, int length, int height, int start_point, int end_point, String owner,int opening_time, int closing_time){
        if (side == 'r'){
            r_buildings.add(new Market(length,height,start_point,end_point,owner,opening_time,closing_time));
        }
        else if (side == 'l'){
            l_buildings.add(new Market(length,height,start_point,end_point,owner,opening_time,closing_time));
        }else {
            System.out.println("Wrong side input");
        }
        //market
    }

    /**
     * add_building for office
     * @param side of  the street
     * @param length of  the building
     * @param height of  the building
     * @param start_point of  the building
     * @param end_point of  the building
     * @param owner of  the building
     * @param job_type of  the building
     */
    public void add_building(char side, int length, int height, int start_point, int end_point, String owner,String job_type){
        if (side == 'r'){
            r_buildings.add(new Office(length,height,start_point,end_point,owner,job_type));
        }
        else if (side == 'l'){
            l_buildings.add(new Office(length,height,start_point,end_point,owner,job_type));
        }else {
            System.out.println("Wrong side input");
        }
        //office
    }

    /**
     * add_building for playground
     * @param side of  the street
     * @param length of  the building
     * @param start_point of  the building
     * @param end_point of  the building
     */
    public void add_building(char side, int length,  int start_point, int end_point){
        if (side == 'r'){
            r_buildings.add(new Playground(length,start_point,end_point));
        }
        else if (side == 'l'){
            l_buildings.add(new Playground(length,start_point,end_point));
        }else {
            System.out.println("Wrong side input");
        }
        //playground
    }

    /**
     * deleting a building
     * @param side of  the building
     * @param index of  the building
     */
    public void delete_building(char side,int index){
        if (side == 'r'){
            r_buildings.remove(index);
        }
        if (side == 'l'){
            l_buildings.remove(index);
        }
    }

    /**
     * print buildings in order
     */
    public void print_buildings(){
        System.out.println("-----List of Buildings-----");
        System.out.println("Left side:");
        if (l_buildings.size()==0){
            System.out.println("No buildings or playgrounds");
        }else{
            for (Building l_building : l_buildings) {
                System.out.println(l_building.getClass().getName() + " owned by " + l_building.getOwner());
            }
        }
        System.out.println("Right side:");
        if (l_buildings.size()==0){
            System.out.println("No buildings or playgrounds");
        }else {
            for (Building r_building : r_buildings) {
                System.out.println(r_building.getClass().getName() + " owned by " + r_building.getOwner());
            }
        }
        System.out.println("---------------------------");

    }

    /**
     * method for checking if land is available
     * @param side  of  the building
     * @param start_point of  the building
     * @param end_point of  the building
     * @return true if available
     */
    public boolean isAvailable(char side,int start_point, int end_point){

        if (side == 'r'){
            if (r_buildings.size()==0){return true;}
            for (Building r_building : r_buildings) {
                if ((start_point > r_building.getStart_point() &&
                        start_point > r_building.getEnd_point() &&
                        end_point > r_building.getStart_point() &&
                        end_point > r_building.getEnd_point()) || (
                        start_point < r_building.getStart_point() &&
                                start_point < r_building.getEnd_point() &&
                                end_point < r_building.getStart_point() &&
                                end_point < r_building.getEnd_point())) {
                    return true;
                }
            }
        }
        if (side == 'l'){
            if (l_buildings.size()==0){return true;}

            for (Building l_building : l_buildings) {
                if ((start_point > l_building.getStart_point() &&
                        start_point > l_building.getEnd_point() &&
                        end_point > l_building.getStart_point() &&
                        end_point > l_building.getEnd_point()) || (
                        start_point < l_building.getStart_point() &&
                                start_point < l_building.getEnd_point() &&
                                end_point < l_building.getStart_point() &&
                                end_point < l_building.getEnd_point())) {
                    return true;
                }
            }
        }
        System.out.println("This land is not available");
        return false;
    }

    /**
     * method for evaluating remaining land
     * @return remaining length of land
     */
    public int remainingLands(){
        int total = 0;

        for (Building r_building : r_buildings) {
            total = total + r_building.getLength();
        }
        for (Building l_building : l_buildings) {
            total = total + l_building.getLength();
        }
        return (2*this.getLength())-total;
    }

    /**
     * method for calculating the total length of street occupied by the markets, houses or offices
     * @return total
     */
    public int building_occupancy(){
        int total = 0;

        for (Building r_building : r_buildings) {
            if (!(r_building.getOwner().equals("Government")))
                total = total + r_building.getLength();
        }
        for (Building l_building : l_buildings) {
            if (!(l_building.getOwner().equals("Government")))
                total = total + l_building.getLength();
        }
        return total;
    }

    /**
     * method for displaying the number and ratio of lenth of playgrounds in the street
     * @return playground ratio
     */
    public float playground_ratio(){
        float total = 0;
        int number=0;

        for (Building r_building : r_buildings) {
            if (r_building.getOwner().equals("Government")) {
                total = total + r_building.getLength();
                number++;
            }
        }
        for (Building l_building : l_buildings) {
            if (l_building.getOwner().equals("Government")) {
                total = total + l_building.getLength();
                number++;
            }
        }
        System.out.print(number);
        return total/(2*this.getLength());
    }
}
