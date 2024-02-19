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
    // Getters and setters
    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }


    public void printMe(){
        System.out.println("Car Type:" +  this.cartype + " Car Brand: " + this.carbrand + " Milage: " + this.milage);
    }













}
