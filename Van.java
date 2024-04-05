public class Van extends GroundTransportation {
    private int packages;

    
    public Van(int packages, String licensePlate){
        super(licensePlate);
        this.packages = packages;
    }
    
    public void setPackages(int Packages){
        if (this.packages >= 0){
            this.packages = packages;
        }
    }    
    public int getPackages(){
        return this.packages;
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Packages", this.packages));
        return sb.toString();
    }
}
