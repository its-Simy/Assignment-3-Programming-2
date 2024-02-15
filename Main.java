public class Main {

Car one = new Car("EV", "Tesla", 20);
Car two = new Car("SUV", "Honda", 1000);
Car three = new Car("Sports Car", "Koenigsegg", 150);

//The tester object will show the shallow copy issue
Car tester = new Car(one);




}
