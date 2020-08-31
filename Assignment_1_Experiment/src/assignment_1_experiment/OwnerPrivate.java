
package assignment_1_experiment;

public class OwnerPrivate extends Owner{
    //variables
    public String dateOfBirth;
    
    //Constructors
    public OwnerPrivate(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public OwnerPrivate(String dateOfBirth, String ownerID) {
        super(ownerID);
        this.dateOfBirth = dateOfBirth;
    }

    public OwnerPrivate(String dateOfBirth, String ownerID, String firstName) {
        super(ownerID, firstName);
        this.dateOfBirth = dateOfBirth;
    }

    public OwnerPrivate(String dateOfBirth, String ownerID, String firstName, String lastName) {
        super(ownerID, firstName, lastName);
        this.dateOfBirth = dateOfBirth;
    }

    public OwnerPrivate(String dateOfBirth, String ownerID, String firstName, String lastName, String address) {
        super(ownerID, firstName, lastName, address);
        this.dateOfBirth = dateOfBirth;
    }

    public OwnerPrivate(String dateOfBirth, String ownerID, String firstName, String lastName, String address, String phoneNumber) {
        super(ownerID, firstName, lastName, address, phoneNumber);
        this.dateOfBirth = dateOfBirth;
    }
    
    //accessors and mutators for dateOfBirth
    public String getDateOfBirth(){
    return dateOfBirth;
    }
    
    public void setDateOfBirth(String dateOfBirth){
    this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Private Owner" + "dateOfBirth=" + dateOfBirth;
    }
    
}
