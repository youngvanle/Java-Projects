// Driver.java
// Main application that manages rescue animals for Grazioso Rescue using a text-based menu interface

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    // Lists to store dogs and monkeys
    static ArrayList<Dog> dogList = new ArrayList<Dog>();
    static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        // Display the menu until the user chooses to quit
        while (true) {
            displayMenu();
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("q")) {
                break;
            }

            switch (userInput.toLowerCase()) {
                case "1":
                    intakeNewDog(scanner);
                    break;
                case "2":
                    intakeNewMonkey(scanner);
                    break;
                case "3":
                    reserveAnimal(scanner);
                    break;
                case "4":
                    printAnimals("dog");
                    break;
                case "5":
                    printAnimals("monkey");
                    break;
                case "6":
                    printAvailableAnimals();
                    break;
                default:
                    System.out.println("Invalid selection. Please choose a valid menu option.");
                    break;
            }
        }

        scanner.close();
    }

    // Display the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all available animals");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.print("Enter a menu selection: ");
    }

    // Intake a new dog into the system
    public static void intakeNewDog(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        // Check if dog already exists
        for (Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return;
            }
        }

        // Collect remaining information
        System.out.print("Enter breed: ");
        String breed = scanner.nextLine();
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter acquisition date: ");
        String acquisitionDate = scanner.nextLine();
        System.out.print("Enter acquisition location: ");
        String acquisitionLocation = scanner.nextLine();
        System.out.print("Enter training status: ");
        String trainingStatus = scanner.nextLine();
        System.out.print("Enter in-service country: ");
        String inServiceCountry = scanner.nextLine();

        // Create and add new dog to the list
        Dog newDog = new Dog(name, "dog", gender, age, weight, acquisitionDate,
                             acquisitionLocation, false, trainingStatus, inServiceCountry, breed);
        dogList.add(newDog);
    }

    // Intake a new monkey into the system
    public static void intakeNewMonkey(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        // Check if monkey already exists
        for (Monkey monkey : monkeyList) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return;
            }
        }

        // Collect remaining information
        System.out.print("Enter species: ");
        String species = scanner.nextLine();
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter tail length (in inches): ");
        double tailLength = scanner.nextDouble();
        System.out.print("Enter height (in inches): ");
        double height = scanner.nextDouble();
        System.out.print("Enter body length (in inches): ");
        double bodyLength = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter acquisition date: ");
        String acquisitionDate = scanner.nextLine();
        System.out.print("Enter acquisition location: ");
        String acquisitionLocation = scanner.nextLine();
        System.out.print("Enter training status: ");
        String trainingStatus = scanner.nextLine();
        System.out.print("Enter in-service country: ");
        String inServiceCountry = scanner.nextLine();

        // Create and add new monkey to the list
        Monkey newMonkey = new Monkey(name, "monkey", gender, age, weight, acquisitionDate,
                                      acquisitionLocation, false, trainingStatus, inServiceCountry,
                                      species, tailLength, height, bodyLength);
        monkeyList.add(newMonkey);
    }

    // Reserve an animal
    public static void reserveAnimal(Scanner scanner) {
        System.out.print("Enter animal type (dog or monkey): ");
        String type = scanner.nextLine().toLowerCase();
        System.out.print("Enter country: ");
        String country = scanner.nextLine();

        if (type.equals("dog")) {
            for (Dog dog : dogList) {
                if (!dog.getReserved() && dog.getInServiceCountry().equalsIgnoreCase(country)) {
                    dog.setReserved(true);
                    System.out.println(dog.getName() + " has been reserved.");
                    return;
                }
            }
        } else if (type.equals("monkey")) {
            for (Monkey monkey : monkeyList) {
                if (!monkey.getReserved() && monkey.getInServiceCountry().equalsIgnoreCase(country)) {
                    monkey.setReserved(true);
                    System.out.println(monkey.getName() + " has been reserved.");
                    return;
                }
            }
        } else {
            System.out.println("Invalid animal type.");
        }
    }

    // Print animals by type (dog or monkey)
    public static void printAnimals(String type) {
        if (type.equals("dog")) {
            for (Dog dog : dogList) {
                System.out.println(dog.getName());
            }
        } else if (type.equals("monkey")) {
            for (Monkey monkey : monkeyList) {
                System.out.println(monkey.getName());
            }
        }
    }

    // Print all available (non-reserved) animals in service
    public static void printAvailableAnimals() {
        for (Dog dog : dogList) {
            if (!dog.getReserved() && dog.getTrainingStatus().equalsIgnoreCase("in service")) {
                System.out.println(dog.getName() + " - Dog");
            }
        }

        for (Monkey monkey : monkeyList) {
            if (!monkey.getReserved() && monkey.getTrainingStatus().equalsIgnoreCase("in service")) {
                System.out.println(monkey.getName() + " - Monkey");
            }
        }
    }
}