public class oopCode1 {

String name;
double salary;

public oopCode1(String name, double salary){
  this.name = name;
  this.salary = salary;
}

  public static void main(String[] args){
  // THIS IS A SMALL EXAMPLE WITH FIELDS MAKDE OUTSIDE THE MAIN METHOD AND CONSTRUCTOR.  THEN
  // YOU CAN CREATE THE CODE FOR OBJECTS SUCH AS OOPCODE1.  


    oopCode1 ada = new oopCode1("ada Lovelace", 95000.0);
    oopCode1 alan = new oopCode1("alan Turing", 102000.0);

  System.out.println(ada.name);
  System.out.println(alan.name);
 System.out.println(alan.salary);
  System.out.println(ada.salary);
  }
}
