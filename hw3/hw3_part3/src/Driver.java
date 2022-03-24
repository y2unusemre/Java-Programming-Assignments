public class Driver {

    public static void test(){

        Street main_street = new Street(100);

        System.out.println("Length of the street : "+ main_street.getLength());


        long startTime = System.nanoTime();

        main_street.add_building('r',10,5,1,11,"Yunus",5,"red"); //house1
        main_street.add_building('r',5,3,15,20,"Emre",9,17);  //market1
        main_street.add_building('r',3,12,21,24,"Michael","Paper");         //office1
        main_street.add_building('r',12,25,37);                                                 //playground1
        main_street.add_building('r',4,5,40,44,"Ahmet",18,"blue"); //house2
        main_street.add_building('r',10,2,45,55,"Erdal",8,18);  //market2
        main_street.add_building('r',2,5,55,57,"Kenan","Engineering");         //office2
        main_street.add_building('r',20,57,77);                                                 //playground2

        main_street.add_building('l',2,6,0,2,"Mehmet",4,"brown"); //house3
        main_street.add_building('l',8,3,11);                                                 //playground3
        main_street.add_building('l',10,2,12,22,"Bim",10,17);  //market3
        main_street.add_building('l',6,3,23,29,"PTT","Post");         //office3

        long stopTime = System.nanoTime();
        System.out.println("Elapsed time for add_building function in part 3 in miliseconds: "+(stopTime-startTime)/100000f);


        System.out.println("Checking if the land between 80 and 90 in right side is available: ");
        System.out.println(main_street.isAvailable('r',80,90));             //isAvailable control

        main_street.print_buildings();  //print building
        System.out.println("Total remaining length of lands on the street: "+ main_street.remainingLands());
        System.out.println(" playgrounds in the street, the ratio is "+ main_street.playground_ratio());
        System.out.println("Total length of street occupied by the markets, houses or offices: "+ main_street.building_occupancy());


        main_street.delete_building('r',6);//should delete Kenan's office
        System.out.println("Kenan's office has been deleted");
        main_street.delete_building('l',0);//should delete Mehmet's house
        System.out.println("Mehmet's house has been deleted");
        main_street.delete_building('l',0);//should delete playground 3
        System.out.println("Playground has been deleted");


        main_street.print_buildings();
        System.out.println("Total remaining length of lands on the street: "+ main_street.remainingLands());
        System.out.println(" playgrounds in the street, the ratio is "+ main_street.playground_ratio());
        System.out.println("Total length of street occupied by the markets, houses or offices: "+ main_street.building_occupancy());


        System.out.println("Driver function is executed, Main program is being evaluated from now on:");

    }

}
