import Engine.Engine;
import Wheel.Wheel;

import java.util.ArrayList;
import java.util.List;

public class PassengerCar extends Car{
    public PassengerCar(double initialFuelVolume, Engine engine, String carBrand, String carNumber, String color, List<Wheel> wheels) {
        super(initialFuelVolume, engine, carBrand, carNumber, color, List.of(new Wheel(), new Wheel(), new Wheel(), new Wheel()));
    }
}
