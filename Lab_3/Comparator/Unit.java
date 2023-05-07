public class Unit {
    final private int measure;
    final private int second;
    Unit(int a, int b){
        this.measure = a;
        this.second = b;
    }
    public int getMeasure(){
        return measure;
    }
    public int getSecond(){
        return second;
    }
    
    @Override
    public String toString(){
        return "measure: " + measure + ", second: " + second;
    }
}
