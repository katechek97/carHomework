package FuelIndicator;

public class FuelIndicator implements FuelIndicatorInterface {
    @Override
    public String getFuelStatus(double fuelVolume) {
        if (fuelVolume < 15) {
            return "требуется дозаправка";
        } else {
            return "заправка не требуется";
        }
    }
}
