package exercises;

public class CarApplicationTest {
    public static void main(String[] args) {

        CarApplication rollsRoyce = new CarApplication("rollsRoyce", "Yr-2024", 23_455.45);
        CarApplication bugatti = new CarApplication("bugatti", "Yr-2025", 45_989.76);

        System.out.printf("This car brand model %s price is: $%.2f\n", rollsRoyce.getModel(), rollsRoyce.getPrice());
        System.out.printf("This car brand model %s price is: $%.2f\n", bugatti.getModel(), bugatti.getPrice());

    }
}
