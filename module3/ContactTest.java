import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach; 
 
public class ContactTest { 

 
private Contact contact, contactAlan, contactAlanA;

   
  @BeforeEach 
  void setup() {
    contact = new Contact("Ada Lovelace", 
    "+1 617 555 0101");
    
    contactAlan = new Contact ("Alan Turing", "555-0001");
    contactAlanA = new Contact ("Alan Turing", "555-0001");
    

    // contact = new Contact("Grace Hopper", "555-0000");
    // contact = new Contact("Alan Turing", "555-0001");  
  }
 
  @Test 
  void constructor_setsNameCorrectly() { 
    // Contact c = new Contact("Ada Lovelace", "+1 617 555 0101"); 
    assertEquals("Ada Lovelace", contact.getName()); 
    // assertEquals("Grace Hopper", contact.getName()); 
    // assertEquals("Alan Turing", contact.getName()); 

  } 
 
  @Test
  void constructor_setsPhoneCorrectly() { 
    // Contact c = new Contact("Ada Lovelace", "+1 617 555 0101"); 
    assertEquals("+1 617 555 0101", contact.getPhone());
    // assertEquals("555-0000", contact.getPhone());
    // assertEquals("555-0001", contact.getPhone());
     
  } 
 
  @Test
  void getName_returnsExactString_notTransformed() { 
    // Contact c = new Contact("Grace Hopper", "555-0000"); 
    assertEquals("Ada Lovelace", contact.getName());
    

    // assertEquals("Grace Hopper", contact.getName());
    // assertEquals("Alan Turing", contact.getName());
  } 
 
  @Test
  void toString_containsName() { 
    // Contact c = new Contact("Alan Turing", "555-0001"); 
    assertTrue(contactAlan.toString().contains("Alan Turing"));
  } 
 
  @Test
  void toString_containsPhone() {
    // Contact c = new Contact("Alan Turing", "555-0001");
    assertTrue(contactAlan.toString().contains("555-0001"));
  }

  @Test
  void getNameTwo_twoContactsWithSameName(){
   
    assertEquals("Alan Turing", contactAlan.getName());

    assertEquals("Alan Turing", contactAlanA.getName());

    assertNotEquals(contactAlan, contactAlanA);
  }
}
