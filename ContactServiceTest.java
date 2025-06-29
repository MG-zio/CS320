package ContactService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest{
    // Test for the createContact function and get functions.
    @Test
    void testContactServiceClass(){
        ContactService.createContact("Joe", "Mama", "4254254251", "3828 Piermont Drive NM");
        assertTrue(ContactService.contactList.get(0).getFirstName().equals("Joe"));
        assertTrue(ContactService.contactList.get(0).getLastName().equals("Mama"));
        assertTrue(ContactService.contactList.get(0).getNumber().equals("4254254251"));
        assertTrue(ContactService.contactList.get(0).getAddress().equals("3828 Piermont Drive NM"));
    }

    // Test for deleteContact function.
    @Test
    void testDeleteFunction(){
        ContactService.createContact("Joe", "Mama", "4254254251", "3828 Piermont Drive NM");
        int oldSize = ContactService.contactList.size();
        String testID = ContactService.contactList.get(oldSize - 1).getID();
        ContactService.deleteContact(testID);
        int newSize = ContactService.contactList.size();
        assertTrue(oldSize == newSize + 1);
    }

    // Test for updateFirstName function.
    @Test
    void testFirstNameUpdater(){
        ContactService.createContact("Jeff", "Dad", "2412412411", "6331 Hollywood Boulevard");
        int size = ContactService.contactList.size();
        String testID = ContactService.contactList.get(size - 1).getID();
        ContactService.updateFirstName(testID, "John");
        assertTrue(ContactService.contactList.get(size - 1).getFirstName().equals("John"));
    }

    // Test for updateLastName function.
    @Test
    void testLastNameUpdater(){
    	ContactService.createContact("Jeff", "Mom", "2412412412", "loblolly drive");
        int size = ContactService.contactList.size();
        String testID = ContactService.contactList.get(size - 1).getID();
        ContactService.updateLastName(testID, "Jonah");
        assertTrue(ContactService.contactList.get(size - 1).getLastName().equals("Jonah"));
    }

    // Test for updateNumber function.
    @Test
    void testNumberUpdater(){
    	ContactService.createContact("Jeff", "Mom", "2412412411", "loblolly drive");
        int size = ContactService.contactList.size();
        String testID = ContactService.contactList.get(size - 1).getID();
        ContactService.updateNumber(testID, "1234567890");
        assertTrue(ContactService.contactList.get(size - 1).getNumber().equals("1234567890"));
    }

    // Test for updateAddress function.
    void testAddressUpdater(){
    	ContactService.createContact("Jeff", "Mom", "2412412411", "loblolly drive");
        int size = ContactService.contactList.size();
        String testID = ContactService.contactList.get(size - 1).getID();
        ContactService.updateNumber(testID, "5930 Franklin Ave. LA, CA");
        assertTrue(ContactService.contactList.get(size - 1).getAddress().equals("5930 Franklin Ave. LA, CA"));
    }
}