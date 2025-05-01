public class Driver {

    // Fields (use camelCase)
    private int driverId;
    private String driverName;
    private Double totalDistance;
    private String category;

    // No-argument constructor
    public Driver() {
    }

    // Parameterized constructor
    public Driver(int driverId, String driverName, Double totalDistance, String category) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.totalDistance = totalDistance;
        this.category = category;
    }

    // Getters and Setters
    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public Double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(Double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
