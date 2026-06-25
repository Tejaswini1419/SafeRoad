package SafeRoad;

public class Violation {

    int violationId;
    String vehicleNumber;
    int fine;

    public Violation(int violationId, String vehicleNumber, int fine) {
        this.violationId = violationId;
        this.vehicleNumber = vehicleNumber;
        this.fine = fine;
    }

    public void display() {
        System.out.println("Violation ID: " + violationId);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Fine: " + fine);
        System.out.println();
    }
}