public class Car {
    //attribute
    private String color; // No standard value is given
    private int speed = 0; // is given speed 0 if nothing else is given
    private String name;
    private int maxSpeed;

    //constructor
    public Car(String incomingName, String incomingColor, int incominMaxSpeed){
        name = incomingName;
        color = incomingColor;
        maxSpeed = incominMaxSpeed;
    }

    //methods
    public void speedUp(int change){
        if (speed + change < maxSpeed){
            speed = speed + change;
            System.out.println(name + " now has speed of " + speed);
        } else{
            System.out.println("You cannot exceed you rax speed");
        }
    }

    public String getName() {
        return name;
    }

    public String getColor(){
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
