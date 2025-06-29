package ContactService;

public class Contact {
    // Private variables to hold contact information.
    private final String ID;
    private String firstName;
    private String lastName;
    private String number;
    private String address;

    private long newID;

    // Constructor for Contact class
    public Contact(String firstName, String lastName, String number, String address){
        // Throws an exception if there are invalid passed in arguments.
        if(firstName == null || firstName.length() > 10){
            throw new IllegalArgumentException("Invalid first name");
        }
        if(lastName == null || lastName.length() > 10){
            throw new  IllegalArgumentException("Invalid last name");
        }
        if(number == null || number.length() != 10){
            throw new IllegalArgumentException("Invalid number");
        }
        if(address == null || address.length() > 30){
            throw new IllegalArgumentException("Invalid address");
        }
        // Sets private variables to passed in arguments.
        this.ID = createID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.address = address;
    }

    // Creates unique ID
    private String createID(){
        newID = (long)(Math.random() * (9999999999.0));
        return Long.toString(newID);
    }

    // Getter and setter functions for the private variables.
    public String getID(){
        return ID;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String newFirstName){
        if(newFirstName == null || newFirstName.length() > 10){
            throw new IllegalArgumentException("Invalid first name");
        }
        firstName = newFirstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String newLastName){
        if(newLastName == null || newLastName.length() > 10){
            throw new  IllegalArgumentException("Invalid last name");
        }
        lastName = newLastName;
    }

    public String getNumber(){
        return number;
    }
    public void setNumber(String newNumber){
        if(newNumber == null || newNumber.length() != 10){
            throw new IllegalArgumentException("Invalid number");
        }
        number = newNumber;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String newAddress){
        if(newAddress == null || newAddress.length() > 30){
            throw new IllegalArgumentException("Invalid address");
        }
        address = newAddress;
    }
    
}