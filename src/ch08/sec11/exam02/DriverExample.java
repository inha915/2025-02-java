package ch08.sec11.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        Driver driver = new Driver();
        driver.drive(bus); //버스가 달린다
        driver.drive(taxi); //택시가 달린다
    }

}
