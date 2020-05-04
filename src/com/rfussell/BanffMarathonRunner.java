package com.rfussell;


/**
 * Class: BanffMarathonRunner.java
 * Purpose: Extend AddressBook to add 2 more fields, write a method to get best time, average + above average runners.
 * @author: Robin Fussell
 * Date:  October 9, 2019
 * Version 1.0
 * */


/**     Address book extends to add 2 more fields, runner time and years competed. A constructor is set up to give access
 to the firstName, lastName and homeAddress fields from question 1, then setters and getters are set up for
 time and years to be able to use them for calculations. The results for fastest runner, average time and above
 average time are calculated in 3 separate methods that are called from the main method where all of the necessary
 information on the runners is. From main, the get methods are used to gather the results to display on the screen.*/


public class BanffMarathonRunner extends AddressBook{
    int time;
    int years;

//creates a constructor of all the fields from AddressBook as well as the ones we introduced in
// BanffMarathonRunner that we will be using for the BanffMarathonRunner calculations.


    public BanffMarathonRunner(String firstName , String lastName, String homeAddress,int time, int years){
        super();
        setFirstName(firstName);
        setLastName(lastName);
        setHomeAddress(homeAddress);
        setTime(time);
        setYears(years);
    }

    public BanffMarathonRunner (String firstName, String middleName, String lastName, String homeAddress, String businessPhone, String homePhone, String cellPhone, String skypeId, String faceBookId, String personalWebsite) {
        super();
    }

    //setters and getters to access the fields.

    public int getTime () {
        return time;
    }

    public void setTime (int time) {
        this.time = time;
    }

    public int getYears () {
        return years;
    }

    public void setYears (int years) {
        this.years = years;
    }

    //  Find Best Time: creates a variable called bestTime and assigns the value of the array to it,
    //  looks in runners for a parameter called runner,
    // loads first item in the array and checks if its smaller than the current best time
    // does this for every index in the array, so after all 15 have been checked, the smallest
    // number is the best time, which then gets returned as the result.

    static BanffMarathonRunner getFastestRunner(BanffMarathonRunner[] runners){
        BanffMarathonRunner bestTime = runners[0];
        for(BanffMarathonRunner runner : runners)
            if(runner.getTime() < bestTime.getTime());
        return bestTime;
    }




    //Find Average Time: sets avg as 0; cycles through the array, totalling up the numbers in the array
    // by taking the current number and setting it to number + number = newNumber etc. for the length of the array.
    //creates a sum of the values in the array and then divides that number by the length of the array
    // which leaves us with the average number.

    static double getAverageTime(BanffMarathonRunner[] runners){
        double avg = 0;
        for(int i=0; i<runners.length; i++)
            avg += runners[i].getTime();
        return avg/runners.length;
    }





    //Find Above Average Runners: this array is of type String so to initialize it instead of double avg = 0,
    // we set it as an empty String. while looping through the array the if statement checks if the time is less
    //than the average time, then assigns the numbers less than the average to the variable aboveAvg with
    //getter
    public static String getAboveAverageRunners(BanffMarathonRunner[] runners){
        String aboveAvg = "";
        double avg = getAverageTime(runners);
        for(int i=0; i<runners.length; i++)
            if(runners[i].getTime() < avg)
                aboveAvg = aboveAvg + runners[i].getFirstName() + " " + runners[i].getYears() + ", ";
        return aboveAvg;
    }

    public static void main(String[] args) {
        BanffMarathonRunner elena = new BanffMarathonRunner("Elena", "Brandon", "2020 Hyperdrive lane", 341, 1);
        BanffMarathonRunner thomas = new BanffMarathonRunner("Thomas", "Molson", "200 404 ave", 273, 2);
        BanffMarathonRunner hamilton = new BanffMarathonRunner("Hamilton", "Winn", "20190 92 ave", 278, 5);
        BanffMarathonRunner suzie = new BanffMarathonRunner("Suzie", "Sarandin", "7B 200 st.", 329, 7);
        BanffMarathonRunner philip = new BanffMarathonRunner("Philip", "Winne", "76 208th st.", 448, 9);
        BanffMarathonRunner alex = new BanffMarathonRunner("Alex", "Trebok", "1616 Kicamous rd.", 275, 3);
        BanffMarathonRunner emma = new BanffMarathonRunner("Emma", "Pivoto", "205-448 Sutton ct", 275, 4);
        BanffMarathonRunner john = new BanffMarathonRunner("John", "Lenthen", "909 Allmore lane", 243, 1);
        BanffMarathonRunner james = new BanffMarathonRunner("James", "Lean", "19 Trepanier rd.", 334, 1);
        BanffMarathonRunner jane = new BanffMarathonRunner("Jane", "Ostin", "555 Kingston rd.", 412, 1);
        BanffMarathonRunner emily = new BanffMarathonRunner("Emily", "Car", "2001 Evergreen rd.", 393, 4);
        BanffMarathonRunner daniel = new BanffMarathonRunner("Daniel", "Hamshire", "202 Glenmore Plaza", 299, 4);
        BanffMarathonRunner neda = new BanffMarathonRunner("Neda", "Badzar", "5770 92 A ave", 343, 3);
        BanffMarathonRunner aaron = new BanffMarathonRunner("Aaron", "Smith", "8084 Wolfe rd.", 317, 6);
        BanffMarathonRunner kate = new BanffMarathonRunner("Kate", "Hen", "1717 Charles st.", 265, 8);



        BanffMarathonRunner[] runners = {elena, thomas, hamilton, suzie, philip, alex, emma,
                john, james, jane, emily, daniel, neda, aaron, kate};
        BanffMarathonRunner bestTime = BanffMarathonRunner.getFastestRunner(runners);



        System.out.println("Fastest Runner: " + bestTime.getFirstName() + " " + bestTime.getLastName());
        System.out.println("Home Address: " + bestTime.getHomeAddress());
        System.out.println("Fastest Time: " + bestTime.getTime());
        System.out.println("Years: " + bestTime.getYears());
        System.out.println("Average Time: " + (Math.round(BanffMarathonRunner.getAverageTime(runners))));
        System.out.println("Above average time: " + getAboveAverageRunners(runners));
    }
}
