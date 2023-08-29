package Lec4E6;

public class Apartment{
    private String address;
    private int apartmentNum;
    private int bedroomNum;
    private double rentValue;

    Apartment(String address, int apartmentNum, int bedroomNum, double rentValue) throws ApartmentException {

        if (apartmentNum < 100 || apartmentNum > 999) {
            throw new ApartmentException("Unsuccessful: Invalid Apartment Number");
        } else if (bedroomNum < 1 || bedroomNum > 4) {
            throw new ApartmentException("Unsuccessful: Invalid Bedroom Number");
        } else if (rentValue < 500 || rentValue > 2500) {
            throw new ApartmentException("Unsuccessful: Invalid Rent Value");
        } else {
            this.rentValue = rentValue;
            this.apartmentNum = apartmentNum;
            this.bedroomNum = bedroomNum;
            this.address = address;
            System.out.println("Successful: Apartment Status Created");
        }

    }
}
