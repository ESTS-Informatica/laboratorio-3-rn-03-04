



public class GroundTransportation extends Transport {
    private String licensePlate;
    public static final double fees = 3.0;
    public GroundTransportation(String licensePlate) {
        super();
        this.licensePlate = licensePlate;
        super.setFees(fees);
    } 
}
