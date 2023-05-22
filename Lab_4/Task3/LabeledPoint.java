package Task3;



public class LabeledPoint extends Point {
    String label;
    public LabeledPoint(String label, double x, double y){
        super(x, y);
        this.label = label;
        
        System.out.println("X from Labeled Point equals " + this.x);
    }

    public String getLabel(){ return this.label; }
    public double getSumOfXAndYFromLabeledPoint() { return x + y; }

    public String toString(){
        return this.getClass().getName() + " [label=" + label + " ,X=" + x + " ,Y=" + y + "]";
    }

    @Override
    public boolean equals(Object obj) {
        //Быстрая проверка на сходство
        if(this == obj)
            return true;
        //Проверка на пустое множество
        if(obj == null)
            return false;
        //Проверка на схожесть типов(относится obj  к типу Point
        if(getClass() != obj.getClass())
            return false;
        Task2.LabeledPoint other = (Task2.LabeledPoint) obj;

        return Double.compare(this.getX(), other.getX())==0 && Double.compare(this.getY(), other.getY())==0;

    }

    public int hashCode(){
        Double x1 = Double.valueOf(this.getX());
        Double y1 = Double.valueOf(this.getY());

        int hash = this.label.hashCode() + x1.hashCode() + y1.hashCode();
        return hash;
    }
}