

 
public class AirTransportation extends Transport {
    private String name;
    private int numberOfContainers;
    public static final double fees = 4.0;
    public AirTransportation(String name, int numberOfContainers) {
        super();
        this.name = name;
        this.numberOfContainers = numberOfContainers;  
        this.setFees(fees);
    }
    
    public void setName(String name){
        if (this.name != null){
            this.name = name;
        }
    }    
    public String getName(){
        return this.name;
    }
    
    public void setNumberOfContainers(int numberOfContainers){
        if (this.numberOfContainers >= 0){
            this.numberOfContainers = numberOfContainers;
        }
    }    
    public int getLicensePlate(){
        return this.numberOfContainers;
    }
    
    public String getTransportType(){
        return "Transporte Aereo";
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        
        sb.append(String.format("%15s: %s\n", "Name", this.name));
        sb.append(String.format("%15s: %s\n", "Number Of Containers", this.numberOfContainers));
        return sb.toString();
    }
    
    
    
}

