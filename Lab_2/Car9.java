public class Car9 {
    private double x;
    private double liters;
    private final double consumption;

    public Car9(double consumption){
        this.consumption = consumption;
        this.x = 0;
        this.liters = 0;
    }

    public Car9(int x, int y, double consumption){
        this.consumption = consumption;
        this.x = x;
        this.liters = y;
    }

    public double getX(){ return this.x; }
    public double getLiters(){ return this.liters;}
    public double getConsumption(){ return this.consumption;}
//    public void setLiters(double liters){ this.liters = liters;}
    public void move(double km){
        double fuel = km/this.consumption;
        if(fuel<this.liters){
            this.liters-=fuel;
            this.x+=km;
        }else{
            this.x += consumption*this.liters;
            this.liters = 0;
        }
    }

    public void addFuel(double fuel){
        if(fuel>=0)
            this.liters+=fuel;
    }


    public static void main(String[] args) {

    }
}
