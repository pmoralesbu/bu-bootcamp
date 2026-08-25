
import java.util.ArrayList;

public  class arraylistOne {
  public static void main(String[] args){
    ArrayList<String> servers = new ArrayList<>();

    servers.add("web-01");
    servers.add("web-02");
    servers.add("db-01");

System.out.println(servers.get(0));       // web-01 
System.out.println(servers.get(2));       // db-01 
System.out.println(servers.size());

servers.remove("web-02");
System.out.println(servers.size());

for (String server : servers){
  System.out.println(server);
}
  }
}
