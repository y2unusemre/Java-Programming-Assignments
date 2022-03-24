import java.util.Scanner;
/**
 * HW1  is the main class of the program, first calls the driver function then continues for interactive usage of program
 */
public class HW1 {
    public static void main(String[] args) {

        Driver.test();

        int option1, option2, option3;  //used for switch cases
        boolean loop_check = true;      //used for while loops for interactive executing
        boolean free_land =false;       //checks whether a building can be placed at the given position
        char side;
        int length, height, start_point, end_point, number_of_room, opening_time , closing_time;
        String owner, color, job_type;

        Street wall_street = new Street();
        Scanner Scan = new Scanner(System.in);

        System.out.println("Please enter the length of the street:");
        wall_street.setLength(Scan.nextInt());


        while (loop_check){
            System.out.println("*****MENU*****");
            System.out.println("1-Editing Mode");
            System.out.println("2-Viewing Mode");
            System.out.println("3-Exit");
            System.out.println("**************");

            option1 = Scan.nextInt();

            switch (option1) {
                case 1 -> {//editing mode
                    while (loop_check) {
                        System.out.println("\n****Editing Mode****");
                        System.out.println("1-Add Building");
                        System.out.println("2-Delete Building");
                        System.out.println("3-Return to Main Menu");
                        System.out.println("**************");
                        option2 = Scan.nextInt();
                        switch (option2) {
                            case 1 -> {//add building
                                System.out.println("Please chose the type of building you want to add:");
                                System.out.println("1-House");
                                System.out.println("2-Market");
                                System.out.println("3-Office");
                                System.out.println("4-Playground");
                                option3 = Scan.nextInt();
                                switch (option3) {
                                    case 1 -> {
                                        System.out.println("Please enter side(r/l), length, height, start point, owner, number of room and color in order");
                                        Scan.nextLine();
                                        System.out.print("side:");
                                        side = Scan.nextLine().charAt(0);
                                        System.out.print("length:");
                                        length = Scan.nextInt();
                                        System.out.print("height:");
                                        height = Scan.nextInt();
                                        System.out.print("start:");
                                        start_point = Scan.nextInt();
                                        end_point = start_point + length;
                                        Scan.nextLine();
                                        System.out.print("owner:");
                                        owner = Scan.nextLine();
                                        System.out.print("number of rooms:");
                                        number_of_room = Scan.nextInt();
                                        Scan.nextLine();
                                        System.out.print("color:");
                                        color = Scan.nextLine();
                                        free_land = wall_street.isAvailable(side, start_point, end_point);
                                        if (height <= 0) {
                                            System.out.println("Height should be a positive number");
                                            free_land = false;
                                        }
                                        if (length <= 0) {
                                            System.out.println("Length should be a positive number");
                                            free_land = false;
                                        }
                                        if (height > wall_street.getLength()) {
                                            System.out.println("Height shouldn't be greater than street's length");
                                            free_land = false;
                                        }
                                        if (start_point <= 0) {
                                            System.out.println("Starting point should be a positive number");
                                            free_land = false;
                                        }
                                        if (number_of_room < 0) {
                                            System.out.println("Number of rooms should be a positive number");
                                            free_land = false;
                                        }
                                        if (free_land) {
                                            wall_street.add_building(side, length, height, start_point, end_point, owner, number_of_room, color);
                                            free_land = false;
                                        }
                                    }
                                    case 2 -> {
                                        System.out.println("Please enter side(r/l), length, height, start point, owner, opening time  and closing time");
                                        Scan.nextLine();
                                        System.out.print("side:");
                                        side = Scan.nextLine().charAt(0);
                                        System.out.print("length:");
                                        length = Scan.nextInt();
                                        System.out.print("height:");
                                        height = Scan.nextInt();
                                        System.out.print("start:");
                                        start_point = Scan.nextInt();
                                        end_point = start_point + length;
                                        Scan.nextLine();
                                        System.out.print("owner:");
                                        owner = Scan.nextLine();
                                        System.out.print("opening time:");
                                        opening_time = Scan.nextInt();
                                        System.out.print("closing time:");
                                        closing_time = Scan.nextInt();
                                        free_land = wall_street.isAvailable(side, start_point, end_point);
                                        if (height <= 0) {
                                            System.out.println("Height should be a positive number");
                                            free_land = false;
                                        }
                                        if (length <= 0) {
                                            System.out.println("Length should be a positive number");
                                            free_land = false;
                                        }
                                        if (height > wall_street.getLength()) {
                                            System.out.println("Height shouldn't be greater than street's length");
                                            free_land = false;
                                        }
                                        if (start_point <= 0) {
                                            System.out.println("Starting point should be a positive number");
                                            free_land = false;
                                        }
                                        if (opening_time < 0 || opening_time > 24 || closing_time < 0 || closing_time > 24) {
                                            System.out.println("Opening and closing time should be in between 0 and 24.");
                                            free_land = false;
                                        }
                                        if (free_land) {
                                            wall_street.add_building(side, length, height, start_point, end_point, owner, opening_time, closing_time);
                                            free_land = false;
                                        }
                                    }
                                    case 3 -> {
                                        System.out.println("Please enter side(r/l), length, height, start point, owner and job type");
                                        Scan.nextLine();
                                        System.out.print("side:");
                                        side = Scan.nextLine().charAt(0);
                                        System.out.print("length:");
                                        length = Scan.nextInt();
                                        System.out.print("height:");
                                        height = Scan.nextInt();
                                        System.out.print("start:");
                                        start_point = Scan.nextInt();
                                        end_point = start_point + length;
                                        Scan.nextLine();
                                        System.out.print("owner:");
                                        owner = Scan.nextLine();
                                        Scan.nextLine();
                                        System.out.print("job type:");
                                        job_type = Scan.nextLine();
                                        free_land = wall_street.isAvailable(side, start_point, end_point);
                                        if (free_land) {
                                            wall_street.add_building(side, length, height, start_point, end_point, owner, job_type);
                                            free_land = false;
                                        }
                                    }
                                    case 4 -> {
                                        System.out.println("Please enter side(r/l), length and start point");
                                        Scan.nextLine();
                                        System.out.print("side:");
                                        side = Scan.nextLine().charAt(0);
                                        System.out.print("length:");
                                        length = Scan.nextInt();
                                        System.out.print("start:");
                                        start_point = Scan.nextInt();
                                        end_point = start_point + length;
                                        free_land = wall_street.isAvailable(side, start_point, end_point);
                                        if (free_land) {
                                            wall_street.add_building(side, length, start_point, end_point);
                                            free_land = false;
                                        }
                                    }
                                    default -> System.out.println("Invalid option, Please choose again!");
                                }
                            }
                            case 2 -> {//delete
                                System.out.println("Please enter the side and building number:");
                                System.out.print("Side(r/l):");
                                Scan.nextLine();
                                side = Scan.nextLine().charAt(0);
                                System.out.print("Number:");
                                wall_street.delete_building(side, Scan.nextInt());
                            }
                            case 3 ->//return to main menu
                                    loop_check = false;
                            default -> System.out.println("Invalid option, Please choose again!");
                        }
                    }
                    loop_check = true;
                }
                case 2 -> {//viewing mode
                    while (loop_check) {
                        System.out.println("\n****Viewing Mode****");
                        System.out.println("1-Total Remaining length of Lands");
                        System.out.println("2-List of Buildings");
                        System.out.println("3-Number and Ratio of Length of Playgrounds");
                        System.out.println("4-Occupied length by buildings");
                        System.out.println("5-Skyline Silhouette");
                        System.out.println("6-Return to Main Menu");
                        System.out.println("**************");
                        option3 = Scan.nextInt();
                        switch (option3) {
                            case 1:
                                System.out.println("Total remaining length of lands on the street: " + wall_street.remainingLands());
                                System.out.println("Enter any number to go back:");
                                Scan.nextInt();//total remaining
                                break;
                            case 2:
                                wall_street.print_buildings();
                                System.out.println("Enter any number to go back:");
                                Scan.nextInt();
                                //list of buildings
                                break;
                            case 3:
                                System.out.println(" playgrounds in the street, the ratio is  " + wall_street.playground_ratio());
                                System.out.println("Enter any number to go back:");
                                Scan.nextInt();//number and ratio
                                break;
                            case 4:
                                System.out.println("Total length of street occupied by the markets, houses or offices: " + wall_street.building_occupancy());
                                System.out.println("Enter any number to go back:");
                                Scan.nextInt();
                                break;
                            case 5:
                                //skyline
                                break;
                            case 6:
                                loop_check = false;         //exit
                                break;
                            default:
                                System.out.println("Invalid option, Please choose again!");
                        }
                    }
                    loop_check = true;
                }
                case 3 ->//exit
                        loop_check = false;
                default -> System.out.println("Invalid option, Please choose again!");
            }

        }

    }





}
