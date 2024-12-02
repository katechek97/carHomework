import java.util.Scanner;
public class Car {
    TurnSignal leftTurnSignal;
    TurnSignal rightTurnSignal;
    Engine engine;
    Wheel frontLeft;
    Wheel frontRight;
    Wheel rearLeft;
    Wheel rearRight;
    Trunk trunk;
    Headlight headlight;
    FuelIndicator fuelIndicator;
    double fuelVolume;
    AirConditioner airConditioner;
    CoolingSystem coolingSystem;

    public Car(double initialFuelVolume, Engine engine) {
        leftTurnSignal = new TurnSignal("левый");
        rightTurnSignal = new TurnSignal("правый");
        frontLeft = new Wheel();
        frontRight = new Wheel();
        rearLeft = new Wheel();
        rearRight = new Wheel();
        trunk = new Trunk();
        headlight = new Headlight();
        fuelIndicator = new FuelIndicator();
        fuelVolume = initialFuelVolume;
        airConditioner = new AirConditioner();
        coolingSystem = new CoolingSystem();
        this.engine = engine;


    }
    public void move() {
        frontLeft.rotate();
        frontRight.rotate();
        rearRight.rotate();
        rearLeft.rotate();
        System.out.println("Машина едет");
    }

    public void fly () {
        frontLeft.flying();
        frontRight.flying();
        rearLeft.flying();
        rearRight.flying();
        System.out.println("Машина летит");
    }

    public void setAirConditionerTemperature(double temperature){
        try {
            airConditioner.setTemperature(temperature);
        } catch (IllegalArgumentException e) {
            System.out.println("недопустимое значение");
        }
    }
    public double getAirConditionerTemperature() {
        return airConditioner.getTemperature();
    }
public String getFuelStatus() {
        return fuelIndicator.getFuelStatus(fuelVolume);
}

    public void checkAndCoolEngine() {
        double engineTemperature = engine.getTemperature();
        double optimalTemperature = engine.getOptimalTemperature();
        coolingSystem.startCooling(engineTemperature, optimalTemperature);
    }
    public void StopCooling() {
        coolingSystem.stopCooling();
    }


}



