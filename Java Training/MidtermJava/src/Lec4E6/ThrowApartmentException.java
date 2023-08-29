package Lec4E6;

public class ThrowApartmentException {
    public static void main(String[] args) throws Exception {
        Apartment[] arr;
        arr = new Apartment[6];
        try {
            arr[0] = new Apartment("Apple St.", 203, 2, 600);
            arr[1] = new Apartment("Orange St.", 252, 1, 700);
            arr[2] = new Apartment("Banana St.", 200, 2, 800);
            arr[3] = new Apartment("Pineapple St.", 273, 3, 1033);
            arr[4] = new Apartment("Grape St.", 246, 4, 600);
            arr[5] = new Apartment("Watermelon St.", 100, 6, 2500);
        } catch (ApartmentException e) {
            System.out.println("A problem occured: "+e);
        }
    }
}
