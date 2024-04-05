

 
public class AirTransportation extends Transport {
    private String name;
    private int numberOfContainers;
    public static final double fees = 4.0;
    public AirTransportation(String name, int numberOfContainers) {
        super();
        this.name = name;
        this.numberOfContainers = numberOfContainers;  
        super.setFees(fees);
    }
}

