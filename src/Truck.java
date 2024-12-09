import Engine.Engine;
import Wheel.Wheel;

import java.util.List;

public class Truck extends Car{
    public Truck(double initialFuelVolume, Engine engine, String carBrand, String carNumber, String color, List<Wheel> wheels) {
        super(initialFuelVolume, engine, carBrand, carNumber, color, List.of(new Wheel(), new Wheel(), new Wheel(), new Wheel()));
    }
}
