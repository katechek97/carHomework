package CoolingSystem;

interface CoolingSystemInterface {
    void startCooling(double engineTemperature, double optimalTemperature);
    void stopCooling();
    boolean isCooling();

}
