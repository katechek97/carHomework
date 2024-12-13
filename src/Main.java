//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Engine.Engine;
import Engine.HydrogenEngine;
import Engine.DieselEngine;
import Engine.NuclearEngine;
import Engine.GasolineEngine;
import Wheel.Wheel;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {

        Engine engine = new HydrogenEngine();
        Engine engine1 = new DieselEngine();
        Engine engine2 = new NuclearEngine();
        Engine engine3 = new GasolineEngine();

        List<Wheel> wheels1 = List.of(new Wheel(), new Wheel(), new Wheel(), new Wheel());
        List<Wheel> wheels2 = List.of(new Wheel(), new Wheel());
        List<Wheel> wheels3 = List.of(new Wheel(), new Wheel(), new Wheel(), new Wheel(), new Wheel(), new Wheel());


        PassengerCar car1 = new PassengerCar(30, engine3, "Toyota", "LA123M", "red", wheels1);
        PassengerCar car2 = new PassengerCar(40, engine1, "Toyota", "NV674D", "blue", wheels1);
        PassengerCar car3 = new PassengerCar(25, engine1, "Toyota", "XA124R", "white", wheels1);
        PassengerCar car4 = new PassengerCar(35, engine3, "Nissan", "KJ777V", "black", wheels1);
        PassengerCar car5 = new PassengerCar(50, engine3, "Nissan", "LO098P", "black", wheels1);
        PassengerCar car6 = new PassengerCar(40, engine1, "Range Rover", "BH148C", "grey", wheels1);
        PassengerCar car7 = new PassengerCar(45, engine1, "Kia", "NN444N", "blue", wheels1);
        PassengerCar car8 = new PassengerCar(50, engine3, "Kia", "CF098K", "red", wheels1);
        PassengerCar car9 = new PassengerCar(30, engine1, "Mini cooper", "AL973C", "blue", wheels1);
        PassengerCar car10 = new PassengerCar(32, engine3, "Kia", "BB656F", "white", wheels1);
        Truck car11 = new Truck(350, engine, "Scania", "FA122D", "white", wheels1);
        Truck car12 = new Truck(300, engine1, "Volvo", "SC146D", "black", wheels1);
        Truck car13 = new Truck(350, engine, "Scania", "KB666F", "white", wheels1);
        PublicTransport car14 = new PublicTransport(150, engine1, "Daewoo", "FE111E", "yellow", wheels1);
        PublicTransport car15 = new PublicTransport(150, engine1, "Daewoo", "MM999M", "yellow", wheels1);
        PublicTransport car16 = new PublicTransport(200, engine3, "Mercedes", "SS078S", "white", wheels1);
        Motorbike car17 = new Motorbike(20, engine3, "Yamaha", "BL124O", "red", wheels2);
        Motorbike car18 = new Motorbike(20, engine3, "Yamaha", "CV888V", "black", wheels2);

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

        //задание на удаление из списка (машины марки "Тойота" должны вывезти с парковки на ремонт
        parkingLot.removeIf(car -> car.carBrand.equals("Toyota"));
        System.out.println("оставшиеся на парковке автомобили: " + parkingLot);


        //задание на выбор конкретной машины с парковки
        Car foundCar = null;
        for (Car car : parkingLot) {
            if ("Mini cooper".equals(car.carBrand) && "AL973C".equals(car.carNumber) && "blue".equals(car.color)) {
                foundCar = car;
                break;
            }
        }
        if (foundCar != null) {
            System.out.println("найден автомобиль: " + foundCar.carBrand + " " + foundCar.carNumber + " " + foundCar.color);
        } else {
            System.out.println("Автомобиль не найден");
        }

        //задание на распределение машин по 4 зонам парковки в зависимости от типа транспортного средства

        ArrayList<PassengerCar> passengerCars = new ArrayList<>();
        ArrayList<Truck> trucks = new ArrayList<>();
        ArrayList<PublicTransport> publicTransport = new ArrayList<>();
        ArrayList<Motorbike> motorbikes = new ArrayList<>();

        for (Car car : parkingLot) {
            if (car instanceof PassengerCar) {
                passengerCars.add((PassengerCar) car);
            } else if (car instanceof Truck) {
                trucks.add((Truck) car);
            } else if (car instanceof PublicTransport) {
                publicTransport.add((PublicTransport) car);
            } else if (car instanceof Motorbike) {
                motorbikes.add((Motorbike) car);
            } else {
                System.out.println("неизвестный тип транспортного средства: " + car);
            }
        }

        System.out.println("Легковые автомобили: " + passengerCars);
        System.out.println("Грузовые автомобили: " + trucks);
        System.out.println("Автобусы: " + publicTransport);
        System.out.println("Мотоциклы: " + motorbikes);

        //задание на добавление в список нового типа автомобилей

        NuclearCar car19 = new NuclearCar(500, engine2, "CosmicCar", "KL888M", "white", wheels3);
        NuclearCar car20 = new NuclearCar(500, engine2, "CosmicCar", "MC444L", "black", wheels3);
        NuclearCar car21 = new NuclearCar(600, engine2, "CosmicCar", "OL099D", "red", wheels3);

        ArrayList<NuclearCar> nuclearCars = new ArrayList<>();
        nuclearCars.add(car19);
        nuclearCars.add(car20);
        nuclearCars.add(car21);
        System.out.println(nuclearCars);
        parkingLot.addAll(nuclearCars);
        System.out.println(parkingLot);

        //задание с LinkedList (попробовала добавить машину на место в середине парковки)

        LinkedList<Car> parkingLot2 = new LinkedList<>();
        parkingLot2.add(car1);
        parkingLot2.add(car2);
        parkingLot2.add(car3);
        parkingLot2.add(car4);
        parkingLot2.add(car5);
        parkingLot2.add(car6);
        parkingLot2.add(car7);
        parkingLot2.add(car8);
        parkingLot2.add(car9);
        parkingLot2.add(car10);
        parkingLot2.add(car11);
        parkingLot2.add(car12);
        parkingLot2.add(car13);
        parkingLot2.add(car14);
        parkingLot2.add(car15);
        parkingLot2.add(car16);
        parkingLot2.add(car17);
        parkingLot2.add(car18);

        PassengerCar newCar = new PassengerCar(40, engine1, "BMW", "AA777A", "black", wheels1);
        parkingLot2.add(15,newCar);
        System.out.println(parkingLot2);


    }
    }

