// Monkey.java
// Represents a rescue monkey, extending RescueAnimal and adding species-specific attributes.

public class Monkey extends RescueAnimal {
    // Species of the monkey
    private String species;

    // Tail length in inches
    private double tailLength;

    // Height in inches
    private double height;

    // Body length in inches
    private double bodyLength;

    // Constructor to initialize monkey-specific and inherited attributes
    public Monkey(String name, String animalType, String gender, int age, double weight,
                  String acquisitionDate, String acquisitionLocation, boolean reserved,
                  String trainingStatus, String inServiceCountry, String species,
                  double tailLength, double height, double bodyLength) {
        // Call the parent constructor
        super(name, animalType, gender, age, weight, acquisitionDate, acquisitionLocation,
              reserved, trainingStatus, inServiceCountry);
        this.species = species;
        this.tailLength = tailLength;
        this.height = height;
        this.bodyLength = bodyLength;
    }

    // Return the species
    public String getSpecies() {
        return species;
    }

    // Set the species
    public void setSpecies(String species) {
        this.species = species;
    }

    // Return the tail length
    public double getTailLength() {
        return tailLength;
    }

    // Set the tail length
    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    // Return the height
    public double getHeight() {
        return height;
    }

    // Set the height
    public void setHeight(double height) {
        this.height = height;
    }

    // Return the body length
    public double getBodyLength() {
        return bodyLength;
    }

    // Set the body length
    public void setBodyLength(double bodyLength) {
        this.bodyLength = bodyLength;
    }
}