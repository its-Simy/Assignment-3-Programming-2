public class Car {

    private String cartype;
    private String carbrand;
    private int milage;


    Car(){
        cartype = "SUV";
        carbrand = "CX 5";
        milage = 1000;
    }


    Car(String ct, String cb, int m){

        this.cartype = ct;
        this.carbrand = cb;
        this.milage = m;

    }

    Car(Car other){
        this.cartype = other.cartype;
        this.carbrand = other.carbrand;
        this.milage = other.milage;
    }














}
