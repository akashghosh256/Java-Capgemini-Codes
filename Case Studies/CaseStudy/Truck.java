package CaseStudy;


class Truck extends AbstractVehicle {

    public Truck(String name, int speed) {
        super(name, speed);
    }

    public void start() {
        System.out.println(name + " Truck is starting.");
    }

    @Override
    public void stop() {
        System.out.println(name + " Truck is stopping.");
    }

    @Override
    public void displaySpeed() {
        System.out.println("Current speed of " + name + " is " + speed + " km/h.");
    }
}