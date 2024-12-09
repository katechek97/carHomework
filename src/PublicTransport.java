import Engine.Engine;
import Wheel.Wheel;

import java.util.ArrayList;
import java.util.List;

public class PublicTransport extends Car{
    public PublicTransport(double initialFuelVolume, Engine engine, String carBrand, String carNumber, String color, List<Wheel> wheels) {
        super(initialFuelVolume, engine, carBrand, carNumber, color, List.of(new Wheel(), new Wheel(), new Wheel(), new Wheel()));
    }
}
