package Week7.exam1;

public class Car extends Vehicle {

    private int numberOfDoors;

    /**
     * Constructor 1.
     * @param brand brand
     * @param model model
     * @param registrationNumber registration number
     * @param owner owner
     * @param numberOfDoors number of doors
     */

    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Method to get information of the car.
     * @return car's information
     */

    public String getInfo() {
        String information = "Car:";
        information += String.format("\n\tBrand: %s", this.brand);
        information += String.format("\n\tModel: %s", this.model);
        information += String.format("\n\tRegistration Number: %s", this.registrationNumber);
        information += String.format("\n\tNumber of Doors: %d", this.numberOfDoors);
        information += String.format("\n\tBelongs to %s - %s",
                this.owner.getName(), this.owner.getAddress());
        return information;
    }

    /**
     * Getter method for the number of doors.
     * @return number of doors
     */

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Setter method for the number of doors.
     * @param numberOfDoors number of doors.
     */

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

}

