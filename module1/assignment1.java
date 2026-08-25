import java.util.Scanner; 

public class assignment1 {
  public static void main(String[] args){
    System.out.println("\n");
    System.out.println("First Assignment without the colon ; for compiler error\n\n");

    /*
    Part B small program to read and respond with your full name and the terminal
    commands used to run the program below.

    javac assignment1.java
    java assignment1

    */
    Scanner scanner = new Scanner(System.in); 
    System.out.print("Please write your full name in the input box? "); 
    String name = scanner.nextLine(); 
    System.out.println("Hello, " + name + "! Welcome to the OMSE program on Artificial Intelligence."); 
    scanner.close();



  }


}



