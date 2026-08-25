import java.util.*;

public class ContactManager {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // hashMap here
    HashMap<String, Contact> contacts = new HashMap<>();

    contacts.put("Jack Ryan", new Contact("Jack Ryan", "413-888-0000\n"));
    contacts.put("James Bond", new Contact("James Bond", "203-234-4758\n"));
    contacts.put("G W Watson", new Contact("G W Watson", "860-669-4859\n"));
    contacts.put("Henry Kissinger", new Contact("Henry Kissinger", "703-888-8594\n"));
    contacts.put("Al Capone", new Contact("Al Capone", "860-123-3647\n"));

   
    System.out.println("\n");
    System.out.println("CONTACT NAME LOOK UP");
    System.out.print(" Enter Name: \n");

    String name = scanner.nextLine();
    System.out.println("\n");
    // System.out.print(" Name Found in Contact List\n");

    Contact ct = contacts.get(name);

    if (ct == null) {
      System.out.println("Contact not found");
    } else {
      System.out.println("Contact: " + ct);
    }
   
    System.out.println("\n");
    System.out.print(" ###################################\n");
    System.out.print(" ###################################\n");
    System.out.println("\n");
    System.out.println("##  HIT ENTER TO SHOW SORTED NAMES. ##");
    System.out.println("##    IN ALPHABETICAL ORDER   ##");
    System.out.println("\n");
    System.out.print(" ###################################\n");
    System.out.print(" ###################################");
    scanner.nextLine();
    scanner.close();

    // ArrayList here
    ArrayList<Contact> sorted = new ArrayList<>(contacts.values());
    sorted.sort((a, b) -> a.getName().compareTo(b.getName()));
    for (Contact ctt : sorted) {
      System.out.println(ctt);
    }

  }

}
