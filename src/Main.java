//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Engine engine = new HydrogenEngine();
        engine.setTemperature(324);
        Car car = new Car(150, engine);
        System.out.println(car.getFuelStatus());
        car.trunk.close();
        car.headlight.on();
        car.setAirConditionerTemperature(17);
        car.move();
        car.leftTurnSignal.turnOn();
        car.fly();
        car.checkAndCoolEngine();


    }
    }

