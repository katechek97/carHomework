package Engine;

public class NuclearEngine implements Engine {
    int rotation;
    double optimalTemperature = 300;
    double currentEngineTemperature;

    public NuclearEngine() {
        this.currentEngineTemperature = optimalTemperature;
        this.rotation = 100000;
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
