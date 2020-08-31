package assignment_1_experiment;

public class Vehicle {
    
    //variables
    public String plateNumber;
    public String engineCapacity;
    public String make;
    public String model;
    public String year;
    public Owner owner;

    //default constructor
    public Vehicle() {
        String plateNumber = null;
        String engineCapacity = null;
        String make = null;
        String model = null;
        String year = null;
    }
    
    public void setOwner (Owner owner){
        this.owner = owner;
    }

    public Vehicle(String plateNumber, String engineCapacity, String make, String model, String year, Owner owner) {
        this.plateNumber = plateNumber;
        this.engineCapacity = engineCapacity;
        this.make = make;
        this.model = model;
        this.year = year;
        this.owner = owner;
    }
    
    public Vehicle(String plateNumber, String engineCapacity, String make, String model, String year) {
        this.plateNumber = plateNumber;
        this.engineCapacity = engineCapacity;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //accessor and mutator methods for plateNumber
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    //accessor and mutator methods for engineCapacity
    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    //accessor and mutator methods for make 
    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    //accessor and mutator methods for model
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    //accessor and mutator methods for year
    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

}

