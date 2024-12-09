package Engine;

public class DieselEngine implements Engine {
    int rotation;
    double optimalTemperature = 80;
    double currentEngineTemperature;

    public DieselEngine() {
        this.currentEngineTemperature = optimalTemperature;
        this.rotation = 1500;
    }
    @Override
    public int getRotation() {
        return rotation;
    }

    @Override
    public double getOptimalTemperature() {
        return optimalTemperature;
    }

    @Override
    public double getTemperature() {
        return currentEngineTemperature;
    }

    @Override
    public void setTemperature(double engineTemperature) {
        this.currentEngineTemperature = engineTemperature;

        System.out.println("текущая температура двигателя " + currentEngineTemperature);
    }


}
