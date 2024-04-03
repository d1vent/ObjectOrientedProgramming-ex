package Week7.exam1;

public class MotorBike extends Vehicle {

    private boolean hasSidecar;

    /**
     * Constructor 1.
     * @param brand brand
     * @param model model
     * @param registrationNumber registration number
     * @param owner owner
     * @param hasSidecar has sidecar or not.
     */

    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * Method to get all information about the motorbike.
     * @return information
     */

    public String getInfo() {
        String inforamtion = "Motor Bike:";
        inforamtion += String.format("\n\tBrand: %s", this.brand);
        inforamtion += String.format("\n\tModel: %s", this.model);
        inforamtion += String.format("\n\tRegistration Number: %s", this.registrationNumber);
        inforamtion += String.format("\n\tHas Side Car: %b", this.hasSidecar);
        inforamtion += String.format("\n\tBelongs to %s - %s",
                this.owner.getName(), this.owner.getAddress());
        return inforamtion;
    }

    /**
     * Check if the motorbike has a sidecar or not.
     * @return has a sidecar or not.
     */

    public boolean isHasSidecar() {
        return this.hasSidecar;
    }

    /**
     * Setter method to check if the motorbike has a sidecar or not.
     * @param hasSidecar has a sidecar or not.
     */

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}


