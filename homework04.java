//Gopal Nanda
package homework145;
import java.util.Scanner;
public class homework04 {
private static final double PI = 3.14;
public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     double[] radii = getCircleRadii(scanner);
     displayMenu(scanner, radii);
     scanner.close();}
//gathers data from user
 private static double[] getCircleRadii(Scanner scanner) {int size = 0;
while (true) {System.out.print("Enter number of circles (positive): ");
         if (scanner.hasNextInt()) {
             size = scanner.nextInt();
             if (size > 0) break;} else {scanner.next(); }
         System.out.println("Invalid input. Please enter a positive integer.");}
	double[] radii = new double[size];
     for (int i = 0; i < size; i++) {
         System.out.print("Enter radius of circle " + (i + 1) + ": ");
         radii[i] = scanner.nextDouble();}return radii;}

//Displays menu 
 private static void displayMenu(Scanner scanner, double[] radii) {while (true) {
         System.out.println("\nMenu:");
         System.out.println("1. Sort areas (ascending)");
         System.out.println("2. Sort areas (descending)");
         System.out.println("3. Display unique areas");
         System.out.println("4. Quit");
         System.out.print("Enter choice:");
         int choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 sortAndDisplayAreas(radii, true);break;
             case 2:
                 sortAndDisplayAreas(radii, false);break;
             case 3:
                 displayUniqueAreas(radii);break;
             case 4:
                 System.out.println("Exiting.");return;
             default:
                 System.out.println("Invalid option. Try again.");}}}
    
//Calculates area from radius
 private static double calculateArea(double radius) {
     return PI * radius * radius;}

//Sorts areas
 private static void sortAndDisplayAreas(double[] radii, boolean ascending) {
     if (radii.length == 0) {
         System.out.println("Cannot sort an empty collection."); return;}

     double[] areas = new double[radii.length];
     for (int i = 0; i < radii.length; i++) {
         areas[i] = calculateArea(radii[i]);}

     for (int i = 0; i < areas.length - 1; i++) {
         for (int j = 0; j < areas.length - i - 1; j++) {
             if (ascending ? (areas[j] > areas[j + 1]) : (areas[j] < areas[j + 1])) {
                 double temp = areas[j];
                 areas[j] = areas[j + 1];
                 areas[j + 1] = temp;}}}

     System.out.println("Sorted areas:");
     for (double area : areas) {
         System.out.println(area);}}
 //Displays areas
 private static void displayUniqueAreas(double[] radii) {
     if (radii.length == 0) {
         System.out.println("No circles to display.");return;}
     

     double[] areas = new double[radii.length];
     for (int i = 0; i < radii.length; i++) {
         areas[i] = calculateArea(radii[i]);}
     

     boolean[] isDuplicate = new boolean[areas.length];
     for (int i = 0; i < areas.length; i++) {
         for (int j = i + 1; j < areas.length; j++) {
             if (areas[i] == areas[j]) {
                 isDuplicate[j] = true;}}}
         
     System.out.println("Unique areas:");
     for (int i = 0; i < areas.length; i++) {
         if (!isDuplicate[i]) {
             System.out.println(areas[i]);}}}}
