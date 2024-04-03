package Week7.exam1;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList;

    /**
     * Constructor 1.
     * @param name name
     * @param address address
     */

    public Person(String name, String address) {
        this.vehicleList = new ArrayList<>();
        this.name = name;
        this.address = address;
    }

    /**
     * Add a vehicle.
     * @param vehicle vehicle
     */

    public void addVehicle(Vehicle vehicle) {
        this.vehicleList.add(vehicle);
    }

    /**
     * Remove a vehicle.
     * @param registrationNumber registration number
     */

    public void removeVehicle(String registrationNumber) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(vehicle);
                break;
            }
        }
    }

    /**
     * Method to get all vehicle information from the person.
     * @return information
     */

    public String getVehiclesInfo() {
        if (vehicleList.isEmpty()) {
            return this.name + " has no vehicle!";
        }
        StringBuilder res = new StringBuilder();
        res.append(this.name + " has:\n\n");
        for (Vehicle vehicle : vehicleList) {
            res.append(vehicle.getInfo() + "\n");
        }
        return res.toString();
    }

    /**
     * Getter method for the name.
     * @return name
     */

    public String getName() {
        return name;
    }

    /**
     * Setter method for the name.
     * @param name name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for the address.
     * @return address
     */

    public String getAddress() {
        return address;
    }

    /**
     * Setter method for the address.
     * @param address address
     */

    public void setAddress(String address) {
        this.address = address;
    }

}


