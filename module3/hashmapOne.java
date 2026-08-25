import java.util.HashMap;
import java.util.Map;

public class hashmapOne {
  public static void main(String[] args){
    HashMap<String, String> userRoles = new HashMap<>(); 
 
userRoles.put("alice",   "admin"); 
userRoles.put("bob",     "viewer"); 
userRoles.put("charlie", "editor"); 
 
// Looking up a value by key 
String role = userRoles.get("alice");               // "admin" 
System.out.println(userRoles);
String missing = userRoles.get("nobody");           // null (not found) 
 System.out.println(missing);
// Safer: provide a fallback if the key is not found 
String safe = userRoles.getOrDefault("nobody", "guest");  // "guest" 
 System.out.println(safe);
// Checking whether a key exists 
boolean exists = userRoles.containsKey("bob");      // true 
System.out.println(exists);
 
// Looping over all pairs 
for (Map.Entry<String, String> entry : userRoles.entrySet()) { 
    System.out.println(entry.getKey() + " -> " + entry.getValue()); 
  }
}
}