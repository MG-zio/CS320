package ContactService;
import java.util.ArrayList;

public class ContactService {
    // Variables to temporarily hold information
    public static String newID;
    public static int indexNum;

    // ArrayList that stores contacts.
    static ArrayList<Contact> contactList = new ArrayList<Contact>();
    
    // Instantiates a contact object and stores it within the ArrayList.
    public static void createContact(String newFirstName, String newLastName, String newNumber, String newAddress){
    	Contact newContact = new Contact(newFirstName, newLastName, newNumber, newAddress);;
    	while (!validateID(newContact.getID())) {
    		newContact = null;
            newContact = new Contact(newFirstName, newLastName, newNumber, newAddress);
        } 
        contactList.add(newContact);
    }

    // Checks if contact is unique.
    public static boolean validateID(String ID){
        for (int i = 0; i < contactList.size(); i++){
            if (contactList.get(i).getID().equals(ID)){
                return false;
            }
        }
        return true;
    }

    // Finds the index of the contact in the ArrayList
    public static int getIndex(String ID){
        for (int i = 0; i < contactList.size(); i++){
            if (contactList.get(i).getID().equals(ID)){
                return i;
            }
        }
        return -1;
    }

    // Iterates through contact list and removes contact with given ID.
    public static void deleteContact(String deleteID){
        indexNum = getIndex(deleteID);
        contactList.remove(indexNum);
    }

    // These functions update contact information using the contact's ID.
    public static void updateFirstName(String updateID, String newFirstName){
        indexNum = getIndex(updateID);
        contactList.get(indexNum).setFirstName(newFirstName);
    }
    public static void updateLastName(String updateID, String newLastName){
        indexNum = getIndex(updateID);
        contactList.get(indexNum).setLastName(newLastName);
    }
    public static void updateNumber(String updateID, String newNumber){
        indexNum = getIndex(updateID);
        contactList.get(indexNum).setNumber(newNumber);
    }
    public static void updateAddress(String updateID, String newAddress){
        indexNum = getIndex(updateID);
        contactList.get(indexNum).setAddress(newAddress);
    }
}