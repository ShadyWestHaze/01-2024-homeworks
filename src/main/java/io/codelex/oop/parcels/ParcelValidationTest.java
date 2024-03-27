package src.main.java.io.codelex.oop.parcels;

public class ParcelValidationTest {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(40, 50, 60, 25.0f, false);
        System.out.println("Parcel 1 validation: " + parcel1.validate() + "\n");

        Parcel parcel2 = new Parcel(20, 40, 30, 10.0f, true);
        System.out.println("Parcel 2 validation: " + parcel2.validate() + "\n");

        Parcel parcel3 = new Parcel(80, 100, 150, 20.0f, false);
        System.out.println("Parcel 3 validation: " + parcel3.validate() + "\n");
    }
}
