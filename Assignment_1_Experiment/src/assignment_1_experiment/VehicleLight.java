
package assignment_1_experiment;

public class VehicleLight extends Vehicle{
    //variables
    public int numberOfSeats;
    
    //Default Constructor
    public VehicleLight(){
    int numberOfSeats = 1;
    }
    
    //constructors
    public VehicleLight(int numberOfSeats){
    setNumberOfSeats(numberOfSeats);
    }
    
    //accessor and mutator methods
    public int getNumberOfSeats(){
    return numberOfSeats;
    }
    
    public void setNumberOfSeats(int numberOfSeats){
    this.numberOfSeats = numberOfSeats;
    }
}
