import AirConditioner.AirConditioner;
import CoolingSystem.CoolingSystem;
import Engine.Engine;
import FuelIndicator.FuelIndicator;
import Headlight.Headlight;
import Trunk.Trunk;
import TurnSignal.TurnSignal;
import Wheel.Wheel;
import java.util.List;

abstract class Car {
    TurnSignal leftTurnSignal;
    TurnSignal rightTurnSignal;
    Engine engine;
    Trunk trunk;
    Headlight headlight;
    FuelIndicator fuelIndicator;
    double fuelVolume;
    AirConditioner airConditioner;
    CoolingSystem coolingSystem;
    String carBrand;
    String carNumber;
    String color;
    List<Wheel> wheels;

    public Car(double initialFuelVolume, Engine engine, String carBrand, String carNumber, String color, List<Wheel> wheels) {
        leftTurnSignal = new TurnSignal("левый");
        rightTurnSignal = new TurnSignal("правый");
        fuelVolume = initialFuelVolume;
        this.engine = engine;
        this.carBrand = carBrand;
        this.carNumber = carNumber;
        this.color = color;
        this.wheels = wheels;

    }
    public void move() {
        for (Wheel wheel : wheels) {
            wheel.rotate();
        }
        System.out.println("едет");
    }

    public void fly () {
        for (Wheel wheel : wheels) {
            wheel.flying();
        }

        System.out.println("летит");
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

    @Override
    public String toString() {
        return carBrand + carNumber;
    }

}



