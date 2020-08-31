package assignment_1_experiment;

public class VehicleHeavy extends Vehicle {
    //variables 

    String loadCapacity;

    //Default Constructor
    public VehicleHeavy() {
        String loadCapacity = null;
    }

    public VehicleHeavy(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public VehicleHeavy(String loadCapacity, String plateNumber, String engineCapacity, String make, String model, String year, Owner owner) {
        super(plateNumber, engineCapacity, make, model, year, owner);
        this.loadCapacity = loadCapacity;
    }

    //accessor and mutator methods
    public String getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
