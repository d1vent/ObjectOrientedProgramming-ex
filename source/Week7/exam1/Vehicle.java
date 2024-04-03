package Week7.exam1;

abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * Constructor 1.
     * @param brand brand
     * @param model model
     * @param registrationNumber registration
     * @param owner owner
     */

    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * Get information of the vehicle.
     * @return vehicle's information.
     */

    abstract String getInfo();

    /**
     * Method to transfer ownership of the vehicle.
     * @param newOwner new owner
     */

    public void transferOwnership(Person newOwner) {
        this.owner = newOwner;
    }

    /**
     * Getter method for the vehicle's brand.
     * @return brand
     */

    public String getBrand() {
        return brand;
    }

    /**
     * Setter method for the vehicle's brand.
     * @param brand brand.
     */

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Getter method for the vehicle's model.
     * @return model
     */

    public String getModel() {
        return model;
    }

    /**
     * Setter method for the vehicle's model.
     * @param model The model of the vehicle.
     */

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Getter method for the registration number.
     * @return registration number
     */

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Setter method for the registration number.
     * @param registrationNumber registration number
     */

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * Getter method for the owner of the vehicle.
     * @return The owner of the vehicle.
     */

    public Person getOwner() {
        return owner;
    }

    /**
     * Setter method for the owner of the vehicle.
     * @param owner owner
     */

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
