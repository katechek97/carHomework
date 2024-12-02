public class FuelIndicator implements FuelIndicatorInterface {
    @Override
    public String getFuelStatus(double fuelVolume) {
        if (fuelVolume < 25) {
            return "требуется дозаправка";
        } else {
            return "заправка не требуется";
        }
    }
}
