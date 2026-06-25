package SafeRoad;

public class Location {

    int locationId;
    String roadName;
    String city;
    String accidentZone;

    // Constructor
    public Location(int locationId, String roadName,
                    String city, String accidentZone) {

        this.locationId = locationId;
        this.roadName = roadName;
        this.city = city;
        this.accidentZone = accidentZone;
    }

    // Display Method
    public void displayLocation() {

        System.out.println("Location ID   : " + locationId);
        System.out.println("Road Name     : " + roadName);
        System.out.println("City          : " + city);
        System.out.println("Accident Zone : " + accidentZone);
        System.out.println();
    }
}