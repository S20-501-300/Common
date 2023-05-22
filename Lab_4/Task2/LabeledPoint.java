package Task2;

import Task2.Point;

public class LabeledPoint extends Point {
    String label;
    public LabeledPoint(String label, double x, double y){
        super(x, y);
        this.label = label;
    }

    String getLabel(){ return this.label; }

    public String toString(){
        return this.getClass().getName() + " [label=" + getLabel() + " ,X=" + getX() + " ,Y=" + getY() + "]";
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
        LabeledPoint other = (LabeledPoint) obj;

        return Double.compare(this.getX(), other.getX())==0 && Double.compare(this.getY(), other.getY())==0;

    }

    public int hashCode(){
        Double x1 = Double.valueOf(this.getX());
        Double y1 = Double.valueOf(this.getY());

        int hash = this.label.hashCode() + x1.hashCode() + y1.hashCode();
        return hash;
    }
}