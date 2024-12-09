package CoolingSystem;

public class CoolingSystem implements CoolingSystemInterface {
    boolean isCooling = false;

    @Override
    public void startCooling(double engineTemperature, double optimalTemperature) {
        if (engineTemperature > optimalTemperature) {
            isCooling = true;
            System.out.println("Охлаждение двигателя включено");
        }
        else {
            System.out.println("Охлаждение не требуется");}

    }

    @Override
    public void stopCooling() {
        isCooling = false;
        System.out.println("Охлаждение двигателя выключено");

    }

    @Override
    public boolean isCooling() {
        return isCooling;
    }
}
