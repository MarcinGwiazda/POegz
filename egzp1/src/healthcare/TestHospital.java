package healthcare;

public class TestHospital {
    public static void main(String[] args) {
        // Tworzenie obiektów
        Hospital hospital1 = new Hospital("City Hospital", 200);
        Hospital hospital2 = new Hospital("Community Hospital", 150);
        Clinic clinic1 = new Clinic("Dental Clinic", 20, 4.5);
        Clinic clinic2 = new Clinic("Orthopedic Clinic", 30, 3.2);
        Clinic clinic3 = new Clinic("Eye Clinic", 25, 4.0);

        // Sprawdzanie poprawności metody equals
        System.out.println("hospital1.equals(hospital2): " + hospital1.equals(hospital2));
        System.out.println("clinic1.equals(clinic2): " + clinic1.equals(clinic2));
        System.out.println("clinic2.equals(clinic3): " + clinic2.equals(clinic3));
        System.out.println("hospital1.equals(clinic1): " + hospital1.equals(clinic1));
        System.out.println("clinic1.equals(hospital1): " + clinic1.equals(hospital1));
    }
}
