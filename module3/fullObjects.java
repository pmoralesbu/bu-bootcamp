public class fullObjects {
  

 // FIELDS: the data each Employee object holds 
    private String  name; 
    private double  salary; 
    private boolean active; 
 
    // CONSTRUCTOR: runs when you write new Employee(...) 
    public fullObjects(String name, double salary) { 
        this.name   = name;     // 'this.name' is the field; 'name' is the parameter 
        this.salary = salary; 
        this.active = true;     // all new employees start active 
    } 
 
    // GETTERS: controlled read access to private fields 
    public String  getName()   { return name; } 
    public double  getSalary() { return salary; } 
    public boolean isActive()  { return active; } 
 
    // METHODS: actions this object can perform 
    public void promote(double raise) { 
        if (raise > 0) this.salary += raise; 
    } 
 
    public void deactivate() { 
        this.active = false; 
    } 
 
    // TOSTRING: what prints when you System.out.println(employee) 
    @Override 
    public String toString() { 
        return name + " | $" + salary + " | active: " + active; 
    }

    public static void main(String[] args) {

      fullObjects ada = new fullObjects("Ada Lovelace", 95000.0);
       fullObjects alan = new fullObjects("Alan Turing", 102000.0);

        System.out.println(ada);
        System.out.println(alan);
    }

}
