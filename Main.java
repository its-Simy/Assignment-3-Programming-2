public class Main {

    public static void main(String[] args) {
        Car one = new Car("EV", "Tesla", 20);
        Car two = new Car();
        Car three = new Car("Sports Car", "Koenigsegg", 150);

//The tester object will show the shallow copy issue
        Car tester = new Car();
        tester = one;


        one.printMe();
        two.printMe();
        three.printMe();
        tester.printMe();

        one.setMilage(500);
        one.setCarbrand("Infinity");
        one.setCartype("Sedan");

        //This print function shows how the tester object is a shallow copy because without being adjusted directly
        // it still changes because in the memory it has the same address as the one car object
        one.printMe();
        tester.printMe();

    }
}