//Gopal nanda
package homework145;
public class homework05 {
private String name;
 private int caffeineContent; 
 public Coffee() {
     this.name = "none";
     this.caffeineContent = 50;}
public String getName() {return name;}

 // Accessor for caffeine content
 public int getCaffeineContent() {
     return caffeineContent;
 }

 // Mutator for name
 public void setName(String name) {
     this.name = name;
 }

 // Mutator for caffeine content with validation
 public void setCaffeineContent(int caffeineContent) {
     if (caffeineContent >= 50 && caffeineContent <= 300) {
         this.caffeineContent = caffeineContent;
     } else {
         throw new IllegalArgumentException("Caffeine content must be between 50 and 300 mg.");
     }
 }

 // Method to calculate risky amount of coffee
 public double riskyAmount() {
     return 180.0 / ((caffeineContent / 100.0) * 6.0);
 }

 // Equals method to compare two Coffee objects
 public boolean equals(Coffee other) {
     return this.name.equals(other.getName()) && this.caffeineContent == other.getCaffeineContent();
 }

 // toString method to return coffee details
 @Override
 public String toString() {
     return "Name: " + name + "\nCaffeine Amount: " + caffeineContent;
 }
}


import java.util.Scanner;
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     String continueInput;

     do {
         // Create two Coffee objects
         Coffee coffee1 = new Coffee();
         Coffee coffee2 = new Coffee();

         // Get details for the first coffee
         System.out.println("Welcome to the Coffee Hour!!! What’s the name of the first coffee?");
         coffee1.setName(scanner.nextLine());
         System.out.println("What’s the caffeine content?");
         int caffeine1 = Integer.parseInt(scanner.nextLine());
         coffee1.setCaffeineContent(caffeine1);

         // Display first coffee details
         System.out.println(coffee1);
         System.out.println("It would take " + coffee1.riskyAmount() + " cups of " + coffee1.getName() + " before it’s dangerous to drink more.");

         // Get details for the second coffee
         System.out.println("What’s the name of the second coffee?");
         coffee2.setName(scanner.nextLine());
         System.out.println("What’s the caffeine content?");
         int caffeine2 = Integer.parseInt(scanner.nextLine());
         coffee2.setCaffeineContent(caffeine2);

         // Display second coffee details
         System.out.println(coffee2);
         System.out.println("It would take " + coffee2.riskyAmount() + " cups of " + coffee2.getName() + " before it’s dangerous to drink more.");

         // Check if both coffees are the same
         System.out.println("Are both coffees the same? " + coffee1.equals(coffee2));

         // Ask if the user wants to continue
         System.out.println("Do you want to create more coffee objects? Enter “Yes” or “No”:");
         continueInput = scanner.nextLine();} while (continueInput.equalsIgnoreCase("Yes"));
     scanner.close();}}

