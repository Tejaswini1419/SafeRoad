package SafeRoad;

public class Accident {

    int id;
    String location;
    String severity;
    String status;

    public Accident(int id, String location, String severity) {
        this.id = id;
        this.location = location;
        this.severity = severity;
        this.status = "REPORTED";
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Location: " + location +
                " | Severity: " + severity +
                " | Status: " + status;
    }
}