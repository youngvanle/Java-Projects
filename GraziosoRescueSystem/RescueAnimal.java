// RescueAnimal.java
// Defines a base class for all rescue animals used in the Grazioso Rescue system.
// Includes shared attributes like name, age, training status, and service location.

public class RescueAnimal {
    // Initialize variables
    private String name;
    private String animalType;
    private String gender;
    private int age;
    private double weight;
    private String acquisitionDate;
    private String acquisitionLocation;
    private boolean reserved;
    private String trainingStatus;
    private String inServiceCountry;

    // Constructor to initialize RescueAnimal attributes
    public RescueAnimal(String name, String animalType, String gender, int age, double weight,
                        String acquisitionDate, String acquisitionLocation, boolean reserved,
                        String trainingStatus, String inServiceCountry) {
        this.name = name;
        this.animalType = animalType;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.acquisitionDate = acquisitionDate;
        this.acquisitionLocation = acquisitionLocation;
        this.reserved = reserved;
        this.trainingStatus = trainingStatus;
        this.inServiceCountry = inServiceCountry;
    }

    // Default constructor
    public RescueAnimal() {}

    // Accessor and mutator methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(String acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public String getAcquisitionLocation() {
        return acquisitionLocation;
    }

    public void setAcquisitionLocation(String acquisitionLocation) {
        this.acquisitionLocation = acquisitionLocation;
    }

    public boolean getReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public String getTrainingStatus() {
        return trainingStatus;
    }

    public void setTrainingStatus(String trainingStatus) {
        this.trainingStatus = trainingStatus;
    }

    public String getInServiceCountry() {
        return inServiceCountry;
    }

    public void setInServiceCountry(String inServiceCountry) {
        this.inServiceCountry = inServiceCountry;
    }
}