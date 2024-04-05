
public class GroundTransportation extends Transport {
    private String licensePlate;
    public static final double fees = 3.0;
    public GroundTransportation(String licensePlate) {
        super();
        this.licensePlate = licensePlate;
        this.setFees(fees);
    } 
    
    public void setLicensePlate(String licensePlate){
        if (this.licensePlate != null){
            this.licensePlate = licensePlate;
        }
    }    
    public String getLicensePlate(){
        return this.licensePlate;
    }
    
    
    
    
    
    
}
