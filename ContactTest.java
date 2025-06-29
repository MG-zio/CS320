package ContactService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class ContactTest{
    // Tests that the Contact object was properly created.
    @Test
    void testContactClass(){
        Contact contact = new Contact("Joe", "Mama", "4254254251", "3828 Piermont Drive NM");
        assertTrue(contact.getFirstName().equals("Joe"));
        assertTrue(contact.getLastName().equals("Mama"));
        assertTrue(contact.getNumber().equals("4254254251"));
        assertTrue(contact.getAddress().equals("3828 Piermont Drive NM"));
    }

    // Test to catch a first name that is too long or null.
    @Test 
    void testFirstName(){
        assertThrows(IllegalArgumentException.class, () ->{
            new Contact("abcdefghijklmnopqrstuvwxyz", "1", "4254254251", "1");
        });
        assertThrows(IllegalArgumentException.class, () ->{
            new Contact(null, "1", "4254254251", "1");
        });
    }
    
    // Test to catch a last name that is too long or void.
    @Test
    void testLastName(){
        assertThrows(IllegalArgumentException.class, () ->{
            new Contact("1","abcdefghijklmnopqrstuvwxyz", "4254254251", "1");
        });
        assertThrows(IllegalArgumentException.class, () ->{
            new Contact("1", null, "4254254251", "1");
        });
    }

    // Test to catch a phone number that is not 10 characters or null.
    @Test
    void testNumber(){
        assertThrows(IllegalArgumentException.class, () ->{
            new Contact("1","1","4","1");
        });
        assertThrows(IllegalArgumentException.class, () ->{
            new Contact("1","1","12345678901234567890","1");
        });
        assertThrows(IllegalArgumentException.class, () ->{
            new Contact("1", "1", null, "1");
        });
    }

    // Test to catch an address that is more than 30 characters or null.
    @Test
    void testAddress(){
        assertThrows(IllegalArgumentException.class, () ->{
            new Contact("1","1","4254254251","1234567890123456789012345678901234567890");
        });
        assertThrows(IllegalArgumentException.class, () ->{
            new Contact("1","1","4254254251", null);
        });
    }
    // Tests setting Contact name to null or to a string of length greater than 10.
    @Test
    void testSetFirstName() {
    	Contact contact = new Contact("Joe", "Mama", "4254254251", "3828 Piermont Drive NM");
    	assertThrows(IllegalArgumentException.class, () ->{
    		contact.setFirstName(null);
    	});
    	assertThrows(IllegalArgumentException.class, () ->{
    		contact.setFirstName("String that is way too long to be a first name");
    	});
    }
    // Tests setting Contact last name to null or to a string of length greater than 10.
    @Test
    void testSetLastName() {
    	Contact contact = new Contact("Joe", "Mama", "4254254251", "3828 Piermont Drive NM");
    	assertThrows(IllegalArgumentException.class, () ->{
    		contact.setLastName(null);
    	});
    	assertThrows(IllegalArgumentException.class, () ->{
    		contact.setLastName("String that is way too long to be a last name");
    	});
    }
    // Tests setting Contact number to null or to a string with a length that is not 10.
    @Test
    void testSetNumber() {
    	Contact contact = new Contact("Joe", "Mama", "4254254251", "3828 Piermont Drive NM");
    	assertThrows(IllegalArgumentException.class, () ->{
    		contact.setLastName(null);
    	});
    	assertThrows(IllegalArgumentException.class, () ->{
    		contact.setNumber("1");
    	});
    }
    // Tests setting address to null or to a string with a length greater than 30.
    @Test
    void testSetAddress() {
    	Contact contact = new Contact("Joe", "Mama", "4254254251", "3828 Piermont Drive NM");
    	assertThrows(IllegalArgumentException.class, () ->{
    		contact.setAddress(null);
    	});
    	assertThrows(IllegalArgumentException.class, () ->{
    		contact.setAddress("This is a string that far exceeds the max capacity of 30 characters for an address.");
    	});
    }
}