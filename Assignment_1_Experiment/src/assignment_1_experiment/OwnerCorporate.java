
package assignment_1_experiment;

    public class OwnerCorporate extends Owner{
    //variables
    public String ABN;

    public OwnerCorporate(String ABN) {
        this.ABN = ABN;
    }

    public OwnerCorporate(String ABN, String ownerID) {
        super(ownerID);
        this.ABN = ABN;
    }

    public OwnerCorporate(String ABN, String ownerID, String firstName) {
        super(ownerID, firstName);
        this.ABN = ABN;
    }

    public OwnerCorporate(String ABN, String ownerID, String firstName, String lastName) {
        super(ownerID, firstName, lastName);
        this.ABN = ABN;
    }

    public OwnerCorporate(String ABN, String ownerID, String firstName, String lastName, String address) {
        super(ownerID, firstName, lastName, address);
        this.ABN = ABN;
    }

    public OwnerCorporate(String ABN, String ownerID, String firstName, String lastName, String address, String phoneNumber) {
        super(ownerID, firstName, lastName, address, phoneNumber);
        this.ABN = ABN;
    }
    
    //accessors and mutators for ABN
    public String getABN(){
    return ABN;
    }
    
    public void setABN(String ABN){
    this.ABN = ABN;
    }

    @Override
    public String toString() {
        return "Corporate Owner: " + "ABN=" + ABN;
    }

    }

