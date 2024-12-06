//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Engine engine = new HydrogenEngine();
        Engine engine1 = new DieselEngine();
        Engine engine2 = new NuclearEngine();

//        engine.setTemperature(324);


        Car car1 = new Car(30, engine1, "Mini cooper", "passenger car", "К431ВУ", "blue");
        Car car2 = new Car(80, engine2, "Toyota", "passenger car", "М333ВО", "red");
        Car car3 = new Car(100, engine1, "Nissan", "passenger car", "А777АА", "black");
        Car car4 = new Car(30, engine1, "Mini cooper", "passenger car", "С672МО", "grey");
        Car car5 = new Car(70, engine2, "Kia", "passenger car", "С546АС", "black");
        Car car6 = new Car(120, engine2, "Range Rover", "passenger car", "Л990СМ", "white");
        Car car7 = new Car(20, engine1, "Kia", "passenger car", "О500ОО", "blue");
        Car car8 = new Car(80, engine2, "Nissan", "passenger car", "М768РО", "red");
        Car car9 = new Car(90, engine1, "Range Rover", "passenger car", "Р623ТО", "grey");
        Car car10 = new Car(76, engine1, "Toyota", "passenger car", "С120УД", "green");
        Car car11 = new Car(40, engine, "Toyota", "passenger car", "В009МИ", "white");
        Car car12 = new Car(90, engine1, "Mercedes", "public transport", "С333ЛУ", "green");
        Car car13 = new Car(80, engine1, "Daewoo", "public transport", "Р645ЛО", "white");
        Car car14 = new Car(80, engine1, "Daewoo", "public transport", "П456АК", "white");
        Car car15 = new Car(90, engine1, "Mercedes", "public transport", "В333ИП", "green");
        Car car16 = new Car(120, engine, "Scania", "truck", "А777АА", "red");
        Car car17 = new Car(100, engine, "Scania", "truck", "В333ВВ", "blue");
        Car car18 = new Car(120, engine, "Volvo", "truck", "П123АА", "white");
        Car car19 = new Car(15, engine1, "Yamaha", "motorbike", "1234", "white");
        Car car20 = new Car(15, engine1, "Yamaha", "motorbike", "4567", "black");



        ArrayList<Car> parkingLot = new ArrayList<>();
        parkingLot.add(car1);
        parkingLot.add(car2);
        parkingLot.add(car3);
        parkingLot.add(car4);
        parkingLot.add(car5);
        parkingLot.add(car6);
        parkingLot.add(car7);
        parkingLot.add(car8);
        parkingLot.add(car9);
        parkingLot.add(car10);
        parkingLot.add(car11);
        parkingLot.add(car12);
        parkingLot.add(car13);
        parkingLot.add(car14);
        parkingLot.add(car15);
        parkingLot.add(car16);
        parkingLot.add(car17);
        parkingLot.add(car18);
        parkingLot.add(car19);
        parkingLot.add(car20);


        parkingLot.removeIf(car -> car.carBrand.equals("Toyota"));
        System.out.println(parkingLot);


        Car foundCar = null;
        for (Car car : parkingLot) {
            if ("Mini cooper".equals(car.carBrand) && "К431ВУ".equals(car.carNumber) && "blue".equals(car.color)) {
                foundCar = car;
                break;
            }
        }
        if (foundCar != null) {
            System.out.println("найден автомобиль: " + foundCar.carBrand + " " + foundCar.carNumber + " " + foundCar.color);
        } else {
            System.out.println("Автомобиль не найден");
        }


        ArrayList<Car> passengerCars = new ArrayList<>();
        ArrayList<Car> trucks = new ArrayList<>();
        ArrayList<Car> publicTransport = new ArrayList<>();
        ArrayList<Car> motorbikes = new ArrayList<>();

        for (Car car : parkingLot) {
            switch (car.type) {
                case "passenger car":
                    passengerCars.add(car);
                    break;
                case "truck":
                    trucks.add(car);
                    break;
                case "public transport":
                    publicTransport.add(car);
                    break;
                case "motorbike":
                    motorbikes.add(car);
                    break;
            }
        }
        System.out.println("Легковые автомобили: " + passengerCars);
        System.out.println("Грузовые автомобили: " + trucks);
        System.out.println("Автобусы: " + publicTransport);
        System.out.println("Мотоциклы: " + motorbikes);





    }
    }

