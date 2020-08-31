
package assignment_1_experiment;

public class Owner {
     //variables
    public String ownerID;
    public String firstName;
    public String lastName;
    public String address;
    public String phoneNumber;
    
    //default constructor
    public Owner(){
    String ownerID = null;
    String firstName = null;
    String lastName = null;
    String address = null;
    String phoneNumber = null;
    }
    
    //parameterised constructors
    public Owner(String ownerID){
    setOwnerID(ownerID);
    }
    
    public Owner(String ownerID, String firstName){
    setOwnerID(ownerID);
    setFirstName(firstName);
    }
    
    public Owner(String ownerID, String firstName, String lastName){
    setOwnerID(ownerID);
    setFirstName(firstName);
    setLastName(lastName);
    }
    
    public Owner(String ownerID, String firstName, String lastName, String address){
    setOwnerID(ownerID);
    setFirstName(firstName);
    setLastName(lastName);
    setAddress(address);
    }
    
    public Owner(String ownerID, String firstName, String lastName, String address, String phoneNumber){
    setOwnerID(ownerID);
    setFirstName(firstName);
    setLastName(lastName);
    setAddress(address);
    setPhoneNumber(phoneNumber);
    }
    
    //accessors and mutators for ownerID
    public String getOwnerId(){
    return ownerID;
    }
    
    public void setOwnerID(String ownerID){
    this.ownerID = ownerID;
    }
    
    //accessors and mutators for firstName
    public String getFirstName(){
    return firstName;
    }
    
    public void setFirstName(String firstName){
    this.firstName = firstName;
    }
    
    //accessors and mutators for lastName
    public String getLastName(){
    return lastName;
    }
    
    public void setLastName(String lastName){
    this.lastName = lastName;
    }
    
    //accessors and mutators for address
    public String getAddress(){
    return address;
    }
    
    public void setAddress(String address){
    this.address = address;
    }
    
    //accessors and mutators for phoneNumber
    public String getPhoneNumber(){
    return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Owner" + "ownerID=" + ownerID + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", phoneNumber=" + phoneNumber;
    }

}
