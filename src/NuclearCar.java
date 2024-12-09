import Engine.Engine;
import Wheel.Wheel;

import java.util.List;

public class NuclearCar extends Car{
    public NuclearCar(double initialFuelVolume, Engine engine, String carBrand, String carNumber, String color, List<Wheel> wheels) {
        super(initialFuelVolume, engine, carBrand, carNumber, color, List.of(new Wheel(), new Wheel(), new Wheel(), new Wheel(), new Wheel(), new Wheel()));

    }
}
