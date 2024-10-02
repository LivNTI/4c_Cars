import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Working with Cars");

        //Datatype variableName = create the object
        //Car      car1         = new Car();

        //create a car
        Car car1 = new Car("Hudson","Blue",200);

        //create a second car
        Car car2 = new Car("Mater", "Brown", 100);

        System.out.println(car1.getName() + " is "+ car1.getColor() + " and has max Speed of " + car1.getMaxSpeed());
        System.out.println(car2.getName() + " is "+ car2.getColor() + " and has max Speed of " + car2.getMaxSpeed());

        car1.speedUp(115);
        car2.speedUp(200);

        //Car[] myCars = new Car[10]; //this is a static array
        ArrayList<Car> myCars = new ArrayList<>();
        //add the cars to the list
        myCars.add(car1);
        myCars.add(car2);
        myCars.add(new Car("Lightning McQueen", "red", 400));

        Car theCar = myCars.get(2);
        System.out.println(theCar.getName() + " is "+ theCar.getColor() + " and has max Speed of " + theCar.getMaxSpeed());
    }

}