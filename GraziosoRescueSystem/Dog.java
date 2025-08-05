// Dog.java
// Represents a rescue dog, inheriting shared attributes from RescueAnimal and adding dog-specific fields.

public class Dog extends RescueAnimal {
    // Breed of the dog
    private String breed;

    // Constructor to initialize dog-specific and inherited attributes
    public Dog(String name, String animalType, String gender, int age, double weight,
               String acquisitionDate, String acquisitionLocation, boolean reserved,
               String trainingStatus, String inServiceCountry, String breed) {
        // Call the parent constructor
        super(name, animalType, gender, age, weight, acquisitionDate, acquisitionLocation, reserved, trainingStatus, inServiceCountry);
        this.breed = breed;
    }

    // Return the breed
    public String getBreed() {
        return breed;
    }

    // Set the breed
    public void setBreed(String breed) {
        this.breed = breed;
    }
}