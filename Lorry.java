public class Lorry extends GroundTransportation {
    private int numberOfPallets;
    private int trailers;
    
    public Lorry(int numberOfPalletes, int trailers, String licensePlate){
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }
    
    public void setNumberOfPallets(int numberOfPallets){
        if (this.numberOfPallets >= 0){
            this.numberOfPallets = numberOfPallets;
        }
    }    
    public int getNumberOfPallets(){
        return this.numberOfPallets;
    }
    
    public void setTrailers(int trailers){
        if (this.trailers >= 0){
            this.trailers =trailers;
        }
    }    
    public int getTrailers(){
        return this.trailers;
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Trailers", this.trailers));
        sb.append(String.format("%15s: %s\n", "NumberOfPallets", this.numberOfPallets));
        return sb.toString();
    }
    
    
    
    
    
}