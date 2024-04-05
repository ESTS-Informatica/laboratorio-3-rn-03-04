
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
    
    public String getTransportType(){
        return "Transporte Terrestre";
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "LicensePlate", this.licensePlate));
        return sb.toString();
    }
}
