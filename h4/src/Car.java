public class Car {

    String owner;
    int year;
    String color;
    double price;
    String regNumber;
    String engine;
    double engineCapacity;
    String fuelType;
}
class PassengerCar extends Car{

    int passCapacity;
}
class Truck extends Car{

    int liftCapacity;
}
class PassCar extends PassengerCar{

    int trunkVolume;
    String gearboxType;
    String bodyType;
}
class Bus extends PassengerCar{
    int routeNumber;
}
class Trolleybus extends PassengerCar{
    int routeNumber;
    double eEnginePower;
    }
class Microbus extends Car{ //здесь должно быть наследование от 2 классов - PassengerCar и Truck, но java его не поддерживает, а до интерфейсов я еще не дошла
    String type;
    int liftCapacity;
    int passCapacity;
}
