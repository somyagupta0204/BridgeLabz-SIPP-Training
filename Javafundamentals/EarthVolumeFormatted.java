public class EarthVolumeFormatted{
    public static void main(String[] args){
        double radiusKm = 6378.0;

        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        
        double conversionFactor = 0.239912759; 
        double volumeMiles3 = volumeKm3 * conversionFactor;
       
  System.out.printf("The volume of Earth in cubic kilometers is %.2f km³%n", volumeKm3);
  System.out.printf("The volume of Earth in cubic miles is %.2f mi³%n", volumeMiles3);
    }
}